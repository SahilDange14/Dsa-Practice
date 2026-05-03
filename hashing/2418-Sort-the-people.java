//2418-Sort-the-people
//HAshmap easy problem 


class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> ppl = new HashMap<>();
        for(int i = 0 ; i < names.length ; i++){
            ppl.put( heights[i] , names[i]);
        }
        Arrays.sort(heights);
        int left = 0, right = heights.length - 1;
        while(left < right) {
            int temp = heights[left];
            heights[left] = heights[right];
            heights[right] = temp;
            left++;
            right--;
        }
        for(int i = 0 ; i < names.length ; i++){
            names[i] = ppl.get(heights[i]);
        }
        return names;
    }
}
