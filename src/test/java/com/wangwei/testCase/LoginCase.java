package com.wangwei.testCase;

import com.wangwei.login.LoginLogic;
import com.wangwei.selenium.BaseDriver;
import com.wangwei.util.TimeUtil;
import org.testng.annotations.Test;

public class LoginCase {
    private BaseDriver driver;
    private LoginLogic loginLogic;
    private LoginCase(){
        this.driver = new BaseDriver("chrome");
        loginLogic = new LoginLogic(this.driver);
    }

    @Test
    public void getLoginHome(){
        this.driver.get("http://www.imooc.com");
        TimeUtil.getInstance().sleep(2000);
        this.loginLogic.getLoginHome();
        TimeUtil.getInstance().sleep(2000);
    }
    @Test(dependsOnMethods = "getLoginHome")
    public void login(){
        this.loginLogic.login("18075715790","18075715790ww");
        TimeUtil.getInstance().sleep(2000);
        this.loginLogic.isTrue();

    }

    @Test(dependsOnMethods = "login")
    public void close(){
        TimeUtil.getInstance().sleep(3000);
        this.driver.close();
    }

}
