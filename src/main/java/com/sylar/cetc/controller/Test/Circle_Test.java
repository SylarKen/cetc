package com.sylar.cetc.controller.Test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：Sylar
 * @date ：Created in 2019/8/10 9:45
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
@RequestMapping(value="test")
public class Circle_Test {
    @RequestMapping(value="/circle")
    public String Circle(){
        return "test/circle";
    }
}
