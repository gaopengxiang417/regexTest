package com.gao.regex.first;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: wangchen.gpx
 * Date: 13-7-24
 * Time: 下午3:51
 */
public class FindTesst {
    public static void main(String[] args) {
        Matcher matcher = Pattern.compile("\\w+").matcher("this is a very intersinting topic");

        while(matcher.find())
            System.out.println(matcher.group());

        System.out.println("**********华丽的分割线*************");
        int index = 0;
        while(matcher.find(index)){
            System.out.println(matcher.group());
            index++;
        }
    }
}
