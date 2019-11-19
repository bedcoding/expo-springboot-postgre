package com.exampl.reactservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampl.reactservice.bean.Test;
import com.exampl.reactservice.repository.TestRepository;
import com.exampl.reactservice.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TestRepository testRepo;
	
	@Override
	public void add(Test test) {
		testRepo.save(test);
	}

}
