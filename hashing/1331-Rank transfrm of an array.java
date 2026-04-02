//1331-Rank transfrm of an array
//HashMap easy question 
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer , Integer> check = new HashMap<>();
        int n = arr.length;
        int[] dup = arr.clone();
        Arrays.sort(dup);
        int rank = 1 ;
        for(int num : dup){
            if(! check.containsKey(num)){
                check.put(num , rank);
                rank ++ ;
            }
        }
        for(int i = 0 ; i < n ; i++){
            arr[i] = check.get(arr[i]) ;
        }
        return arr ;
    }
}
