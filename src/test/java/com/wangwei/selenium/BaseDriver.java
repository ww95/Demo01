package com.wangwei.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * 这个是生成Driver浏览器的
 */
public class BaseDriver {
    private WebDriver driver;

    public BaseDriver(String browsr){
        //负责浏览器的选择
        SelectDriver selectDriver = new SelectDriver();
        this.driver = selectDriver.initDriver(browsr);
    }
    /**
     * 根据Driver来封装基本操作
     */

    public void get(String url){
        this.driver.get(url);
    }
    public WebElement findElement(By by){
        return driver.findElement(by);
    }

    public void close(){
        this.driver.close();
    }

    public void click(WebElement element){
        element.click();
    }
    public void sendKey(WebElement element,String value){
        element.sendKeys(value);
    }

    public void actions(WebElement element){
        Actions actions = new Actions(this.driver);
        actions.moveToElement(element).perform();
    }
}
