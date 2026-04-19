//Array easy problem
//2678-Number-of-old-citizens
// tackling most hated string problems xD

class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for(String detail : details) {
            // Extract age from index 11 and 12 
            int age = (detail.charAt(11) - '0') * 10 + (detail.charAt(12) - '0');
            if(age > 60) ans++;
        }
        return ans;
    }
}
