package com.fruitmarket.service.impl;

import com.fruitmarket.base.BaseDao;
import com.fruitmarket.base.BaseServiceImpl;
import com.fruitmarket.mapper.CommentMapper;
import com.fruitmarket.po.Comment;
import com.fruitmarket.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl extends BaseServiceImpl<Comment> implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public BaseDao<Comment> getBaseDao() {
        return commentMapper;
    }
}
