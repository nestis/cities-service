package com.nestis.cloud.services.cities.domain;

/**
 * Class that defines a City DTO.
 * @author Nestor
 *
 */
public class CityDto {
	
	/** City code. */
	private String code;
	
	/** City name. */
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

	/**
	 * Public constructor using fields.
	 * @param code City code.
	 * @param name City name.
	 */
	public CityDto(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	/** Public constructor without arguments. */
	public CityDto() {
		super();
	}
}