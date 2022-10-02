package com.syrongk.aws.controller.front;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@ResponseBoby -> return값이 Response의 body에 바인딩 되도록 해준다.
 */
@RestController//@Controller + @ResponseBody
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello() {
        return "hello";
    }
}