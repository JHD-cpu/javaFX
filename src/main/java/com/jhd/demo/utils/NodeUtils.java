package com.jhd.demo.utils;

import javafx.scene.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NodeUtils {

    public static List<Node> nodeList;
    public static Map<String ,Node> nodeMap;

    static {
        nodeList=new ArrayList<>();
        nodeMap=new HashMap<>();
    }

    private NodeUtils() {
    }
}
