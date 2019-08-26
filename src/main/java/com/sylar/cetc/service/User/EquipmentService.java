package com.sylar.cetc.service.User;

import com.sylar.cetc.dao.User.EquipmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author ：Sylar
 * @date ：Created in 2019/8/23 11:53
 * @description：
 * @modified By：
 * @version: $
 */
@Service
public class EquipmentService {
    @Autowired
    private EquipmentDao dao;

    public List<Map<String,Object>> GetEquipments(){
        return dao.GetEquipments();
    }
}
