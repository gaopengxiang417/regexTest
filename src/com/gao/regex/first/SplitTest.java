package com.gao.regex.first;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * User: wangchen.gpx
 * Date: 13-7-24
 * Time: 下午5:14
 */
public class SplitTest {
    public static void main(String[] args) {
        String str = "this is !! is a very !!intersting story!!thank you";

        Pattern pattern = Pattern.compile("!!");
        System.out.println(Arrays.asList(pattern.split(str)));
        System.out.println(Arrays.asList(pattern.split(str , 3)));
    }
}
