package com.fruitmarket.service.impl;

import com.fruitmarket.base.BaseDao;
import com.fruitmarket.base.BaseServiceImpl;
import com.fruitmarket.mapper.CarMapper;
import com.fruitmarket.po.Car;
import com.fruitmarket.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl extends BaseServiceImpl<Car> implements CarService {

    @Autowired
    private CarMapper carMapper;

    @Override
    public BaseDao<Car> getBaseDao() {
        return carMapper;
    }
}
