import DsaArraysOne.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        // int[] arr = {3,7,5,9,2,8};
        // Arrays.printArrayElements(arr);
        // System.out.println();
        // Arrays.reverseArray(arr);

        //Reverse part of an array
        int[] ar = {13,7,8,4,12,9,6,5,1,18};
        // int l = 3, r = 8;

        // Arrays.reversePart(ar, l, r);

        int k = 4;
        rotateK(ar, k);
        for(int i = 0; i < ar.length; i++){
            System.out.print(ar[i] + " "); 
        }

    }

    public static void rotateK(int[] arr, int k){

        // Steps to follow rotate k times
        /*  
            Idea:
                1) -> Reverse the Entire array
                2) -> Reverse first k elements
                3) -> Reverse the remaining elements 

        */
        int N = arr.length;

        // Handle the case when k is larger than the length of the array
        k = k % N;  // Ensure k is within the bounds of the array size
        
        // Reverse the entire array
        Arrays.reversePart(arr, 0, N - 1);
        
        // Reverse the first k elements
        Arrays.reversePart(arr, 0, k - 1);
        
        // Reverse the remaining elements
        Arrays.reversePart(arr, k, N - 1);
    }
}
