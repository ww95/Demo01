package com.wangwei.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 根据参数来获取指定Driver
 */
public class SelectDriver {
    public WebDriver driver;

    /**
     * 初始化Driver
     * @param browser
     * @return
     */
    public WebDriver initDriver(String browser){
        if("chrome".equalsIgnoreCase(browser)){
            System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
            driver = new ChromeDriver();
        }else{
            System.setProperty("webdriver.gecko.driver","F:\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        return driver;
    }
}
