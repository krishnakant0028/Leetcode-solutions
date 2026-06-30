class Solution {
    public int findMiddleIndex(int[] nums) {
        int [] prefix = new int [nums.length];
        prefix[0] = nums[0];
        for ( int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }for (int i = 0; i < nums.length; i++){
            int leftSum;
            int rightSum;
            if ( i == 0){
                leftSum = 0;
            }else{
                leftSum = prefix[i-1];
            }rightSum = prefix[nums.length-1]- prefix[i];
            if (leftSum == rightSum){
                return i;
            }

        }return -1;
        
    }
}