package com.g_able.exam.spring.template.app.repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.g_able.exam.spring.tamplate.app.model.Product;

public class HibernateProductRepositoryImpl implements ProductRepository {
	public List<Product> findAll() {
        List<Product> products = new ArrayList<Product>();
        Product product = new Product();
        product.setId(001);
        product.setName("Hello1");
        product.setDetail("test11111111 OK");
        product.setPrice(300);
        products.add(product);
        return products;
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInBatch(Iterable<Product> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findAll(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Product> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Product> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product getOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Product> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Product> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Product> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Long arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Product> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product findOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Product> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Product> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Product> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Product> S findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findOne(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}
}
