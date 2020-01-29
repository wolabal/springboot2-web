package com.wolabal.boot.spring.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class) // 테스트를 진행할때 JUnit에 내장된 실행자 외에 다른 실행자를 실행시킨다 사용 실행자 .SrpingRunner.class
@WebMvcTest // Web ( Spring MVC) 에 집중할 수 있는 어노테이션   (@Controller, @ControllerAdbvice는 사용가능  @Sevice ,@Component, @Repository는 사용 못함)
public class HelloControllerTest {

    @Autowired  // Srping been 주입
    private  MockMvc mvc;  // 웹 API를 테스틀 할때 사용함 HTTP GET, POST 등에 대한 API 테스트를 할 수 있음

    @Test
    public void hello가_리턴된다() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello")) //MockMvc를 통해 '/hello' 주소로 HTTP GET 요청을 함
                .andExpect(status().isOk())  // mvc.perform의 결과 검증  Http status 가 200 인지 여부 확인
                .andExpect(content().string(hello)); // mvc.perform 의 결과가  "hello"인지 여부
    }
}
