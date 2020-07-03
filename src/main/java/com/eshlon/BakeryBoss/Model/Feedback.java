package com.eshlon.BakeryBoss.Model;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "feedback")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
//@JsonIgnoreProperties({"rating","code"})
@JsonPropertyOrder({"name","email","message","regarding","code","rating"})
public class Feedback {
	
	@JsonProperty("User_Name")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String email;
	private String message;
	private int regarding;
	private String code;
	private int rating;
	
	protected Feedback() {}
	
	public Feedback(String name, String email, String message, int regarding, String code, int rating) {
		super();
		this.name = name;
		this.email = email;
		this.message = message;
		this.regarding = regarding;
		this.code = code;
		this.rating = rating;
	}
	
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getRegarding() {
		return regarding;
	}
	public void setRegarding(int regarding) {
		this.regarding = regarding;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Feedback [name=" + name + ", email=" + email + ", message=" + message + ", regarding=" + regarding
				+ ", code=" + code + ", rating=" + rating + "]";
	}
}
