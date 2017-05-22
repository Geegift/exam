package com.g_able.exam.spring.tamplate.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull
	private String name;

	@NotNull
	private String detail;

	@NotNull
	private int price;

	@NotNull
	private String type;

	@NotNull
	private String img;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;

	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", detail=" + detail + ", + price=" + price + "]";
	}

	public Product(long id) {
		super();
		this.id = id;
	}

	public Product(String name, String detail, int price) {
		super();
		this.name = name;
		this.detail = detail;
		this.price = price;
	}

	public Product(long id, String name, String detail, int price) {
		super();
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.price = price;
	}

	public Product() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

}
