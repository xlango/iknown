package com.xhy.iknown.service;

import com.xhy.iknown.entity.Article;

import java.util.List;

public interface ArticleService {

    List<Article> findAll();
    void add(Article article);

    void update(Article article);

    void delete(Article article);

    Article findbyif(Article article);
}
