package com.gao.regex.first;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: wangchen.gpx
 * Date: 13-1-21
 * Time: 下午2:24
 */
public class NumberRegexTest {
    public static void main(String[] args) {
        String regex = "//(//d{3}//)//s//d{3}-//d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("(233) 342-3243");
        boolean matches = matcher.matches();
        System.out.println(matches);
    }
}
