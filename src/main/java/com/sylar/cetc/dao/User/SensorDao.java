package com.sylar.cetc.dao.User;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SensorDao {
    List<Map<String,Object>> Get(int id);
}
