package com.dreamteam.androidServer.controller;

import com.dreamteam.androidServer.entity.MyEntity;
import com.dreamteam.androidServer.service.MyEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private MyEntityService service;

    @RequestMapping(value = "/entities", method = RequestMethod.GET)
    @ResponseBody
    public List<MyEntity> getAllReminders() {
        return service.getAll();
    }

    @RequestMapping(value = "/entities/{id}", method = RequestMethod.GET)
    @ResponseBody
    public MyEntity getReminder(@PathVariable long id) {
        return service.getByID(id);
    }

    @RequestMapping(value = "/entities", method = RequestMethod.POST)
    @ResponseBody
    public MyEntity saveRemider(@RequestBody MyEntity entity) {
        return service.save(entity);
    }

    @RequestMapping(value = "/entities/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.remove(id);
    }

}
