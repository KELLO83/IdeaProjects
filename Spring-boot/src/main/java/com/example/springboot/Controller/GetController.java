package com.example.springboot.Controller;


import com.example.springboot.dto.MemberDto;
import io.swagger.annotations.ApiOperation;
import lombok.extern.java.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/v1/get-api")
public class GetController {


    private final Logger LOGGER = LoggerFactory.getLogger(GetController.class);
    @RequestMapping(value = "/home" , method = RequestMethod.GET)
    @GetMapping("/home")
    public String getHome(){
        LOGGER.info("로그 출력 확인하기");
        return "home";
    }

    @GetMapping(value = "/request3")
    public String getRequestParam3(MemberDto memberDTO) {
        return memberDTO.toString();
    }

}
