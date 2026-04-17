//3683-Earliest-time-to-finish-task
class Solution {
    public int earliestTime(int[][] tasks) {
        int ans = Integer.MAX_VALUE;
        
        for(int[] task : tasks) {
            int finishTime = task[0] + task[1]; //to calculate total time needed 
            ans = Math.min(ans, finishTime);
        }
        return ans;
    }
}
