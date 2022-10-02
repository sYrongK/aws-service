package com.syrongk.aws.controller.front;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/*
JUnit LifeCycle
JUnit 테스트의 생명주기는 기본적으로 method 단위이다.
org.junit.jupiter.api.@TestInstance.LifeCycle > PER_METHOD, PER_CLASS
 -> class 단위로 구성 가능하겠네.

이 생명주기를 설정하는 것을 extension하는 것이라고 보고,
커스텀할 경우 @ExtendWith(커스텀클래스.class)로 커스텀 공통 설정을 지정할 수 있고
생명주기 시점을 골라서 커스텀 설정을 하고 싶은 경우
org.junit.jupiter.api.extension에서 제공하는 @XXXCallback 중에 골라서 설정하면 된다.

이 @XXXCallback과 일치하는 이름의 org.junit.jupiter.api가 제공하는 annotatione들이 있는데,
그 annotations이 실행되기 보다 전 혹은 후에 추가 동작을 설정하는 Class들을 지정하는 거라고 보면 될 것 같음.

 */
@ExtendWith(SpringExtension.class)//Ju
@WebMvcTest(controllers = HelloController.class)
class HelloControllerTest {

    @Autowired
    private MockMvc mvc;//Spring MVC Test Endpoint

    @Test
    void return_hello() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }
}