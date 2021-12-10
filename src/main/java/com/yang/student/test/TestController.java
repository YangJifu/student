package com.yang.student.test;

import com.yang.student.mybatisPlus.entity.User;

public class TestController {
    public static void main(String[] args) throws Exception{
        User name = User.builder()
                .email("1")
                .age(11)
                .name("1")
                .build();
        name.setAge(14);
        System.out.println(name);
    }
}
