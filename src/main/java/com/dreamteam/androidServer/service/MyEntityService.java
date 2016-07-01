package com.dreamteam.androidServer.service;

import com.dreamteam.androidServer.entity.MyEntity;

import java.util.List;

public interface MyEntityService {
    List<MyEntity> getAll();
    MyEntity getByID(long id);
    MyEntity save(MyEntity entity);
    void remove(long id);
}
