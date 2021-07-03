package comp.science.ds.array;

public class KeyPresentEverySegment {

    /***
     * Given an array arr[] and size of array is n and one another key x, and give you a segment size k.
     * The task is to find that the key x present in every segment of size k in arr[].
     * Complexity Analysis-  a) Time Complexity = O(n)  and Space complexity = O(1)
     *
     */

    public static void main(String[] args) {
        int [] arr = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3};
        int num=3;
        int k=3;

        System.out.println(isPresentEachSegment(arr,k,num));

    }

    private static boolean isPresentEachSegment(int[] arr, int k, int num) {
        int matchCount = 0;
        boolean flag = true;

        if(arr==null || arr.length<=0)
            return false;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                matchCount = matchCount + 1;
                i = k*matchCount-1;
            }

            if ((i + 1) % k == 0) {
                if (matchCount != (i + 1) / k) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }


}

