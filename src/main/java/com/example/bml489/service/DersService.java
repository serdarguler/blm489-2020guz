package com.example.bml489.service;

import com.example.bml489.entity.Ders;
import com.example.bml489.persistence.DersPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DersService {

    @Autowired
    DersPersistence dersPersistence;

    public void createDers(Ders ders){
        dersPersistence.save(ders);
    }

    public Ders readDers(int id){
        return dersPersistence.findById(id).get();
    }

    public void updateDers(Ders ders){
        if(ders.getId() == null){
            return;
        }
        dersPersistence.save(ders);
    }

    public void deleteDers(int id){
        dersPersistence.deleteById(id);
    }

}
