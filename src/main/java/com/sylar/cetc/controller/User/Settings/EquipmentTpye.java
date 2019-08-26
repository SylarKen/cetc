package com.sylar.cetc.controller.User.Settings;

import com.sylar.cetc.service.User.Settings.EquipmentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @author ：Sylar
 * @date ：Created in 2019/8/16 16:44
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
@RequestMapping(value = "equipmenttype")
public class EquipmentTpye {
    @Autowired
    private EquipmentTypeService equipmentTypeService;


    @RequestMapping(value = "/index")
    public String index() {

        return "equipmenttype/index";
    }


    @RequestMapping(value = "/get")
    @ResponseBody
    public Object GetTypeList(HttpServletRequest request) {
        List<Map<String, Object>> typeList = equipmentTypeService.Get();
        Object obj = new Object() {
            public int total = typeList.size();
            public Object rows = typeList;
        };

        return obj;
    }

}
