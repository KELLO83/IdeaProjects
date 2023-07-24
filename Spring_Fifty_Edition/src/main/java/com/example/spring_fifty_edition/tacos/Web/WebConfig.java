package com.example.spring_fifty_edition.tacos.Web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration // Componet Scanning 을 통해 Bean 으로 등록
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/home").setViewName("home");
        //Home Controller 대체코드 home.html 을 반환
        //addViewController() 는 하나이상의 뷰 컨트롤러를 등록하는 메서드
        // addViewController 코드로 HomeController 를 대체할 수 있다. @Controller 를 사용하지 않아도 된다.
    }
}
