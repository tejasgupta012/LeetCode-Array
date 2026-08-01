class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                c=0;
            }
            else{
                c=c+1;
            }
            if(c>m){
                m=c;

            }
             
        }
        return m;
    }
}