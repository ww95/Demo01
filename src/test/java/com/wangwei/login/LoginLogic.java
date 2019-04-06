package com.wangwei.login;

import com.wangwei.selenium.BaseDriver;
import com.wangwei.util.TimeUtil;

/**
 * 登录页面的逻辑层
 */
public class LoginLogic {
    private BaseDriver driver;
    private LoginOperation loginOperation;
    private TimeUtil timeUtil = TimeUtil.getInstance();
    public LoginLogic(BaseDriver driver){
        this.driver = driver;
        this.loginOperation = new LoginOperation(this.driver);
    }

    //弹出登录页面框
    public void getLoginHome(){
        loginOperation.getLoginOhme();
    }
    //登录流程
    public void login(String username,String password){
        if(loginOperation.isUsernameDisplay()&&loginOperation.isPasswordDisplay()){
            loginOperation.sendKeyUsername(username);
            timeUtil.sleep();
            loginOperation.sendKeyPassword(password);
            timeUtil.sleep();
            loginOperation.clickAuto();
            timeUtil.sleep();
            loginOperation.clickButton();

        }else{
            System.out.println("登录页面出现错误");
        }
    }

    public void isTrue(){
        loginOperation.mobetoLoginName();
        String value1 = loginOperation.getName1();
        loginOperation.clickLoginName();
        TimeUtil.getInstance().sleep(3000);
        String value2 = loginOperation.getName2();
        if (value1.equals(value2)) {
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }
}
