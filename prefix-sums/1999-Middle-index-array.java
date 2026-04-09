//1999-Middle-index in an array
//Prefxi sum easyy 


class Solution {
    public int findMiddleIndex(int[] nums) {
        int total = 0 , leftsum = 0 ;
        for(int num : nums){
            total += num ;
        }
        for(int i = 0 ; i < nums.length ; i++){
            int rightsum = total - nums[i] - leftsum ;
            if(leftsum == rightsum) return i;
            leftsum += nums[i] ;
        }
        return -1;
    }
}
