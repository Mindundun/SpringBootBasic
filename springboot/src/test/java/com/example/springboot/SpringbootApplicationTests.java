package com.example.springboot;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.answer.Answer;
import com.example.answer.AnswerRepository;
import com.example.question.Question;
import com.example.question.QuestionRepository;
import com.example.question.QuestionService;

import jakarta.transaction.Transactional;

@SpringBootTest
class SpringbootApplicationTests {
	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private AnswerRepository answerRepository;
	
	@Autowired
	private QuestionService questionService;

	@Transactional
	@Test
	void testJpa(){
		System.out.println("Mindundund!!!!");
		// Question data insert
		// Question q1 = new Question();
		// q1.setSubject("Spring이란 무엇인가요?");
		// q1.setContent("Spring에 대해 알고 싶습니다.");
		// q1.setCreateDate(LocalDateTime.now());
		// this.questionRepository.save(q1);

		// Question q2 = new Question();
		// q2.setSubject("스프링 부트 모델 질문 입니다.");
		// q2.setContent("id는 자동으로 생성되나요?");
		// q2.setCreateDate(LocalDateTime.now());
		// this.questionRepository.save(q2);

		// Question all Query
		// List<Question> all = this.questionRepository.findAll();
		// assertEquals(2, all.size());

		// Question q = all.get(0);
		// assertEquals("Spring이란 무엇인가요?", q.getSubject());

		// Question Query
		// Optional<Question> oq = this.questionRepository.findById(1);
		// if(oq.isPresent()) {
		// 	Question qQuery = oq.get();
		// 	assertEquals("스프링 부트 모델 질문 입니다.", qQuery.getSubject());
		// }

		// Question Query : Where Subject Query
		// Question q = this.questionRepository.findBySubject("스프링 부트 모델 질문 입니다.");
		// assertEquals(17, q.getId());

		// Question Query : Where Subject and Content Query
		// Question q1 = this.questionRepository.findBySubjectAndContent("스프링 부트 모델 질문 입니다.", "id는 자동으로 생성되나요?");
		// assertEquals(17, q1.getId());

		// Question Query : Where Subject like "Spring%"
		// List<Question> qList = this.questionRepository.findBySubjectLike("Spring%");
		// Question q2 = qList.get(0);
		// assertEquals("Spring이란 무엇인가요?", q2.getSubject());

		// Question update id : 17 Subject
		// Optional<Question> oq = this.questionRepository.findById(17);
		// assertTrue(oq.isPresent());
		// Question q3 = oq.get();
		// q3.setSubject("스프링부트란 무엇인가요?");
		// this.questionRepository.save(q3);

		// Question delete
		// assertEquals(2, this.questionRepository.count());
		// Optional<Question> oq1 = this.questionRepository.findById(17);
		// assertTrue(oq1.isPresent());
		// Question q4 = oq1.get();
		// this.questionRepository.delete(q4);
		// assertEquals(1, this.questionRepository.count());

		// Answer Create : Question id : 16 
		// Optional<Question> oq2 = this.questionRepository.findById(1);
		// assertTrue(oq2.isPresent());
		// Question q5 = oq2.get();
		// Answer a = new Answer();
		// a.setContent("네 자동으로 생성됩니다.");
		// a.setQuestion(q5);
		// a.setCreateDate(LocalDateTime.now());
		// this.answerRepository.save(a);

		// Answer Query
		// Optional<Answer> oa = this.answerRepository.findById(1);
		// assertTrue(oa.isPresent());
		// Answer a = oa.get();
		// assertEquals(1, a.getQuestion().getId());
		// System.out.println(a.getId() + ", " + a.getContent());

		// Answer에 연결된 Question Query
		Optional<Question> oq = this.questionRepository.findById(1);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		System.out.println(q.getId() + q.getSubject());

		List<Answer> answerList = q.getAnswerList();

		assertEquals(1, answerList.size());
		System.out.println(answerList.get(0).getId() + answerList.get(0).getContent()) ;

	}

}
