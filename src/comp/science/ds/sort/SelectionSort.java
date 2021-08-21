package comp.science.ds.sort;

public class SelectionSort {
    /***
     *The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.
     * 1) The subarray which is already sorted.
     * 2) Remaining subarray which is unsorted.
     * In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.
     * Following example explains the above steps:
     *
     */

    public static void main(String[] args) {

        int arr[] = {64,25,12,22,11};

        int [] sarr = selectionSort(arr);

        for(int k:sarr)
            System.out.println(k);
    }

    private static int [] selectionSort(int [] arr){
        for(int i=0;i<arr.length;i++){
            int min_idx = i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[min_idx])
                    min_idx =j;
            }
            if(min_idx>i){
                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
            }
        }
        return arr;
    }
}
