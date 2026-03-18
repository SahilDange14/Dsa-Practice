//HashTable easy problem 
//169-Majority element 


class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> check = new HashMap<>();
        int target = nums.length / 2;
        for(int num : nums){
            check.put(num, check.getOrDefault(num, 0) + 1);
            if (check.get(num) > target) {
                return num; 
            }
        }
        return -1;
    }
}
