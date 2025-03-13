class Solution {
    public int majorityElement(int[] nums) {
        int ele = 0;
        int count = 0;

        int N = nums.length;

        for(int i = 0; i < N; i++){
            if(count == 0){
                count++;
                ele = nums[i];
            }else if(nums[i] == ele){
                count++;
            }else {
                count--;
            }
        }

        return ele;
    }
}