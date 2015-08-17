package com.nestis.cloud.services.cities.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestis.cloud.services.cities.data.entities.City;
import com.nestis.cloud.services.cities.data.repository.CityRepository;
import com.nestis.cloud.services.cities.domain.CityDto;
import com.nestis.cloud.services.cities.service.CityService;

/**
 * Class that implements CityService
 * @author Nestor
 *
 */
@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository cityRepository;
	
	private Logger log = Logger.getLogger(CityServiceImpl.class);
	
	@Override
	public List<CityDto> getCities() {
		log.debug("---> Init Service getCities");
		List<City> cities = cityRepository.findAll();
		
		List<CityDto> citiesDto = new ArrayList<CityDto>(0);
		for(City city : cities) {
			citiesDto.add(new CityDto(city.getCode(), city.getName()));
		}
		
		log.debug("---> Finish Service getCities");
		return citiesDto;
	}

}
