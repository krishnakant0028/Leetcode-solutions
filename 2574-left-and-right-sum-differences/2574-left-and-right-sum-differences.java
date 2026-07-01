class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] prefix = new int[nums.length];
        int [] answer = new int[nums.length];
        prefix[0] = nums[0];
        for ( int i = 1; i < nums.length;i++){
            prefix[i] = prefix[i -1] + nums[i];
        }for (int i = 0;i < nums.length;i++){
            int leftSum =0;
            int rightSum =0;
            if (i > 0){
                leftSum = prefix[i-1];
            }if (i < nums.length-1){
                rightSum = prefix[nums.length-1]-prefix[i];
            }answer[i] = Math.abs(leftSum-rightSum);
        }return answer;  
       
    }
}