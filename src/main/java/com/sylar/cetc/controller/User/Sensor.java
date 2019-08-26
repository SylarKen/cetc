package com.sylar.cetc.controller.User;

import com.sylar.cetc.service.User.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @author ：Sylar
 * @date ：Created in 2019/8/6 13:37
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
@RequestMapping(value = "sensor")
public class Sensor {
    @Autowired
    private SensorService service;
    @RequestMapping(value = "/get")
    @ResponseBody
    public Object GetSensors(HttpServletRequest request)
    {
        try{
            int id = Integer.parseInt(request.getParameter("id"));
            List<Map<String,Object>> sensors = service.Get(id);
            return sensors;
        }catch (Exception ex){
            return null;
        }

    }
}
