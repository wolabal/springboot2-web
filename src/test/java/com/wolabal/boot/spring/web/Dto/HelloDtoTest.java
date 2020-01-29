package com.wolabal.boot.spring.web.Dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloDtoTest {

    @Test
    public void 롬복_기능_테스트(){
        // getter
        String name = "test";
        int amount = 100 ;

        // when
        HelloDto dto = new HelloDto( name, amount);

        // then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
