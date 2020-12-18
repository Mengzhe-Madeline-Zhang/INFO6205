package edu.northeastern.mengzhe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q9 {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses <= 0 || prerequisites == null) {
            return true;
        }
        int[] num = new int[numCourses];
        List[] list = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            list[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < prerequisites.length; i++) {
            int m = prerequisites[i][0];
            int n = prerequisites[i][1];
            num[m]++;
            list[n].add(m);
        }
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                queue.offer(i);
                count++;
            }
        }
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (Object val : list[node]) {
                num[(Integer)val]--;
                if (num[(Integer)val] == 0) {
                    queue.offer((Integer)val);
                    count++;
                }
            }
        }
        return count == numCourses;
    }



    public static void main(String[] args) {
        int[][] pre1={{1,0}};
        int[][] pre2={{1,0},{0,1}};

        System.out.println(canFinish(2, pre1));
        System.out.println(canFinish(2, pre2));
    }
}
/**
 * Run Result

 true
 false

 *
 * ***/