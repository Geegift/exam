package com.g_able.exam.spring.template.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.g_able.exam.spring.tamplate.app.model.Users;
import com.g_able.exam.spring.template.app.repository.UserRepository;

@Controller
public class UserControllers {
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String Agenda(Model model) {
		
		
		model.addAttribute("Users", new Users());
		return "Users";
	}

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/create" , method = RequestMethod.GET)
	@ResponseBody
	public String create(@RequestParam("username") String username,
			@RequestParam("password") String password,
			@RequestParam("fullname") String fullname, 
			@RequestParam("address") String address, 
			@RequestParam("email") String email) {
		Users users = null;
		try {
			users = new Users(username,password,fullname,address,email);
			userRepository.save(users);
		} catch (Exception ex) {
			return "Error creating the user: " + ex.toString();
		}
		return "User successfully created! (id =" + users.getId() + ")";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String delete(long id) {
		try {
			Users user = new Users(id);
			userRepository.delete(user);
		} catch (Exception ex) {
			return "Error deleting the user:" + ex.toString();
		}
		return "User succesfully deleted!";
	}

	@RequestMapping("/get-by-email")
	@ResponseBody
	public String getByEmail(String email) {
		String userId;
		try {
			Users user = userRepository.findByEmail(email);
			userId = String.valueOf(user.getId()) + "<br /> Email:" + user.getEmail() + "<br/> toString:"
					+ user.toString();
		} catch (Exception ex) {
			return "User not found";
		}
		return "The user id is: " + userId;
	}

	@RequestMapping("/update")
	@ResponseBody
	public String updateUser(long id, String email, String name) {
		try {
			Users user = userRepository.findOne(id);
			user.setEmail(email);
			user.setName(name);
			userRepository.save(user);
		} catch (Exception ex) {
			return "Error updating the user: " + ex.toString();
		}
		return "User succesfully updated!";
	}

	@RequestMapping("/")
	@ResponseBody
	private Iterable<Users> add() {
		return userRepository.findAll();
	}
}