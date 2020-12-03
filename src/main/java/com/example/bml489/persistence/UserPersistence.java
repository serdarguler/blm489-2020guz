package com.example.bml489.persistence;

import com.example.bml489.entity.Ogrenci;
import com.example.bml489.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserPersistence extends CrudRepository<User,Integer> {

    public User findByUsername(String kullaniciAdi);
}
