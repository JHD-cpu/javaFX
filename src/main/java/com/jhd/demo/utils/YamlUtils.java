package com.jhd.demo.utils;

import org.yaml.snakeyaml.Yaml;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedHashMap;

public class YamlUtils {


   private static  LinkedHashMap load;
   private static  LinkedHashMap child;
   static {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(ClassLoader.getSystemResource("./Application.yml").getPath()));
            YamlUtils.load= new Yaml().load(bufferedReader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private YamlUtils(){ }
    public static String getValue(String key){
        String[] split = key.split("\\.");
        child=load;
        for (String name:split ) {
            Object o = child.get(name);
            if(o instanceof String){
                return (String)o;
            }{
                child=(LinkedHashMap)o;
            }
        }
        return null;
     }


}
