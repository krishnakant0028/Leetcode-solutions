class Solution {
    public int[] runningSum(int[] nums) {
        int [] prefix = new int [ nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length;i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        int l = 0;
        int r = nums.length-1;
        int sum;
        if(l==0){
            sum = prefix[r];
        }else{
            sum = prefix[r]-prefix[l-1];
        }
        return prefix ;  
    }
}