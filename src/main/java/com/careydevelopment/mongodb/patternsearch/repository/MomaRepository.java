package com.careydevelopment.mongodb.patternsearch.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.careydevelopment.mongodb.patternsearch.model.MomaWork;

public interface MomaRepository extends MongoRepository<MomaWork,String> {
	
	@Query("{}")
	Page<MomaWork> findMomaWorks(Pageable page);
	
	@Query("{'title':{'$regex':'?0','$options':'i'}}") 	
	Page<MomaWork> searchByTitle(String name, Pageable page);
}
