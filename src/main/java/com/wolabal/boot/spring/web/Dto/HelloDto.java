package com.wolabal.boot.spring.web.Dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloDto {


    private final String name;

    private final int amount;


}
