package com.sylar.cetc.service.System;

import com.sylar.cetc.dao.System.MenuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author ：Sylar
 * @date ：Created in 2019/8/1 10:00
 * @description：Service For Menus
 * @modified By：
 * @version: $
 */
@Service
public class MenuService {
    @Autowired
    private MenuDao dao;
    public List<Map<String,Object>> Get(){
        return dao.Get();
    }
}
