class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=0, h= nums.length-1;
        int number[]=new int[2];
        while(l<h){
            if(nums[l]+nums[h]==target){
                number[0]=l+1;
                number[1]=h+1;
                break;
            }
            else if((nums[l]+nums[h])>target){
                h=h-1;
            }
            else if(nums[l]+nums[h]<target){
                l=l+1;
            }
            
        }
        return (number);
    }
}
