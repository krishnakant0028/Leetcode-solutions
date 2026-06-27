class Solution {
    public int differenceOfSum(int[] nums) {
         int sum = 0;
        for ( int i = 0; i <nums.length; i++){
            sum += nums[i];

        }int sd = 0;
        for (int kk : nums){
            while (kk != 0){
                sd = sd + ( kk % 10);
                kk = kk / 10;
            }
        }int hs = sum - sd;
        return hs;
        
        
    }
}