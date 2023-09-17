package com.mactechin.blog.service;

import com.mactechin.blog.domain.Article;
import com.mactechin.blog.dto.AddArticleRequest;
import com.mactechin.blog.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
