//3427-Sum-of-variable-length-subarrays
//Presum easy problemm
class Solution {
    public int subarraySum(int[] nums) {
        int n = nums.length ;
        int[] prefix = new int[n] ;
        int finalsum = 0;
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        for (int i = 0; i < n; i++) {
            int start = Math.max(0, i - nums[i]);
            if(start == 0) finalsum += prefix[i];
            else finalsum += prefix[i] - prefix[start - 1];
        }
        return finalsum ;
    }
}
