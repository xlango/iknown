package com.xhy.iknown.service.impl;

import com.xhy.iknown.entity.Article;
import com.xhy.iknown.mapper.ArticleMapper;
import com.xhy.iknown.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleMapper articleMapper;
    @Override
    public List<Article> findAll() { return articleMapper.findAll();}

    @Override
    public void add(Article article) {articleMapper.add(article); }

    @Override
    public void update(Article article) {articleMapper.update(article);}

    @Override
    public void delete(Article article) {articleMapper.delete(article);}

    @Override
    public Article findbyif(Article article) {
        return articleMapper.findbyif(article);
    }
}
