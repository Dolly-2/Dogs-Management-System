package com.malliClasses.DMS.repository;

import org.springframework.data.repository.CrudRepository;


import com.malliClasses.DMS.Models.Dog;

/**
 * @author Bhavana Malli
 *
 */
public interface DogRepository extends CrudRepository<Dog, Integer > {

}
