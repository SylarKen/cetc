package com.sylar.cetc.service.User;

import com.sylar.cetc.dao.User.SensorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.management.Sensor;

import java.util.List;
import java.util.Map;

/**
 * @author ：Sylar
 * @date ：Created in 2019/8/6 11:37
 * @description：
 * @modified By：
 * @version: $
 */
@Service
public class SensorService {
    @Autowired
    private SensorDao dao;

    public List<Map<String,Object>> Get(int id) {

        return dao.Get(id);
    }

}
