package com.example.bml489.controller;

import com.example.bml489.entity.Ders;
import com.example.bml489.service.DersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/api/ders")
public class DersController {
    @Autowired
    private DersService dersService;

    @RequestMapping(value = "",method = RequestMethod.POST)
    public @ResponseBody HttpStatus createDers(@RequestBody Ders ders){
        dersService.createDers(ders);
        return  HttpStatus.OK;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public @ResponseBody Ders readDers(@PathVariable int id){
        return dersService.readDers(id);
    }

    @RequestMapping(value = "",method = RequestMethod.PUT)
    public @ResponseBody HttpStatus updateDers(@RequestBody Ders ders){
        dersService.updateDers(ders);
        return  HttpStatus.OK;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public @ResponseBody HttpStatus deleteDers(@PathVariable int id){
        dersService.deleteDers(id);
        return HttpStatus.OK;
    }

}
