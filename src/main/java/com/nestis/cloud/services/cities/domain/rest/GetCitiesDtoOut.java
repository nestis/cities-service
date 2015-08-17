package com.nestis.cloud.services.cities.domain.rest;

import java.util.List;

import com.nestis.cloud.services.cities.domain.CityDto;

/**
 * Class that defines an output object for Cities REST Service.
 * @author Nestor
 *
 */
public class GetCitiesDtoOut {

	/** LIst of cities. **/
	private List<CityDto> cities;

	public List<CityDto> getCities() {
		return cities;
	}

	public void setCities(List<CityDto> cities) {
		this.cities = cities;
	}

	/**
	 * Public constructor using fields.
	 * @param cities List of CityDto.
	 */
	public GetCitiesDtoOut(List<CityDto> cities) {
		super();
		this.cities = cities;
	}
	
	/** Public constructor without fields. */
	public GetCitiesDtoOut() {
		super();
	}
}