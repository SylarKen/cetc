package com.sylar.cetc.controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author ：Sylar
 * @date ：Created in 2019/8/5 16:17
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
@RequestMapping(value = "microwave")
public class Microwave {
    @RequestMapping(value = "/index")
    public ModelAndView Index(HttpServletRequest request)
    {
        ModelAndView view = new ModelAndView();
        try {
            int id = Integer.parseInt(request.getParameter("id").toString());

            view.setViewName("/microwave/index");
            view.addObject("id", id);
            return view;
        } catch (Exception ex) {
            view.setViewName("");
            return view;
        }
//        return ("/microwave/index");
    }

    @RequestMapping(value = "/part")
    public String Part(int part) {

        return "/microwave/part" + part;
    }


}
