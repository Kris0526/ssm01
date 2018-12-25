package com.itheima.controller;

import com.itheima.domain.Product;
import com.itheima.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    //查询所有及条件查搜寻
    @RequestMapping("/findAll")
    public ModelAndView findAll(String productName) throws Exception {
        List<Product> productList = productService.findAll(productName);
        ModelAndView mv = new ModelAndView();
        mv.addObject("productList", productList);
        mv.addObject("condition", productName);
        mv.setViewName("product-list");
        return mv;
    }

    //保存用户
    @RequestMapping("/save")
    public String save(Product product) throws Exception {
        productService.save(product);
        return "redirect:/product/findAll";
    }

    @RequestMapping("/delete")
    public String delete(String ids) {
        String idsStr = ids.substring(4);
        String[] idsArr = idsStr.split(",");
        productService.delete(idsArr);
        return "redirect:/product/findAll";
    }

    @RequestMapping("/open")
    public String open(String ids) {
        String idsStr = ids.substring(4);
        String[] idsArr = idsStr.split(",");
        productService.open(idsArr);
        return "redirect:/product/findAll";
    }

    @RequestMapping("/close")
    public String close(String ids) {
        String idsStr = ids.substring(4);
        String[] idsArr = idsStr.split(",");
       productService.close(idsArr);
        return "redirect:/product/findAll";
    }
}
