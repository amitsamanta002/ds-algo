package comp.science.ds.array;

import java.util.HashMap;
import java.util.Map;

public class SortArrayZerosOnesTwos {

    /***
     * Given an array A[] consisting 0s, 1s and 2s. The task is to write a function that sorts the given array. The functions should put all 0s first, then all 1s and all 2s in last.
     * Examples:
     *
     *
     * Input: {0, 1, 2, 0, 1, 2}
     * Output: {0, 0, 1, 1, 2, 2}
     *
     * Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
     * Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
     */

    public static void main(String[] args) {
        int [] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        Map<Integer,Integer> hm = getElementCount(arr);

        int[] resultArr = new int[arr.length];
        int index =-1;

        for(Map.Entry<Integer,Integer> sets :hm.entrySet()){
            int value = sets.getKey();
            for(int i=0;i<=sets.getValue();i++){
                resultArr[++index] = value;
            }
        }

        for(int k:resultArr)
            System.out.println(k);

    }

    private static Map<Integer, Integer> getElementCount(int[] arr){
      Map<Integer,Integer> hm = new HashMap<>();

      for(int i:arr)
          hm.put(i,hm.get(i)==null?0:hm.get(i)+1);

      return hm;
    }


}
