package comp.science.ds.array;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class findManMin {
    /***
     * Given an array, write functions to find the minimum and maximum elements in it.
     *
     */

    public static void main(String[] args) {
        int arr[] = { 12, 1234, 45, 67, 1 };

        System.out.println("Max element in array ::" +findMax(arr));
        System.out.println("Min element in array ::"+findMin(arr));

    }

    private static int findMin(int [] arr){
        int min = arr[0];
        for(int i:arr){
            min = Math.min(min,i);
        }
        return min;
    }

    private static int findMax(int [] arr){
        int max = arr[arr.length-1];
        for(int i:arr)
            max = Math.max(max,i);
        return max;
    }
}
