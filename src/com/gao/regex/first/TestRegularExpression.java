package com.gao.regex.first;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: wangchen.gpx
 * Date: 13-7-24
 * Time: 下午3:39
 */
public class TestRegularExpression {
    public static void main(String[] args) {
        String str = " abcabcabcdefabc";

        Pattern pattern = Pattern.compile("abc+");
        Pattern pattern1 = Pattern.compile("(abc)+");
        Pattern pattern2 = Pattern.compile("(abc){2,}");

        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.groupCount());
        while(matcher.find()){
            System.out.println(matcher.group());
            System.out.println("start : " + matcher.start() + " , end :" + matcher.end());
        }

        System.out.println("*******华丽的分割线*********");

        Matcher matcher1 = pattern1.matcher(str);
        System.out.println(matcher1.groupCount());
        while(matcher1.find()){
            System.out.println(matcher1.group());
            System.out.println("start : " + matcher1.start() + " , end : " + matcher1.end());
        }

        System.out.println("*******华丽的分割线*********");

        Matcher matcher2 = pattern2.matcher(str);
        System.out.println(matcher2.groupCount());
        while(matcher2.find()){
            System.out.println(matcher2.group());
            System.out.println("start : " + matcher2.start() + " , end : " + matcher2.end());
        }
    }
}
