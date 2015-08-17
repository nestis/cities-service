package com.nestis.cloud.services.cities.service;

import java.util.List;

import com.nestis.cloud.services.cities.domain.CityDto;

/**
 * Interface that defines a service for the cities.
 * @author Nestor
 *
 */
public interface CityService {

	/**
	 * Returns the list of cities.
	 * @return List of CityDTO.
	 */
	List<CityDto> getCities();
}