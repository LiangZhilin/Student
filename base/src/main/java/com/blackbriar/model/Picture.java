package com.blackbriar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Picture entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "picture", catalog = "stumis")
public class Picture implements java.io.Serializable {

	// Fields

	private Integer id;
	private String picName;
	private String picUrl;
	private String remark;

	// Constructors

	/** default constructor */
	public Picture() {
	}

	/** full constructor */
	public Picture(String picName, String picUrl, String remark) {
		this.picName = picName;
		this.picUrl = picUrl;
		this.remark = remark;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "picName", length = 20)
	public String getPicName() {
		return this.picName;
	}

	public void setPicName(String picName) {
		this.picName = picName;
	}

	@Column(name = "picUrl", length = 20)
	public String getPicUrl() {
		return this.picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	@Column(name = "remark", length = 20)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}