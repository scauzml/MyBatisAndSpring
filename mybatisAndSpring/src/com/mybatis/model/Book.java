package com.mybatis.model;

import java.io.Serializable;
import java.util.Date;


public class Book implements Serializable{

	private Integer id;
	private String name;
	private String autor;
	private Date publicationdate;
	private String publication;
	private Double price;
	private String image;
	private String remark;
	public Book(Integer id, String name, String autor, Date publicationdate, String publication, Double price,
			String image, String remark) {
		super();
		this.id = id;
		this.name = name;
		this.autor = autor;
		this.publicationdate = publicationdate;
		this.publication = publication;
		this.price = price;
		this.image = image;
		this.remark = remark;
	}
	public Book() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Date getPublicationdate() {
		return publicationdate;
	}
	public void setPublicationdate(Date publicationdate) {
		this.publicationdate = publicationdate;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
