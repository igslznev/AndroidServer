package com.dreamteam.androidServer.controller;

import com.dreamteam.androidServer.entity.MyEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public MyEntity getHello() {
        return createMyEntity();
    }

    private MyEntity createMyEntity() {
        MyEntity entity = new MyEntity();
        entity.setId(1);
        entity.setName("Vasya");

        return entity;
    }
}
