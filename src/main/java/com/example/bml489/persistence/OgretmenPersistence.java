package com.example.bml489.persistence;

import com.example.bml489.entity.Ogretmen;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OgretmenPersistence extends CrudRepository<Ogretmen,Integer> {

    public List<Ogretmen> findAllBySicilNo(String sicilno);

    @Query(value = "select * from ogretmen o where o.sicil_no=:sicilno",nativeQuery = true)
    public List<Ogretmen> sicileGoreBul(String sicilno);



}
