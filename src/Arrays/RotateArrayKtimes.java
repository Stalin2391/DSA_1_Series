class Solution {
    public void rotate(int[] nums, int k) {
        int N = nums.length;

        k = k % N;

        reverse(nums, 0, N - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, N - 1);
    }

    public void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}