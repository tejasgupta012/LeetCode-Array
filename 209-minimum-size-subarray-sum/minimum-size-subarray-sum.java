class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,h=0,curr=Integer.MAX_VALUE;
        int sum=0;
        int minS= Integer.MAX_VALUE;
        for(h=0;h<nums.length;h++){
            sum=sum+nums[h];
            while(sum>=target){
                curr=h-l+1;
                minS=Math.min(minS,curr);
                sum=sum-nums[l];
                l++;

            }

        }
        return minS==Integer.MAX_VALUE?0:minS;
    }
}