package vn.hoidanit.laptopshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.hoidanit.laptopshop.domain.Products;
import vn.hoidanit.laptopshop.repository.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Products handleSaveProduct(Products products) {
        return this.productRepository.save(products);
    }

    public List<Products> getAllProduct() {
        return this.productRepository.findAll();
    }
}
