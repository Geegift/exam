package com.g_able.exam.spring.template.app.service;

import java.util.List;


import com.g_able.exam.spring.tamplate.app.model.Users;

public interface UserService {
	public List<Users> findByUserName(String username);
	
	public Users save(Users plan);
	
	public Users findById(Integer id);
	
	public void deleteById(Integer id);

	List<Users> saveAll(List<Users> plans);

	

}
