//2427.number-of-common-factors
//Math enumeration easy problem 
class Solution {
    public int commonFactors(int a, int b) {
        int x = 1 , ans = 0 ;
        int min = Math.min(a,b);
        while(x <= min){
            if(a % x == 0 && b % x == 0) ans++ ;
            x++ ;
        }
        return ans ;
    }
}
