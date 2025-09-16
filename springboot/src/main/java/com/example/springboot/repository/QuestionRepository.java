package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.entity.Question;

// Question 엔티티로 리포지터리 생성, Question 엔티티의 기본키가 Integer임.
public interface QuestionRepository extends JpaRepository<Question, Integer>{
    
}
