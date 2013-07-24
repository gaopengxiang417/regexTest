package com.gao.regex.first;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: wangchen.gpx
 * Date: 13-7-24
 * Time: 下午6:51
 */
public class CountRegexTest {
    public static void main(String[] args) {
        String number = "232-43-435";
        String number2 = "23243435";

        Pattern pattern = Pattern.compile("\\d{3}\\-?\\d{2}\\-?\\d{3}");
        Matcher matcher = pattern.matcher(number);

        System.out.println(matcher.matches());

        matcher.reset(number2);
        System.out.println(matcher.matches());


        String str = "2344ab";
        Matcher matcher1 = Pattern.compile("\\d{4}[A-Za-z]{2}").matcher(str);
        System.out.println(matcher1.matches());

        //^使用
        Matcher xssds = Pattern.compile("[^X][a-z]").matcher("Xssds");
        System.out.println(xssds.matches());

        //month
        String month = "jun 23, 2893";
        Pattern pattern1 = Pattern.compile("([a-zA-Z]+)\\s+\\d{1,2},\\s*\\d{4}");
        Matcher matcher2 = pattern1.matcher(month);
        System.out.println(matcher2.matches());

        matcher2.reset();

        while (matcher2.find()) {
            for (int i = 0 ; i <= matcher2.groupCount() ; i++){
                System.out.println(matcher2.group(i));
            }
        }


        //IP
        Pattern pattern2 = Pattern.compile("\\d{1,3}+\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
        Matcher matcher3 = pattern2.matcher("12.3.4.5");
        System.out.println(matcher3.matches());

        //html
        Matcher matcher4 = Pattern.compile("<\\s*font\\s*([^>]*)\\s*>").matcher("<font name=\"china\" age=\"44\">");
        Pattern pattern3 = Pattern.compile("([a-z]+)\\s*=\\s*\"([^\"+])\"");
        if (matcher4.matches()) {
            System.out.println("come in");
            matcher4.reset();
            while (matcher4.find()) {
                String group = matcher4.group(1);
                System.out.println(group);
                Matcher matcher5 = pattern3.matcher(group);
                while (matcher5.find()) {
                    System.out.println("find");
                    String name = matcher5.group(1);
                    String value = matcher5.group(2);
                    System.out.println(name +":"+value);
                }
            }
        }
    }
}
