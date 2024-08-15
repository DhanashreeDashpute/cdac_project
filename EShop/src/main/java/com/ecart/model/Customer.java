package com.ecart.model;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Customer {
  
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
   @Embedded
   //@OneToOne
   private Address address;
   
   
   public Customer(String name, String email, String password, Address address) {
 		super();
 		this.name = name;
 		this.email = email;
 		this.password = password;
 		this.address = address;
 	}
   
   
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
	return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
    
    
    
}
