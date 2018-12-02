package com.xhy.iknown.service;

import com.xhy.iknown.entity.Article;
import com.xhy.iknown.entity.Interest;

import java.util.List;

public interface InterestService {

    List<Interest> findAll();
    void add(Interest interest);

    void update(Interest interest);

    void delete(Interest interest);

    Interest findbyif(Interest interest);
}
