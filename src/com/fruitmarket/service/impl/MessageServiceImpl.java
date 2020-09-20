package com.fruitmarket.service.impl;

import com.fruitmarket.base.BaseDao;
import com.fruitmarket.base.BaseServiceImpl;
import com.fruitmarket.mapper.MessageMapper;
import com.fruitmarket.po.Message;
import com.fruitmarket.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl extends BaseServiceImpl<Message> implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public BaseDao<Message> getBaseDao() {
        return messageMapper;
    }
}
