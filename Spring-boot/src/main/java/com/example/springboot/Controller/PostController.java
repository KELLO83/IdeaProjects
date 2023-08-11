package com.example.springboot.Controller;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

    private final Logger Logger = org.slf4j.LoggerFactory.getLogger(PostController.class);
    @RequestMapping(value = "/domain", method = RequestMethod.POST )
    public String postExample(){

        return "Hello Post API";
    }

    @PostMapping(value = "/domain/post")
    public  String postMethod(@RequestBody  Map<String , Object> data){

        StringBuilder sb = new StringBuilder();
        data.entrySet().forEach(entry -> {
            sb.append("key : " + entry.getKey() + "value : " + entry.getValue());
        });


        return  sb.toString();

    }
}
