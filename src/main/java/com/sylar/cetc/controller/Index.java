package com.sylar.cetc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：Sylar
 * @date ：Created in 2019/7/29 9:41
 * @description：Show details of clients
 * @modified By：
 * @version: $
 */
@Controller
@RequestMapping(value = "/")
public class Index {
    @RequestMapping(value = "/")
    public String index(String code) {
//        return ("details/index");
        return ("Frame");
    }
}
