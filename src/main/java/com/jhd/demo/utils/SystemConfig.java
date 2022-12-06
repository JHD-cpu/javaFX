package com.jhd.demo.utils;

import java.awt.*;

public class SystemConfig {


    public static double width;

    public static double height;

    static {
        SystemConfig.width= Toolkit.getDefaultToolkit().getScreenSize().getSize().getWidth();
        SystemConfig.height=Toolkit.getDefaultToolkit().getScreenSize().getSize().getHeight();
    }

    private SystemConfig() { }


}
