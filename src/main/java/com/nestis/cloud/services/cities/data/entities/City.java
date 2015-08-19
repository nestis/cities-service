package com.nestis.cloud.services.cities.data.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Entity for a City
 * @author Nestor
 *
 */
@Document(collection = "City")
public class City {
	
	@Id
	private String id;
	private String code;
	private String name;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City(String code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public City(){
		super();
	}
}