package com.exampl.reactservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampl.reactservice.bean.Test;

public interface TestRepository extends JpaRepository<Test, Long> {

}
