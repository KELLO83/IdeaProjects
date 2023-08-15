package com.example.spring.Controller;


import com.example.spring.Actor;
import com.example.spring.City;
import com.example.spring.data.ActorRepository;
import com.example.spring.data.CityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/DB")
public class TestController {

    private final ActorRepository actorRepository;

    private final CityRepository cityRepository;

    @Autowired
    public  TestController(ActorRepository actorRepository , CityRepository cityRepository){
        this.actorRepository = actorRepository;
        this.cityRepository = cityRepository;
    }
    @GetMapping()
    public String showTestView(Model model){
        log.info("TestController showTestView() called");
        Iterable<Actor> actors = actorRepository.findAll();
        model.addAttribute("actors", actors);
        log.info(actors.toString());
        return  "show";
    }
    @GetMapping("/city")
    public String showCityView(Model model){
        log.info("TestController showCityView() called");
        Iterable<City> citys = cityRepository.findAll();
        log.info("City 로그 출력");
        log.info(citys.toString());
        model.addAttribute("city", citys);
        return  "city";
    }
}
