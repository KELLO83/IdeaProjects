package com.example.spring_fifty_edition.tacos.Web;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.example.spring_fifty_edition.tacos.Ingredient;
import com.example.spring_fifty_edition.tacos.Order;
import com.example.spring_fifty_edition.tacos.Taco;
import com.example.spring_fifty_edition.tacos.data.IngredientRepository;
import com.example.spring_fifty_edition.tacos.data.TacoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import org.springframework.validation.Errors; // 유효성 검사 규칙 선언
import javax.validation.Valid;

import com.example.spring_fifty_edition.tacos.Ingredient.Type;
import org.springframework.beans.factory.annotation.Autowired;


@Slf4j // default adding Compile lambok 로그 기록
@Controller // Componet discriminate
@RequestMapping("/design")  // Request Mapping /desing path
@SessionAttributes("order")
public class DesignTacoController {
    private   IngredientRepository ingredientRepo;
    private   TacoRepository tacoRepo;
    @Autowired // Dependency Injection
    public DesignTacoController(IngredientRepository ingredientRepo , TacoRepository tacoRepository){

        this.ingredientRepo = ingredientRepo;
        this.tacoRepo = tacoRepository;
    }
    @PostMapping
    public  String processDesiogn(@Valid  Taco design , Errors errors , @ModelAttribute Order order){
        // 삭제 기능 추가  대기...
        if(errors.hasErrors()){ // 유효성 검사 실행
            return "design"; // 유효성 검사 실패시 design.html로 이동
        }
        log.info("Processing design: " + design);


        Taco saved = tacoRepo.save(design); // 사용자가 입력한 taco 객체를  db 저장
        order.addDesign(saved); // order 객체에 taco 객체를 추가

        return "redirect:/orders/current";
    }

    @ModelAttribute
    public void addIngredientsToModel(Model model) {
         //Db 코드 추가로 인한 삭제
//        List<Ingredient> ingredients = Arrays.asList(
//                new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.WRAP),
//                new Ingredient("COTO", "Corn Tortilla", Ingredient.Type.WRAP),
//                new Ingredient("GRBF", "Ground Beef", Ingredient.Type.PROTEIN),
//                new Ingredient("CARN", "Carnitas", Ingredient.Type.PROTEIN),
//                new Ingredient("TMTO", "Diced Tomatoes", Ingredient.Type.VEGGIES),
//                new Ingredient("LETC", "Lettuce", Ingredient.Type.VEGGIES),
//                new Ingredient("CHED", "Cheddar", Ingredient.Type.CHEESE),
//                new Ingredient("JACK", "Monterrey Jack", Ingredient.Type.CHEESE),
//                new Ingredient("SLSA", "Salsa", Ingredient.Type.SAUCE),
//                new Ingredient("SRCR", "Sour Cream", Ingredient.Type.SAUCE)
//        );

    }

    //Model 객체는 Controller 에서 생성된 데이터를 담아 View 로 전달할 때 사용하는 객체이다.
    //※ Servlet의 request.setAttribute() 와 비슷한 역할을 함
    //addAttribute("key", "value") 메서드를 이용해 view에 전달할 데이터를 key, value형식으로 전달할 수 있다.

    @ModelAttribute(name = "order")
    public Order order(){
        return new Order();
    }
    @ModelAttribute(name = "taco")
    public Taco taco(){
        return new Taco();
    }
    @GetMapping
    public  String showDesignForm(Model model) {
        List<Ingredient> ingredients = new ArrayList<>();
        ingredientRepo.findAll().forEach(i -> ingredients.add(i)); // DB 가져오기

        Type[] types = Ingredient.Type.values();
        for (Type type : types) {
            model.addAttribute(type.toString().toLowerCase(),
                    filterByType(ingredients, type));
        }

        model.addAttribute("design", new Taco());
        return "design"; // return view locial name
    }



    private List<Ingredient> filterByType(List<Ingredient> ingredients, Ingredient.Type type) {
        return ingredients.stream().filter(x -> x.getType().equals(type)).collect(Collectors.toList()); // Ingrediens  type 을 stream 변환후 list 변환
        /*
        filter() 메서드는 새로운 스트림을 반환합니다. 스트림이 아닌 List로 반환받고 싶다면,
        filter() 메서드 뒤에 Collectors.toList()를 매개변수로 가지는 collect() 메서드를 호출합니다.
         */
    }
}



