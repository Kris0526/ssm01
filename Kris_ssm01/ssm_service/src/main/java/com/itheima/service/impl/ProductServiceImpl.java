package com.itheima.service.impl;

import com.itheima.dao.ProductDao;
import com.itheima.domain.Product;
import com.itheima.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> findAll(String productName) throws Exception {
        return productDao.findAll(productName);
    }

    @Override
    public void save(Product product) throws Exception {
        productDao.save(product);
    }

    @Override
    public void delete(String[] ids) {
        productDao.delete(ids);
    }

    @Override
    public void open(String[] ids) {
        productDao.open(ids);
    }

    @Override
    public void close(String[] ids) {
        productDao.close(ids);
    }
}
