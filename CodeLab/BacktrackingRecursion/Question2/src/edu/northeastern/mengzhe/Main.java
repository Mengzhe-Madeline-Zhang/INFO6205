package edu.northeastern.mengzhe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates);
        getSum(candidates, target, result, new ArrayList<>(), 0);
        System.out.println(result);
        return  result;
    }

     static void getSum(int[] candidates, int target, List<List<Integer>> res, List<Integer> coins, int low){
        if(target == 0){
            res.add(new ArrayList<Integer>(coins));
            return;
        }


        for(int i =low; i< candidates.length; i++){
            if (i> low && candidates[i-1]==candidates[i]) continue;
            if (candidates[i] <= target){
                coins.add(candidates[i]);
                getSum(candidates, target-candidates[i], res, coins, i+1);
                coins.remove(coins.size()-1);
            } else return;

        }
    }



    public static void main(String[] args) {
        int[] cents = new int[]{1,1,1,1,1,5,5,5,10,10,10,10,25,25};

        combinationSum(cents, 73);

    }

    /**
     * Run Result
     * [[1, 1, 1, 5, 5, 5, 10, 10, 10, 25], [1, 1, 1, 5, 5, 10, 25, 25], [1, 1, 1, 5, 10, 10, 10, 10, 25], [1, 1, 1, 10, 10, 25, 25]]
     **/
}
