package com.wangwei.util;

import org.openqa.selenium.By;

/**
 * 这个是根据配置文件来获取值
 */
public class PropertiesValue {
    private static PropertiesValue propertiesValue = new PropertiesValue();
    private PropertiesUtil propertiesUtil = PropertiesUtil.getInstance();
    private PropertiesValue(){
        propertiesUtil.load();
    }
    public static PropertiesValue getInstance(){
        return propertiesValue;
    }
    //根据指定key值获取value
    //如果都没有则表示默认方式就是css定位
    public By getValue(String key){
        By by = null;
        String value = propertiesUtil.getKey(key);
        //根据key值规律来获取定位方式和元素 这个是从开头开始找
        int index = value.indexOf(">");
        String type = value.substring(0,index);
        String element = value.substring(index+1);
        if("id".equalsIgnoreCase(type)){
            by = By.id(element);
        }else if("className".equalsIgnoreCase(type)){
            by = By.className(element);
        }else if("css".equalsIgnoreCase(type)){
            by = By.cssSelector(element);
        }else if ("linktext".equalsIgnoreCase(type)){
            by = By.linkText(element);
        }else if("name".equalsIgnoreCase(type)){
            by = By.name(element);
        }else if("partialLink".equalsIgnoreCase(type)){
            by = By.partialLinkText(element);
        }else if("tagname".equalsIgnoreCase(type)){
            by = By.tagName(element);
        }else if("xpath".equalsIgnoreCase(type)){
            by = By.xpath(element);
        }else{
            by = By.cssSelector(element);
        }
        return by;
    }
}
