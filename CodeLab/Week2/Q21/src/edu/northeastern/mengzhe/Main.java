package edu.northeastern.mengzhe;

import java.util.HashMap;

 class Q21 {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        HashMap< Integer, Integer > hash = new HashMap < > ();
        int[] res = new int[findNums.length];
        int j;
        for (int i = 0; i < nums.length; i++) {
            hash.put(nums[i], i);
        }
        for (int i = 0; i < findNums.length; i++) {
            for (j = hash.get(findNums[i]) + 1; j < nums.length; j++) {

                if (findNums[i] < nums[j]) {
                    res[i] = nums[j];
                    break;
                }
            }
            if (j == nums.length) {
                res[i] = -1;
            }
        }
        return res;
    }
}