package com.example.springboot;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springboot.entity.Question;
import com.example.springboot.repository.QuestionRepository;

@SpringBootTest
class SpringbootApplicationTests {
	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void testJpa(){
		// 데이터 insert
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

		// data all Query
		List<Question> all = this.questionRepository.findAll();
		assertEquals(2, all.size());

		Question q = all.get(0);
		assertEquals("Spring이란 무엇인가요?", q.getSubject());

		// data Query
		Optional<Question> oq = this.questionRepository.findById(1);
		if(oq.isPresent()) {
			Question qQuery = oq.get();
			assertEquals("스프링 부트 모델 질문 입니다.", qQuery.getSubject());
		}
	}

}
