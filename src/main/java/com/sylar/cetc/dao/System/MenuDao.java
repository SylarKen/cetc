package com.sylar.cetc.dao.System;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MenuDao {
    List<Map<String,Object>> Get();
}
