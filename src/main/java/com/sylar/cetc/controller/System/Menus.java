package com.sylar.cetc.controller.System;

import ch.qos.logback.core.joran.spi.ElementSelector;
import com.sylar.cetc.models.Menu;
import com.sylar.cetc.models.Node;
import com.sylar.cetc.service.System.MenuService;
import com.sylar.cetc.service.User.EquipmentService;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author ：Sylar
 * @date ：Created in 2019/8/1 9:54
 * @description：Draw Menus
 * @modified By：
 * @version: $
 */

@Controller
@RequestMapping(value = "Menus")
public class Menus {
    @Autowired
    private MenuService service_menu;
    @Autowired
    private EquipmentService service_equipment;

    @RequestMapping(value = "/get")
    @ResponseBody
    public Object get() {
        try {
            List<Map<String, Object>> menus = service_menu.Get();
            List<Map<String, Object>> top = menus.stream().filter(f -> f.get("pid").equals(0)).collect(Collectors.toList());
            Menu menu = new Menu();
            treeData(menu.nodes, top, menus);
            List<Map<String, Object>> equipmentList = service_equipment.GetEquipments();
            List<Node> nodes_equipments = new ArrayList<>();
            equipmentList.forEach(e -> {
                Node node = new Node();
                node.nodeName = e.get("name").toString();
                node.nodeCode = e.get("equipment_code").toString();
                node.url = e.get("controller").toString() + "/index?id=" + e.get("id").toString();
                nodes_equipments.add(node);
            });
            for (int i = 0; i < menu.nodes.size(); i++) {
                if(menu.nodes.get(i).nodeCode.equals("clients")){
                    menu.nodes.get(i).children=nodes_equipments;
                }
            }

            return menu;
        } catch (Exception ex) {
            return null;
        }

    }

    private void treeData(List<Node> nodes, List<Map<String, Object>> parents, List<Map<String, Object>> all) {
//        List<Object> list = new ArrayList<>();
        parents.forEach(p -> {
            Node node = new Node();
            node.nodeName = p.get("title").toString();
            node.nodeCode = p.get("name").toString();
            node.url = p.get("controller") == null ? "" : p.get("controller").toString();
            node.children = new ArrayList<>();
            List<Map<String, Object>> children = all.stream().filter(f -> f.get("pid").equals(p.get("id"))).collect(Collectors.toList());
            if (!children.isEmpty()) {
                treeData(node.children, children, all);
            } else {

            }
            nodes.add(node);
//            list.add(new Object() {
//                Map<String, Object> node = p;
//                List<Map<String, Object>> child = children;
//            });
        });
//        return list;
    }


}
