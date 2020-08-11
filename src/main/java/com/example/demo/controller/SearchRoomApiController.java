package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchRoomApiController {
    @Autowired
    IRoomService roomService;
    @GetMapping("/hello")
    public String hello(@RequestParam(name="a",required = true) String name){
        return "Hello"+name;
    }

    @GetMapping("/search")
    public List<Product> searchRoom(@RequestParam(name="roomname",required = true,defaultValue = "abc5") String name){
        return roomService.searchByName(name);
    }
}
