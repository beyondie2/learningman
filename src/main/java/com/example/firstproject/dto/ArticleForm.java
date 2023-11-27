package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {
    private Long id;
    private String title; // 단어(한국어)를 받을 필드
    private String content; // 단어(영어)를 받을 필드

    public Article toEntity() {
        return new Article(id, title, content);
    }
}
