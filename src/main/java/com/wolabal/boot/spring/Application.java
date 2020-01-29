package com.wolabal.boot.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    /* 스프링 부트의 자동 설정, 스프링 빈 읽기 설정 등이 필요하여 프로젝트 제일 상단에 작성이 되어 있어야 함 */
    public static void main(String[] args){
        SpringApplication.run(Application.class , args);
        // SpringApplcation.run 으로 설정이 되어 내장 WAS를 호출하여 실행한다

    }
}
