package com.example.bml489.persistence;

import com.example.bml489.entity.Ogrenci;
import org.springframework.data.repository.CrudRepository;

public interface OgrenciPersistence extends CrudRepository<Ogrenci,Integer> {

}
