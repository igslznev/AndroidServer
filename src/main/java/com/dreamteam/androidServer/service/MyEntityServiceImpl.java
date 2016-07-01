package com.dreamteam.androidServer.service;

import com.dreamteam.androidServer.entity.MyEntity;
import com.dreamteam.androidServer.repository.MyEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyEntityServiceImpl implements MyEntityService {

    @Autowired
    private MyEntityRepository repository;

    public List<MyEntity> getAll() {
        return repository.findAll();
    }

    public MyEntity getByID(long id) {
        return repository.findOne(id);
    }

    public MyEntity save(MyEntity entity) {
        return repository.saveAndFlush(entity);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
