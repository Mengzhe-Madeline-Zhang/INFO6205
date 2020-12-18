package edu.northeastern.mengzhe;

import java.util.Stack;

public class Q7 {
    public static String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Integer> stack = new Stack();
        Stack<StringBuilder> sb = new Stack();
        int num = 0;
        for (Character c : s.toCharArray()) {
            if (Character.isDigit(c)) num = num * 10 + c - '0';
            else if (Character.isLetter(c)) res.append(c);
            else if (c == '[') {
                stack.push(num);
                num = 0;
                sb.push(res);
                res = new StringBuilder();
            } else if (c == ']') {
                for (int j = 0, times = stack.pop(); j < times; j++) sb.peek().append(res);
                res = sb.pop();
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s1= "3[a]2[bc]";
        String s2= "3[a2[c]]";
        String s3= "2[abc]3[cd]ef";

        System.out.println(decodeString(s1));
        System.out.println(decodeString(s2));
        System.out.println(decodeString(s3));
    }
}
/**
 * Run Result

 aaabcbc
 accaccacc
 abcabccdcdcdef

 *
 * ***/