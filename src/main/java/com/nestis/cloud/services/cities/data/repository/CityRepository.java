package com.nestis.cloud.services.cities.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nestis.cloud.services.cities.data.entities.City;


/**
 * Repository for City.
 * @author Nestor
 *
 */
public interface CityRepository extends MongoRepository<City, String> {

}