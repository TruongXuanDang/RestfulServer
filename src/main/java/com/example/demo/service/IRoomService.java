package com.example.demo.service;

import com.example.demo.entity.Product;

import java.util.List;


public interface IRoomService {
    public List<Product> getAll();
    public List<Product> searchByName(String name);

}
