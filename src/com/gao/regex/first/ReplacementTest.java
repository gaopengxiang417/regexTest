package com.gao.regex.first;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: wangchen.gpx
 * Date: 13-7-24
 * Time: 下午6:23
 */
public class ReplacementTest {
    public static void main(String[] args) {
        String str = "/*! Here's a block of text to use as input to\n" +
                "    the regular expression matcher. Note that we'll\n" +
                "    first extract the block of text by looking for\n" +
                "    the special delimiters, then process the\n" +
                "    extracted block. !*/";

        Matcher matcher = Pattern.compile("/*!(.*)!*/" , Pattern.DOTALL).matcher(str);
        if (matcher.find()) {
            //首先获取匹配的内部内容
            str = matcher.group(1);
        }
        System.out.println(str);
        System.out.println("********华丽的分割线********");
        //然后将其中的多个空格替换为一个
        str = str.replaceAll(" {2,}", " ");
        //将开头的空格取消
        str = str.replaceAll("(?m)^ +" , "");
        System.out.println(str);

        //替换为大写
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher1 = Pattern.compile("[aeiou]").matcher(str);
        while (matcher1.find()) {
            matcher1.appendReplacement(stringBuffer, matcher1.group().toUpperCase());
        }
        matcher1.appendTail(stringBuffer);
        System.out.println(stringBuffer.toString());
    }
}
