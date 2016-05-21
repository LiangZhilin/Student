package com.blackbriar.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "department")
public class Department implements java.io.Serializable {

	// Fields

	private Integer id;
	private String dname;
	private String dmanager;
	private String address;
	private String tel;
	private Integer pid;
	private Set<Student> students = new HashSet<Student>(0);

	// Constructors

	/** default constructor */
	public Department() {
	}

	/** full constructor */
	public Department(String dname, String dmanager, String address,
			String tel, Integer pid, Set<Student> students) {
		this.dname = dname;
		this.dmanager = dmanager;
		this.address = address;
		this.tel = tel;
		this.pid = pid;
		this.students = students;
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

	@Column(name = "text", length = 20)
	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Column(name = "dManager", length = 20)
	public String getDmanager() {
		return this.dmanager;
	}

	public void setDmanager(String dmanager) {
		this.dmanager = dmanager;
	}

	@Column(name = "address", length = 20)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "tel", length = 20)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "pid")
	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "department")
	public Set<Student> getStudents() {
		return this.students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

}