package com.itheima.dao;

import com.itheima.domain.Product;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao {
    List<Product> findAll(String productName) throws Exception;

    void save(Product product);

    void delete(String[] ids);

    void open(String[] ids);

    void close(String[] ids);
}
