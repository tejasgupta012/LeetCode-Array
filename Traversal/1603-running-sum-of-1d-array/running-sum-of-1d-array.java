class Solution {
    public int[] runningSum(int[] nums) {

        int s=0;
        int n= nums.length;
        int[] runningSum = new int[n];
        for (int i=0;i<n;i++){
            s=s+nums[i];
            runningSum[i]=s;
            
        }
        return runningSum;
    }
    
}
