package com.itheima.service;

import com.itheima.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll(String productName) throws Exception;

    void save(Product product) throws Exception;

    void delete(String[] ids);

    void open(String[] ids);

    void close(String[] ids);
}
