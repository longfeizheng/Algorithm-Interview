package com.niocoder._14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1.排序之后再比较是否相等
 * 2.每个字符在字符串中出现的个数
 * Created on 2019/4/7.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public class IsAnagramMain {

    public static void main(String[] args) {
        System.out.println(isAnagram("ab","ba"));
        System.out.println(isAnagram1("ab","ba"));
    }


    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> s1 = new HashMap<>();
        Map<Character, Integer> t1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            s1.put(s.charAt(i), null==s1.get(s.charAt(i))?1:s1.get(s.charAt(i))+1);
        }
        for (int i = 0; i < t.length(); i++) {
            t1.put(t.charAt(i), null==t1.get(t.charAt(i))?1:t1.get(t.charAt(i))+1);
        }
        return s1.equals(t1);
    }

    /**
     * 相当于自定义了一套hash算法
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram1(String s, String t) {
        int[] sCounts = new int[26];
        int[] tCounts = new int[26];
        for (char ch : s.toCharArray()) {
            sCounts[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            tCounts[ch - 'a']++;
        }
        return Arrays.equals(sCounts,tCounts);
    }
}
