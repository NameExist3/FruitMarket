package com.fruitmarket.service.impl;

import com.fruitmarket.base.BaseDao;
import com.fruitmarket.base.BaseServiceImpl;
import com.fruitmarket.mapper.NewsMapper;
import com.fruitmarket.po.News;
import com.fruitmarket.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl extends BaseServiceImpl<News> implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public BaseDao<News> getBaseDao() {
        return newsMapper;
    }
}
