package com.wangwei.login;

import com.wangwei.selenium.BaseDriver;

/**
 * 登录功能的操作层
 */
public class LoginOperation {
    //操作层需要Driver和元素层
    private BaseDriver driver;
    private LoginElement loginElement;
    public LoginOperation(BaseDriver driver){
        this.driver = driver;
        this.loginElement = new LoginElement(this.driver);
    }
    //点击弹出登录页面
    public void getLoginOhme(){
        driver.click(loginElement.getLogin());
    }

    //输入用户名
    public void sendKeyUsername(String username){
        driver.sendKey(loginElement.getUsername(),username);
    }

    //输入密码
    public void sendKeyPassword(String password){
        driver.sendKey(loginElement.getPassword(),password);
    }

    //自动登录
    public void clickAuto(){
        driver.click(loginElement.getAuto());
    }

    //登录按钮
    public void clickButton(){
        driver.click(loginElement.getbutton());
    }

    //判断是否存在
    public Boolean isUsernameDisplay(){
        return loginElement.isDisplay(loginElement.getUsername());
    }
    public Boolean isPasswordDisplay(){
        return loginElement.isDisplay(loginElement.getPassword());
    }

    public void mobetoLoginName(){
        driver.actions(loginElement.LoginName());
    }
    public void clickLoginName(){
        driver.click(loginElement.LoginName());
    }
    public String getName1(){
        return loginElement.getLoginName1().getText();
    }
    public String getName2(){
        return loginElement.getLoginName2().getText();
    }
}
