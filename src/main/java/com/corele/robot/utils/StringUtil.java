package com.corele.robot.utils;

/**
 * @author liujun
 */
public class StringUtil {
    public static void main(String[] args) {

        Message.addEnter();
        String str = Message.toStr();
        System.out.println(str);

        String string = "Magege";
        String s = string.substring(0, 1).toLowerCase()+string.substring(1);
        System.out.println(s);
    }
}
