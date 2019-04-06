package com.wangwei.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 生成读取配置文件对象
 */
public class PropertiesUtil {
    private static PropertiesUtil propertiesUtil = new PropertiesUtil();
    private Properties properties;
    private static InputStream fileInputStream;
    private PropertiesUtil(){}
    //生成对象
    public static PropertiesUtil getInstance(){
        return propertiesUtil;
    }
    //加载配置文件
    public void load(){
        try {
            //利用类加载器来加载配置文件
            fileInputStream = this.getClass().getClassLoader().getResourceAsStream("login.properties");
            properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("读取配置文件失败");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("加载配置文件失败");
            e.printStackTrace();
        }
    }

    //获取指定的key值
    public String getKey(String key){
        if(properties.containsKey(key)){
            return properties.getProperty(key);
        }else{
            System.out.println("查找指定key不存在");
            return "";
        }
    }

}
