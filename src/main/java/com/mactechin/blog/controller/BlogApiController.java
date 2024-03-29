package com.mactechin.blog.controller;

import com.mactechin.blog.domain.Article;
import com.mactechin.blog.dto.AddArticleRequest;
import com.mactechin.blog.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BlogApiController {

    private final BlogService  blogService;

    @PostMapping("/api/articles")
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request) {

        Article saveArticle = blogService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(saveArticle);

    }


}
