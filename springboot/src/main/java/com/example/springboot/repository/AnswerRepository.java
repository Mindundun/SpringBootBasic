package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.entity.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Integer>{
    
}
