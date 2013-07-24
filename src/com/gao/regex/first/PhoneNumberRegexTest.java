package com.gao.regex.first;

import java.util.regex.Pattern;

/**
 * User: wangchen.gpx
 * Date: 13-7-24
 * Time: 下午2:16
 */
public class PhoneNumberRegexTest {
    public static void main(String[] args) {
        String regexStr = "\\(\\d{3}\\)\\d{3}[\\-|]\\d{4}";
        Pattern pattern = Pattern.compile(regexStr);
        String number = "(443)343-5442";
        System.out.println(pattern.matcher(number).matches());
        System.out.println(pattern.matcher("(2323)433-2222").matches());


        //一个更加通用的例子
        String regexStrTwo = "(\\(\\d{3}\\)|\\d{3})\\d{3}[\\-|]\\d{4}";
        System.out.println(Pattern.compile(regexStrTwo).matcher(number).matches());
    }
}
