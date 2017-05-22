package com.g_able.exam.spring.template.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.g_able.exam.spring.tamplate.app.model.Users;

@Transactional
public interface UserRepository extends CrudRepository<Users,Long>{
	public Users findByEmail(String email);
}


