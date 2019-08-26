package com.sylar.cetc.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Sylar
 * @date ：Created in 2019/8/5 14:40
 * @description：
 * @modified By：
 * @version: $
 */
public class Menu implements Serializable {
    public List<Node> nodes;

    public Menu (){
        nodes = new ArrayList<>() ;

    }
    public void add(Node node)     {
        this.nodes.add(node);
    }
}
