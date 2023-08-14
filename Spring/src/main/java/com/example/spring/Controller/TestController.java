package com.example.spring.Controller;


import com.example.spring.Actor;
import com.example.spring.data.ActorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Slf4j
@RequestMapping("/DB")
public class TestController {

    private final ActorRepository actorRepository;

    @Autowired
    public  TestController(ActorRepository actorRepository){
        this.actorRepository = actorRepository;
    }
    @GetMapping()
    public String showTestView(Model model){
        log.info("TestController showTestView() called");
        Iterable<Actor> actors = actorRepository.findAll();
        model.addAttribute("actors", actors);
        log.info(actors.toString());
        return  "show";
    }
}
