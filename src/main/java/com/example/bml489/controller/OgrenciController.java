package com.example.bml489.controller;

import com.example.bml489.entity.Ders;
import com.example.bml489.entity.Ogrenci;
import com.example.bml489.service.OgrenciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/api/ogrenci")
public class OgrenciController {
    @Autowired
    private OgrenciService ogrenciService;

    @RequestMapping(value = "",method = RequestMethod.POST)
    public @ResponseBody HttpStatus createOgrenci(@RequestBody Ogrenci ogrenci){
        ogrenciService.createOgrenci(ogrenci);
        return  HttpStatus.OK;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public @ResponseBody Ogrenci readOgrenci(@PathVariable int id){
        return ogrenciService.readOgrenci(id);
    }

    @RequestMapping(value = "",method = RequestMethod.PUT)
    public @ResponseBody HttpStatus updateOgrenci(@RequestBody Ogrenci ogrenci){
        ogrenciService.updateOgrenci(ogrenci);
        return  HttpStatus.OK;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public @ResponseBody HttpStatus deleteOgrenci(@PathVariable int id){
        ogrenciService.deleteOgrenci(id);
        return HttpStatus.OK;
    }

}
