package com.xhy.iknown.service.impl;

import com.xhy.iknown.entity.Interest;
import com.xhy.iknown.mapper.InterestMapper;
import com.xhy.iknown.service.InterestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterestServiceImpl implements InterestService {

    @Autowired
    private InterestMapper interestMapper;
    @Override
    public List<Interest> findAll() {
        return interestMapper.findAll();
    }

    @Override
    public void add(Interest interest) {
        interestMapper.add(interest);
    }

    @Override
    public void update(Interest interest) {
        interestMapper.update(interest);
    }

    @Override
    public void delete(Interest interest) {
        interestMapper.delete(interest);
    }

    @Override
    public Interest findbyif(Interest interest) {
        return interestMapper.findbyif(interest);
    }
}
