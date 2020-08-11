package com.example.demo.repo;

import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IRoomRepository extends JpaRepository<Product,Integer> {
    public List<Product> findAllByName(String name);
}