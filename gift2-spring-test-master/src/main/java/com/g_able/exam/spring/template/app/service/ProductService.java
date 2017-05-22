package com.g_able.exam.spring.template.app.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.g_able.exam.spring.tamplate.app.model.Product;

@Transactional
public interface ProductService {
	 
	List<Product> findAll();
	 
	 
	
	


}
