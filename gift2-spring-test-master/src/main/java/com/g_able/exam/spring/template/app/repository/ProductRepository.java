package com.g_able.exam.spring.template.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.g_able.exam.spring.tamplate.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
   
	
	List<Product> findAll();
	List<Product> findByName(String name);
	List<Product> findOne(long id);

	public Product save(Product product); 

	public void delete(Product product);
	
	

}
