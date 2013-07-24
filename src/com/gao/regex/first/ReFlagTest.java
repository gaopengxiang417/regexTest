package com.gao.regex.first;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: wangchen.gpx
 * Date: 13-7-24
 * Time: 下午4:49
 */
public class ReFlagTest {
    public static void main(String[] args) {
        String str = "Java has regex\n java has REGEX\n"+
                "JAVA has pretty good expression\n"+
                "Regular expression in java";

        Matcher matcher = Pattern.compile("^java", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE).matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
