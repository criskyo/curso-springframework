package com.geekshubsacademy.spring.v01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class CursoSpringframeworkApplication {

	public static void main(String[] args) {
		args = new String[] {"--spring.profiles.active=v01"};
		SpringApplication.run(CursoSpringframeworkApplication.class, args);
	}
	
    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

}
