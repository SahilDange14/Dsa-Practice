//1389-Target-array-in-given-order
//Easy simulation lah 
// used specific index insertion to add at perfect index 

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]); // inserting in to da listtttttt
        }
        int[] result = new int[target.size()]; // list to array converion before returning a
        for(int i = 0; i < target.size(); i++) {
            result[i] = target.get(i);
        }
        return result;
    }
}
