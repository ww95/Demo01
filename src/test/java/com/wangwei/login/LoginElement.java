package com.wangwei.login;

import com.wangwei.selenium.BaseDriver;
import com.wangwei.util.PropertiesValue;
import org.openqa.selenium.WebElement;

/**
 * 自动化的元素层
 * 主要是封装元素操作
 */
public class LoginElement {
    private BaseDriver driver;
    private PropertiesValue propertiesValue = PropertiesValue.getInstance();
    public LoginElement(BaseDriver driver){
        this.driver = driver;
    }

    //用户名
    public WebElement getUsername(){
        return this.driver.findElement(propertiesValue.getValue("username"));
    }

    //密码
    public WebElement getPassword(){
        return this.driver.findElement(propertiesValue.getValue("password"));
    }

    //登录按钮
    public WebElement getbutton(){
        return this.driver.findElement(propertiesValue.getValue("button"));
    }

    //自动登录
    public WebElement getAuto(){
        return this.driver.findElement(this.propertiesValue.getValue("auto"));
    }

    //检测登录页面元素是否存在
    public Boolean isDisplay(WebElement element){
        boolean flag = element.isDisplayed();
        return flag;
    }

    //弹出登录页面
    public WebElement getLogin(){

        return this.driver.findElement(this.propertiesValue.getValue("loginHome"));
    }

    //用户名
    public WebElement LoginName(){
        return this.driver.findElement(this.propertiesValue.getValue("loginname"));
    }
    //用户名
    public WebElement getLoginName1(){
        return this.driver.findElement(this.propertiesValue.getValue("loginvalue1"));
    }
    //用户名
    public WebElement getLoginName2(){
        return this.driver.findElement(this.propertiesValue.getValue("loginvalue2"));
    }
}
