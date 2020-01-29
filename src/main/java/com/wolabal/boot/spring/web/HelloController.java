package com.wolabal.boot.spring.web;

import com.wolabal.boot.spring.web.Dto.HelloDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController
 *  - 컨트롤러를 json을 반환하는 컴트롤러로 만들어 줌
 */
@RestController
public class HelloController {

    /**
     * @GetMapping
     *  - HTTP Method 인 Get의 요청을 받을 수 있는 API를 만들어 줌
     */
    @GetMapping("/hello")
    public String hello(){
     return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloDto helloDto(@RequestParam("name") String name , @RequestParam("amount") int amount){
        return new HelloDto(name, amount);
    }
}
