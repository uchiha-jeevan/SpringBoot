package com.example.webapp.service;

import com.example.webapp.model.Product;
import com.example.webapp.repo.Productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {

    @Autowired
    Productrepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(1,"Phone",5000),
//            new Product(2,"Camera",4000),
//            new Product(4,"Camera",4000)
//            ));


    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
    return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
