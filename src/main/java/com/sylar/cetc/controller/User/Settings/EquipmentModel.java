package com.sylar.cetc.controller.User.Settings;

import com.sylar.cetc.service.User.Settings.EquipmentModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @author ：Sylar
 * @date ：Created in 2019/8/16 14:26
 * @description：Management of Equipment Models
 * @modified By：
 * @version: $
 */
@Controller
@RequestMapping(value = "equipmentmodel")
public class EquipmentModel {
    @Autowired
    private EquipmentModelService service;

    @RequestMapping(value = "/index")
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView view = new ModelAndView();
        try {
            int id = Integer.parseInt(request.getParameter("id").toString());

            view.setViewName("equipmentmodel/index");
            view.addObject("id", 1);
            return view;
        } catch (Exception ex) {
            view.setViewName("");
            return view;
        }
    }

    @RequestMapping(value="/get")
    @ResponseBody
    public Object GetModelList(HttpServletRequest request) {
        try {
            int id = Integer.parseInt(request.getParameter("id").toString());
            List<Map<String, Object>> models = service.Get(id);
            return new Object() {
                public int total = models.size();
                public Object rows = models;
            };
        }catch (Exception ex) {
            return new Object() {
                public int total = 0;
                public Object rows = null;
            };
        }
    }
}
