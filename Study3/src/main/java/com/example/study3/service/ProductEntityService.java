package com.example.study3.service;

import com.example.study3.dao.ProductDao;
import com.example.study3.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductEntityService {
    private final ProductDao productDao;

    public Product save(Product product){
        return productDao.save(product);
    }
    public List<Product> findAll(){
        return productDao.findAll();
    }
}
