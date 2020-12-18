package edu.northeastern.mengzhe;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q3 {
    public static String removeDuplicates(String s, int k) {
                 StringBuilder sb = new StringBuilder(s);
                 Deque<Integer> stack = new ArrayDeque<>();
                 for (int i = 0; i < sb.length(); i++) {
                         if (i == 0 || sb.charAt(i) != sb.charAt(i - 1)) {
                                 stack.push(1);
                             } else {
                                 int count = stack.pop() + 1;
                                 if (count == k) {
                                         sb.delete(i - k + 1, i + 1);
                                         i = i - k;
                                    } else {
                                         stack.push(count);
                                     }
                             }
                     }
                 return sb.toString();
             }
    public static void main(String[] args) {
        String s1= "abcd";
        String s2= "deeedbbcccbdaa";
        System.out.println(removeDuplicates(s1,2));
        System.out.println(removeDuplicates(s2,3));
    }
}
/**
 * Run Result

 abcd
 aa

 *
 * ***/