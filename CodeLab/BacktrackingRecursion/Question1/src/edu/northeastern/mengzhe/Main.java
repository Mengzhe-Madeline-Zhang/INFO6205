package edu.northeastern.mengzhe;


import java.util.Stack;

public class Main {

    public static Stack<Integer> coins = new Stack<Integer>();
    public static void main(String[] args) {

        int cents[]={5,10,25};
        q1(cents, 5, 0);

    }

    private static void q1(int[] cents, int picks, int cur){
        if (cur == picks){
            System.out.println(coins);
            return;
        }

        for (int i=0; i< cents.length; i++){
            coins.add(cents[i]);
            q1(cents, picks, cur+1);
            coins.pop();

        }
    }
}

/**
 * Run Result
 * [5, 5, 5, 5, 5]
 * [5, 5, 5, 5, 10]
 * [5, 5, 5, 5, 25]
 * [5, 5, 5, 10, 5]
 * [5, 5, 5, 10, 10]
 * [5, 5, 5, 10, 25]
 * [5, 5, 5, 25, 5]
 * [5, 5, 5, 25, 10]
 * [5, 5, 5, 25, 25]
 * [5, 5, 10, 5, 5]
 * [5, 5, 10, 5, 10]
 * [5, 5, 10, 5, 25]
 * ......
 * [25, 25, 5, 10, 25]
 * [25, 25, 5, 25, 5]
 * [25, 25, 5, 25, 10]
 * [25, 25, 5, 25, 25]
 * [25, 25, 10, 5, 5]
 * [25, 25, 10, 5, 10]
 * [25, 25, 10, 5, 25]
 * [25, 25, 10, 10, 5]
 * [25, 25, 10, 10, 10]
 * [25, 25, 10, 10, 25]
 * [25, 25, 10, 25, 5]
 * [25, 25, 10, 25, 10]
 * [25, 25, 10, 25, 25]
 * [25, 25, 25, 5, 5]
 * [25, 25, 25, 5, 10]
 * [25, 25, 25, 5, 25]
 * [25, 25, 25, 10, 5]
 * [25, 25, 25, 10, 10]
 * [25, 25, 25, 10, 25]
 * [25, 25, 25, 25, 5]
 * [25, 25, 25, 25, 10]
 * [25, 25, 25, 25, 25]
 * */