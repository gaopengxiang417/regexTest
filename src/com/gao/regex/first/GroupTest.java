package com.gao.regex.first;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: wangchen.gpx
 * Date: 13-7-24
 * Time: 下午4:06
 */
public class GroupTest {
    public static void main(String[] args) {
        String str = "Twas brillig, and the slithy toves\n" +
                "Did gyre and gimble in the wabe.\n" +
                "All mimsy were the borogoves,\n" +
                "And the mome raths outgrabe.\n" +
                "Beware the Jabberwock, my son,\n" +
                "The jaws that bite, the claws that catch.\n" +
                "Beware the Jubjub bird, and shun\n" +
                "The frumious Bandersnatch.";

        Matcher matcher = Pattern.compile("(\\S+)\\s+((\\S+)\\s+(\\S+))").matcher(str);

        while (matcher.find()) {
            for (int i = 0 ; i <= matcher.groupCount() ; i++){
                System.out.println(matcher.group(i));
            }
            System.out.println("******************");
        }
    }
}
