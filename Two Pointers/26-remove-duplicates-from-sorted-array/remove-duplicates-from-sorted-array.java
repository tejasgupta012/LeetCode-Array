class Solution {
    public int removeDuplicates(int[] nums) {
        int m=nums[0],c=1;
        for(int i=1;i<nums.length;i++){
            if(m==nums[i]){
                continue;
            }
            else{
                m=nums[i];
                nums[c]=m;
                c++;
            }

        }
        return c;
    }
}
