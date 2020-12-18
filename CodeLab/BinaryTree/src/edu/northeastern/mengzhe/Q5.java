package edu.northeastern.mengzhe;

import java.util.ArrayList;

public class Q5 {
        static int res = 0;

        public static int treeDiameter(int[][] edges) {
            if(edges == null || edges.length == 0){
                return 0;
            }

            int n = edges.length + 1;
            ArrayList<Integer>[] arr = new ArrayList[n];
            for(int i = 0; i < n; i++){
                arr[i] = new ArrayList<Integer>();
            }

            for(int [] e : edges){
                arr[e[0]].add(e[1]);
                arr[e[1]].add(e[0]);
            }

            dfs(0, arr, -1);

            return res;
        }

        private static int dfs(int root, ArrayList<Integer>[] arr, int parent){
            int max1 = 0;
            int max2 = 0;
            for(int next : arr[root]){
                if(next != parent){
                    int depth = dfs(next, arr, root);
                    if(depth > max1){
                        max2 = max1;
                        max1 = depth;
                    }else if(depth > max2){
                        max2 = depth;
                    }
                }
            }

            res = Math.max(res, max1 + max2);
            return max1 + 1;
        }
    public static void main(String[] args) {
        int[][] edge1 = {{0,1},{0,2}};
        int[][] edge2 = {{0,1},{1,2},{2,3},{1,4},{4,5}};
        System.out.println(treeDiameter(edge1));
        System.out.println(treeDiameter(edge2));
    }

}
/**
 * Run Result

 2
 4

 *
 * ***/