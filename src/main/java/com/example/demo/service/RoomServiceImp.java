package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repo.IRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImp implements IRoomService{
    @Autowired
    IRoomRepository roomRepository;
    @Override
    public List<Product> getAll() {
        return roomRepository.findAll();
    }

    @Override
    public List<Product> searchByName(String name) {
        return roomRepository.findAllByName(name);
    }
}
