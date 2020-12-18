package edu.northeastern.mengzhe;

public class Q1 {
    public static String addStrings(String num1, String num2) {

            StringBuilder sb = new StringBuilder();
            int car = 0;

            for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || car == 1; i--, j--) {
                int x = i < 0 ? 0 : num1.charAt(i) - '0';
                int y = j < 0 ? 0 : num2.charAt(j) - '0';
                sb.append((x + y + car) % 10);
                car = (x + y + car) / 10;
            }
            return sb.reverse().toString();
        }


    public static void main(String[] args) {
        System.out.println(addStrings("129","2222"));
    }
}
/**
 * Run Result

 2351

 *
 * ***/
