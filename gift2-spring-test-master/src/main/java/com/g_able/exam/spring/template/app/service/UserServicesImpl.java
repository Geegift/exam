package com.g_able.exam.spring.template.app.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.g_able.exam.spring.tamplate.app.model.Users;

@Service
@Transactional
public class UserServicesImpl {
	/**
	 *
	@Autowired
	private UserRepository userRepository;
 
 
	@Override
	public List<User> saveAll(List<User> plans) {
		return userRepository.save(plans);
	}

	@Override
	public User findById(Integer id) {
		return userRepository.findOne(id);
	}

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public User save(User plan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}*/
}
