package vn.hoidanit.laptopshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.hoidanit.laptopshop.domain.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Long> {
    Products save(Products dataProducts);
}
