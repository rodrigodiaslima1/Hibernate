package com.tvc.main.java;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_package")
public class Package {
	
	
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="x")
	@SequenceGenerator(name="x", sequenceName="package_sequence", 
	initialValue=1, allocationSize=1)
	private Long id;
	
	@Column(name="code", length=10, nullable=false, unique=true)
	private String code;
	
	@Column(name="sender", length=50, nullable=false)
	private String sender;
	
	@Column(name="receiver", length=50, nullable=false)
	private String receiver;
	
	@Column(name="message", length=300, nullable=true)
	private String message;
	
	public Package() {}
	
	//----------------------------------------
	
	public String getSender() {
		return sender;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	

}
