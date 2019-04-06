package com.wangwei.util;

/**
 * 封装等待时间
 */
public class TimeUtil {
    private static TimeUtil timeUtil = new TimeUtil();
    private TimeUtil(){}
    public static TimeUtil getInstance(){
        return timeUtil;
    }

    /**
     * 默认等待时间为1秒
     */
    public void sleep(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 设置等待时间
     * @param time
     */
    public void sleep(long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
