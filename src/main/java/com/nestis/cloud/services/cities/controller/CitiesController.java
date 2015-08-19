package com.nestis.cloud.services.cities.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nestis.cloud.services.cities.domain.CityDto;
import com.nestis.cloud.services.cities.domain.rest.GetCitiesDtoOut;
import com.nestis.cloud.services.cities.service.CityService;

/**
 * Class that defines the City REST Service.
 * @author Nestor
 *
 */
@RestController
@RequestMapping("/cities")
public class CitiesController {

	@Autowired
	private CityService cityService;

	@Value("cities.mock.mongo")
	private String value;
	private Logger log = Logger.getLogger(CitiesController.class);

	/**
	 * Returns the list of cities.
	 * @return List CityDto
	 */
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public GetCitiesDtoOut getCities() {
		log.debug(value + "---> Init REST /cities");
		
		List<CityDto> cities = cityService.getCities();
		GetCitiesDtoOut dtoOut = new GetCitiesDtoOut(cities);
		
		log.debug("---> Finish REST /cities");
		return dtoOut;
	}
}
