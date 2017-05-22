package com.g_able.exam.spring.template;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.g_able.exam.spring.template.app.service.ProductService;
import com.g_able.exam.spring.template.app.service.ProductServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Test
	public void contextLoads() {
	}

	public static void main(String[] args) {
		ProductService service = new ProductServiceImpl();
	    System.out.println(service.findAll().get(0).getName());
	    System.out.println(service.findAll().get(0).getDetail());
	    System.out.println(service.findAll().get(0).getPrice());
	}
}
