package com.example.art.repo;

import com.example.art.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {
    @Query(value="SELECT name FROM Product WHERE price BETWEEN 15 AND 30 ORDER BY price ASC LIMIT 2",nativeQuery = true)
    List<String> top2in15and30price();

}