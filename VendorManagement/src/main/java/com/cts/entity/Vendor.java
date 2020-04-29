package com.cts.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity(name="Vendors")
public class Vendor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long vendorId;
	@NotNull(message=" first name cannot be null")
	@Size(min=8,message="name must be 8 characters" )
	private String name;
	
	private String address;
	@Pattern(regexp="^((\\+){1}91){1}[1-9]{1}[0-9]{9}$",message="must +91 be added while giving number")

	private String mobileNo;
	@NotNull(message=" Email name cannot be null")
	@Email
	private String emailId;
	
	
	public Vendor() {
		super();
	}
	
	
	
	public Vendor(long vendorId, String name, String address, String mobileNo, String emailId) {
		super();
		this.vendorId = vendorId;
		this.name = name;
		this.address = address;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
	}
	


	

	public Long getVendorId() {
		return vendorId;
	}



	public void setVendorId(Long vendorId) {
		this.vendorId = vendorId;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", name=" + name + ", address=" + address + ", mobileNo=" + mobileNo
				+ ", emailId=" + emailId + "]";
	}

	
	

}
