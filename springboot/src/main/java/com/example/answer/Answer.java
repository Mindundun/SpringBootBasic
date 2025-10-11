package com.example.answer;

import java.time.LocalDateTime;
import java.util.Set;

import com.example.question.Question;
import com.example.user.SiteUser;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @ManyToOne //질문(1) : 답변(N) -> 외래키
    private Question question;

    @ManyToOne
    private SiteUser author;

    private LocalDateTime modifyDate;

    // 추천기능
    @ManyToMany
    Set<SiteUser> voter;
}
