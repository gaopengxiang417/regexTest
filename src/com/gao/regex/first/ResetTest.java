package com.gao.regex.first;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: wangchen.gpx
 * Date: 13-7-24
 * Time: 下午6:39
 */
public class ResetTest {
    public static void main(String[] args) {
        String str = "fix the rug with bags";
        Pattern pattern = Pattern.compile("[frc][aiu][gx]");

        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        matcher.reset("fix the rig with rags");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
