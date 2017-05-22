package com.g_able.exam.spring.template.app.service;
import java.util.List;

import com.g_able.exam.spring.tamplate.app.model.Product;
import com.g_able.exam.spring.template.app.repository.HibernateProductRepositoryImpl;
import com.g_able.exam.spring.template.app.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
	 private ProductRepository productRepository = new HibernateProductRepositoryImpl();
     public List<Product> findAll() {
          return productRepository.findAll();
     }

}
