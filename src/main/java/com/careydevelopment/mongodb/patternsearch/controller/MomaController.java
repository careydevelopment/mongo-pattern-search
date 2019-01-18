package com.careydevelopment.mongodb.patternsearch.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.careydevelopment.mongodb.patternsearch.model.MomaWork;
import com.careydevelopment.mongodb.patternsearch.repository.MomaRepository;


@RestController
public class MomaController {

	private static final Logger logger = LoggerFactory.getLogger(MomaController.class);
	
	private static final int RESULTS_PER_PAGE = 10;
	
	@Autowired
	private MomaRepository momaRepository;
	
	
	@GetMapping("/moma/filter")
	public Page<MomaWork> search(@RequestParam(value="match", required=true) String match,
			@RequestParam(value="pageNum", required=false) String pageNum) {
		
		int page = getPage(pageNum);
		Pageable pageable = PageRequest.of(page, RESULTS_PER_PAGE);		
		
		Page<MomaWork> pagedResults = momaRepository.searchByTitle(match, pageable);
		
		return pagedResults;
	}
	
	
    private int getPage(String pageNum) {
    	int page = 0;
    	
    	if (pageNum != null) {
    		try {
    			page = new Integer(pageNum);
    		} catch (NumberFormatException ne) {
    			logger.error("Page number isn't a number! " +pageNum);
    		}
    	}
    	
    	return page;
    }
}
