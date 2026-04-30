//2520-Count-digits-that-divide-number
//Math easyy
class Solution {
    public int countDigits(int num) {
        int og = num , ans = 0 ;
        while(num > 0){
            int n = num % 10 ;
            if(og % n == 0) ans++;
            num /= 10 ;
        }
        return ans;
    }
}
