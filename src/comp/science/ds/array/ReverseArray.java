package comp.science.ds.array;

/***
 * Given an array (or string), the task is to reverse the array/string.
 */
public class ReverseArray {

    public static void main(String[] args) {
       int[] arr = {4, 5, 1, 2};

       /*int[] rarr = reverseArray(arr);
       System.out.println("Sequential travel:: ")
       for(int i=0;i<rarr.length;i++){
           System.out.print(rarr[i]+"\b");
       }
       */
       System.out.println("Using recursion:");

       recursionArrayReverse(arr,0,arr.length-1);

       for(int i=0;i<arr.length;i++)
           System.out.println(arr[i]);

    }

    private static int [] reverseArray(int[] arr){
        int [] rarr = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            rarr[(arr.length-1)-i] = arr[i];
        }
        return rarr;
    }

    private static void recursionArrayReverse(int[] arr, int start, int end){

        if(start>=end)
            return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        recursionArrayReverse(arr,start+1, end-1);
    }
}
