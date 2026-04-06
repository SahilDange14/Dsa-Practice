//3432-Count-partioons-even-sum-diffrence
//Prefix sum easy problem 
//One pass solution for left and rightsum !! 
class Solution {
    public int countPartitions(int[] nums) {
        int count = 0, n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        int totalSum = prefix[n - 1];
        for (int i = 0; i < n - 1; i++) {
            int leftSum = prefix[i];
            int rightSum = totalSum - leftSum;
            int diff = leftSum - rightSum;
            if (diff % 2 == 0) count++ ;
        }
        return count;
    }
}
