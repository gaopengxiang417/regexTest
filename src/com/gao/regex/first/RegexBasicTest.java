package com.gao.regex.first;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: wangchen.gpx
 * Date: 13-7-24
 * Time: 下午6:42
 */
public class RegexBasicTest {
    public static void main(String[] args) {
        //.号的使用
        Matcher matcher = Pattern.compile("a.s").matcher("a ma*sa.sa sa)s");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println("********华丽的分割线*********");
        //[]的使用
        Matcher matcher1 = Pattern.compile("a[abcds]s").matcher("a ma*sa.sa sa)sads");
        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }
        System.out.println("********华丽的分割线*********");

        //或的匹配,注意,中括号只能匹配单个字符,不能匹配多个字符,如果有多个字符必须要用大括号
        Matcher matcher2 = Pattern.compile("a(a|b|c|oo|d)s").matcher("a ma*sa.sa sa)sadsaoos");
        while (matcher2.find()) {
            System.out.println(matcher2.group());

            System.out.println(matcher2.groupCount());
            for (int i = 0 ; i <= matcher2.groupCount() ; i++){
                System.out.println(matcher2.group(i));
            }
        }

        System.out.println("********华丽的分割线*********");
    }
}
