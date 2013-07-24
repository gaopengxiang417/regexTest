package com.gao.regex.first;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: wangchen.gpx
 * Date: 13-7-24
 * Time: 下午4:30
 */
public class StartEndLookAtTest {
    public static void main(String[] args) {
        String[] strs = {"Java has regular expressions in 1.4"
        ,"regular expressions now expressing in Java"
        ,"Java represses oracular expressions"};

        Pattern pattern1 = Pattern.compile("re\\w*");
        Pattern pattern2 = Pattern.compile("Java.*");

        for (String str : strs) {
            //first display the string
            System.out.println("the string is :" + str);

            Matcher matcher1 = pattern1.matcher(str);
            Matcher matcher2 = pattern2.matcher(str);

            //start end find
            System.out.println("*****start pattern 1 ********");
            while (matcher1.find()) {
                System.out.println("group : " + matcher1.group() +
                ",start : " + matcher1.start() + ", end : " + matcher1.end());
            }
            System.out.println("*******end pattern 1 *********");


            System.out.println("*****start pattern 2 ********");
            while (matcher2.find()) {
                System.out.println("group : " + matcher2.group() +
                        ",start : " + matcher2.start() + ", end : " + matcher2.end());
            }
            System.out.println("*******end pattern 2 *********");

            matcher1.reset();
            //lookat
            System.out.println("*****start lookat pattern 1 *******");
            if (matcher1.lookingAt()){
                System.out.println("start : " + matcher1.start() + ", end : " +matcher1.end()
                + ",group : " + matcher1.group());
            }
            System.out.println("*********end lookat pattern1 ******");

            System.out.println("*****start lookat pattern 2 *******");
            if (matcher2.lookingAt()){
                System.out.println("start : " + matcher2.start() + ", end : " +matcher2.end()
                        + ",group : " + matcher2.group());
            }
            System.out.println("*********end lookat pattern2 ******");


            //matches
            System.out.println("*********start matches pattern1 ******");
            if(matcher1.matches()){
                System.out.println("matches start :" + matcher1.start() + ", end : " + matcher1.end() +
                ", group : " + matcher1.group());
            }
            System.out.println("*********end matches pattern1 ******");


            System.out.println("*********start matches pattern2 ******");
            if(matcher2.matches()){
                System.out.println("matches start :" + matcher2.start() + ", end : " + matcher2.end() +
                        ", group : " + matcher2.group());
            }
            System.out.println("*********end matches pattern2 ******");
        }
    }
}
