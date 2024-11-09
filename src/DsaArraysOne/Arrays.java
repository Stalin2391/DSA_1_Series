package DsaArraysOne;

public class Arrays {
    public static void printArrayElements(int[] arr){
        int N = arr.length;
        for(int i = 0; i < N; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void reverseArray(int[] arr){
        int N = arr.length;

        int i = 0, j = N - 1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        
        for(int k = 0; k < N; k++){
            System.out.print(arr[k] + " "); 
        }
    }

    public static void reversePart(int[] arr, int l, int r){
        int N = arr.length;
        int i = l;
        int j = r;

        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
