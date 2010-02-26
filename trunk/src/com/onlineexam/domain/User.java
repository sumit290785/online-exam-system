package com.onlineexam.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name = "USERS")
public class User implements Serializable, Comparable {

	// common attributes for all POJO
	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private int id;

	@Version
	@Column(name = "OBJ_VERSION")
	private int version = 0;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED", nullable = false, updatable = false)
	private Date created = new Date();

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LASTMODIFIED", nullable = false, updatable = true)
	private Date lastModified = new Date();

	// other attributes
	@Column(name = "USERNAME", length = 20, nullable = false, unique = true)
	private String username;

	@Column(name = "PASSWORD", length = 20, nullable = false)
	private String password;

	@Column(name = "FIRST_NAME", length = 50, nullable = true)
	private String firstName;

	@Column(name = "LAST_NAME", length = 50, nullable = true)
	private String lastName;

	@Column(name = "EMAIL", length = 50, nullable = true)
	private String email;

	@Column(name = "PHONE", length = 20, nullable = true)
	private String phone;

	@Column(name = "STREET", length = 255, nullable = true)
	private String street;

	@Column(name = "ZIPCODE", length = 16, nullable = true)
	private String zipcode;

	@Column(name = "CITY", length = 100, nullable = true)
	private String city;

	@Enumerated(EnumType.STRING)
	private UserType userType;

	@OneToMany(cascade = { CascadeType.REMOVE }, mappedBy = "user", fetch = FetchType.LAZY)
	private Set<Exam> exams = new HashSet<Exam>();

	@ManyToMany
	@JoinTable(name = "USER_CATEGORY", joinColumns = { @JoinColumn(name = "USER_ID") }, inverseJoinColumns = { @JoinColumn(name = "CATEGORY_ID") })
	private Set<Category> categoryTobeExamed = new HashSet<Category>();

	// ********************** Constructor ********************** //

	public User(String username, String password, UserType userType) {
		super();
		this.username = username;
		this.password = password;
		this.userType = userType;
	}

	public User(String username, String password, String firstName,
			String lastName, String email, String phone, String street,
			String zipcode, String city, UserType userType) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.street = street;
		this.zipcode = zipcode;
		this.city = city;
		this.userType = userType;
	}

	public User() {
	}

	// ********************** Accessor Methods ********************** //

	public boolean isAdmin() {
		return (this.getUserType() == UserType.ADMIN);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getVersion() {
		return version;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public Set<Exam> getExams() {
		return exams;
	}

	public void setExams(Set<Exam> exams) {
		this.exams = exams;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Category> getCategoryTobeExamed() {
		return categoryTobeExamed;
	}

	public void setCategoryTobeExamed(Set<Category> categoryTobeExamed) {
		this.categoryTobeExamed = categoryTobeExamed;
	}

	// ********************** Common Methods ********************** //

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof User))
			return false;
		final User user = (User) o;
		return getUsername().equals(user.getUsername());
	}

	public int hashCode() {
		return getUsername().hashCode();
	}

	public String toString() {
		return "User ('" + getId() + "'), " + "Username: '" + getUsername()
				+ "'";
	}

	public int compareTo(Object o) {
		if (o instanceof User)
			// Don't compare Date objects! Use the time in milliseconds!
			return Long.valueOf(this.getCreated().getTime()).compareTo(
					Long.valueOf(((User) o).getCreated().getTime()));
		return 0;
	}

}
