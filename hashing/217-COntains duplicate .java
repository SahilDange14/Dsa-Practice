//217-COntains duplicate 
//Easy problem hashset 

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> Chee = new HashSet<>();
        for(int num : nums ){
            if(Chee.contains(num))
            {
                return true;
            }
            Chee.add(num);
        }
        return false;
        
    }
}
