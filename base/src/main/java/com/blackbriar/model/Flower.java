package com.blackbriar.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Flower entity. @author MyEclipse Persistence Tools
 */

public class Flower{

	// Fields

	private Integer flowerid;
	private String flowername;
	private Integer price;
	private String picture;

	// Constructors

	/** default constructor */
	public Flower() {
	}

	/** full constructor */
	public Flower(String flowername, Integer price,
			String picture, Set orderitems) {
		this.flowername = flowername;
		this.price = price;
		this.picture = picture;
	}

	// Property accessors

	public Integer getFlowerid() {
		return this.flowerid;
	}

	public void setFlowerid(Integer flowerid) {
		this.flowerid = flowerid;
	}


	public String getFlowername() {
		return this.flowername;
	}

	public void setFlowername(String flowername) {
		this.flowername = flowername;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}


}