package com.example.bml489.service;

import com.example.bml489.entity.Ders;
import com.example.bml489.entity.Ogrenci;
import com.example.bml489.persistence.OgrenciPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OgrenciService {

    @Autowired
    OgrenciPersistence ogrenciPersistence;

    public void createOgrenci(Ogrenci ogrenci){
        ogrenciPersistence.save(ogrenci);
    }

    public Ogrenci readOgrenci(int id){
        return ogrenciPersistence.findById(id).get();
    }

    public void updateOgrenci(Ogrenci ogrenci){
        if(ogrenci.getId() < 1){
            return;
        }
        ogrenciPersistence.save(ogrenci);
    }

    public void deleteOgrenci(int id){
        ogrenciPersistence.deleteById(id);
    }

    public List<Ogrenci> readAll(){
        return (List) ogrenciPersistence.findAll();
    }

}
