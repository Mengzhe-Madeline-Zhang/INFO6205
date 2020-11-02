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
