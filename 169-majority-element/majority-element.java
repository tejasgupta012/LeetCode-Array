class Solution {
    public int majorityElement(int[] nums) {
        int me=nums[0], value=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==me){
                value++;
            }
            else if(nums[i]!=me && value==1){
                me=nums[i];
            }
            else if(nums[i]!=me){
                value--;
            }
        }
        return me;
    }
}