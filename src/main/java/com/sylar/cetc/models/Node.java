package com.sylar.cetc.models;

import java.io.Serializable;
import java.util.List;

/**
 * @author ：Sylar
 * @date ：Created in 2019/8/5 14:44
 * @description：
 * @modified By：
 * @version: $
 */
public class Node implements Serializable {
    public String nodeName;
    public String nodeCode;
    public String url;
    public List<Node> children;
}
