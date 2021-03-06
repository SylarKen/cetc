package com.sylar.cetc.service.User.Settings;

import com.sylar.cetc.dao.User.Settings.EquipmentModelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author ：Sylar
 * @date ：Created in 2019/8/16 16:45
 * @description：
 * @modified By：
 * @version: $
 */
@Service
public class EquipmentModelService {
    @Autowired
    private EquipmentModelDao dao;
    public List<Map<String,Object>> Get(int id){
        return dao.Get(id);
    }
}
