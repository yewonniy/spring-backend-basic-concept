package com.yeye.review.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResponseApi {

    @GetMapping("/test/response/string")
    public String stringResponse() {
        return "This is String";
    }

    @GetMapping("/test/response/json")
    public TestResponseBody jsonResponse() {
        return new TestResponseBody("yewonniy", 22);
    }

    public static class TestResponseBody {
        String name;
        Integer age;

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public TestResponseBody(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }
}
