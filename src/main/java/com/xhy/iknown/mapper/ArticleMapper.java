package com.xhy.iknown.mapper;



import com.xhy.iknown.entity.Article;
import com.xhy.iknown.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ArticleMapper {

    List<Article> findAll();
    void add(Article article);

    void update(Article article);

    void delete(Article article);

    Article findbyif(Article article);

    List<Article> findsByIf(Article article);
}
