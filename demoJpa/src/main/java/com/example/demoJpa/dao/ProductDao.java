package com.example.demoJpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoJpa.entity.ProductEntity;
//no need to write code as Springboot will create classes at background
public interface ProductDao extends CrudRepository<ProductEntity, Integer>{

}
