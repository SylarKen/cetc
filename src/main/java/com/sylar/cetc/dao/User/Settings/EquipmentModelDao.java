package com.sylar.cetc.dao.User.Settings;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface EquipmentModelDao {
    public List<Map<String,Object>> Get(int id);
}
