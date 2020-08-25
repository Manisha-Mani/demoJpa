package com.example.demoJpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoJpa.dao.ProductDao;
import com.example.demoJpa.dto.ProductDTO;
import com.example.demoJpa.entity.ProductEntity;

@Service
public class ProdcutService {

	@Autowired
	private ProductDao productDao;
	
	public List <ProductDTO> selectAllProducts(){
		
		List <ProductEntity> entityList=productDao.findAll();
		List <ProductDTO> dtoList=new ArrayList<>();
		
		for(ProductEntity entity:entityList){
			ProductDTO dto = new ProductDTO();
			BeanUtils.copyProperties(entity, dto);
			dtoList.add(dto);
		}
		return dtoList;
	}
	
	public ProductDTO SelectById(Integer id) {
		ProductEntity entity= productDao.getOne(id);
		ProductDTO dto = new ProductDTO();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}
	
	public ProductDTO insertProduct(ProductDTO dto) {
		ProductEntity entity=new ProductEntity();
		BeanUtils.copyProperties(entity, dto);
		ProductEntity saveEntity=productDao.save(entity);
		BeanUtils.copyProperties(saveEntity, dto);
		return dto;
	}
	
	public ProductDTO updateProduct(ProductDTO dto) {
		ProductEntity entity= productDao.getOne(dto.getProdId());
		BeanUtils.copyProperties(dto, entity);
		productDao.save(entity);
		return dto;
	}
	
	public ProductDTO deleteProduct(Integer id) {
		ProductEntity entity= productDao.getOne(id);
		productDao.delete(entity);
		ProductDTO dto = new ProductDTO();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}
}
