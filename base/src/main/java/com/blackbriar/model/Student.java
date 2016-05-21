package com.blackbriar.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "student", catalog = "stumis")
public class Student implements java.io.Serializable {

	// Fields

	private Integer id;
	private Area area;
	private Prof prof;
	private Department department;
	private Picture picture;
	private String idcard;
	private String sno;
	private String username;
	private String realname;
	private String sex;
	private String password;
	private String mobile;
	private String email;
	private String address;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** full constructor */
	public Student(Integer id, Area area, Prof prof, Department department,
			Picture picture, String idcard, String sno, String username,
			String realname, String sex, String password, String mobile,
			String email, String address) {
		super();
		this.id = id;
		
		this.area = area;
		this.prof = prof;
		this.department = department;
		this.picture = picture;
		
		
		this.idcard = idcard;
		
		this.sno = sno;
		this.username = username;
		this.realname = realname;
		this.sex = sex;
		this.password = password;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "areaId")
	public Area getArea() {
		return this.area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "picId")
	public Picture getPicture() {
		return picture;
	}

	public void setPicture(Picture picture) {
		this.picture = picture;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "depId")
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "proId")
	public Prof getProf() {
		return prof;
	}

	public void setProf(Prof prof) {
		this.prof = prof;
	}

	@Column(name = "iDCard", length = 18)
	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	@Column(name = "sno", length = 10)
	public String getSno() {
		return this.sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	@Column(name = "username", length = 20)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "realname", length = 20)
	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}
	
	
	@Column(name = "sex", length = 20)
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column(name = "password", length = 20)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "mobile", length = 13)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "email", length = 20)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "address", length = 50)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}