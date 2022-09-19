package org.collins.rest.restPrac12.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Car")
public class Car {
	
	@Transient
	public static final String SEQUENCE_NAME = "user_sequence";
	
	@Id
	private String id;
	private String name;
	private String manufacturer;
	private long seq;
	
	private Car(String name, String manufacturer)
	{
		this.name = name;
		this.manufacturer = manufacturer; 
	}
	
	public String getId() {
		return id;
	}

	public void setId(long l) {
		this.id = Long.toString(l);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", manufacturer=" + manufacturer + "]";
	}

	public long getSeq() {
		
		return seq;
	}
	
	public void setSeq(long seq) {
		this.seq = seq;
	}
}
