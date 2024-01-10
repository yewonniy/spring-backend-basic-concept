package com.yeye.review.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestRequestApi {

    // Request Parameter 방식
    @GetMapping("/test/param")
    public String requestParam(
            @RequestParam("name") String name,
            @RequestParam("age") Integer age
    ) {
        return "Hello, Request Param, I am "+ name + ", " + age;
    }

    // path variable 방식 (path를 변수처럼 사용한다. path란? localhost:8080 뒷부분!)
    @GetMapping("/test/path/{name}/{age}")
    public String requestPathVariable(
            @PathVariable("name") String name,
            @PathVariable("age") Integer age
    ) {
        return "Hello, path variable, I am " + name + ", " + age;
    }

    // Request Body 방식
    @PostMapping("/test/body")
    public String requestBody(
            @RequestBody TestRequestBody request
    ) {
        return "Hello, Request Body, I am "+ request.name + ", " + request.age;
    }

    public static class TestRequestBody {
        String name;
        Integer age;

        // request body 방식은 생성자가 꼬옥 있어야 함!
        public TestRequestBody(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }
}
