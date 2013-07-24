package com.gao.regex.first;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: gaopengxiang
 * Date: 11-12-8
 * Time: 下午6:20
 */
public class RegexTest {
    public static void main(String[] args) {
        String regex = "\\b.*cat.*\\b";
        String s = "cat cattology ldcatll sopshidtoeidcatsdsd";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
