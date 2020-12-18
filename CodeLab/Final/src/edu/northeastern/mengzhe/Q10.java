package edu.northeastern.mengzhe;

import java.util.TreeMap;

public class Q10 {
    public static int minMeetingRooms(int[][] intervals) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int[] interval: intervals) {
            map.put(interval[0], map.getOrDefault(interval[0], 0) + 1);
            map.put(interval[1], map.getOrDefault(interval[1], 0) - 1);
        }

        int max = 0;
        int count = 0;
        for(Integer key: map.keySet()) {
            count += map.get(key);
            max = Math.max(max, count);
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] inter1={{0,30},{5,10},{15,20}};
        int[][] inter2={{7,10},{2,4}};
        System.out.println(minMeetingRooms(inter1));
        System.out.println(minMeetingRooms(inter2));
    }
}
/**
 * Run Result

 2
 1

 *
 * ***/