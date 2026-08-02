class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int arr[]= new int[nums.length];
        int first=0, last=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[first]=nums[i];
                first+=2;
            }
            else{
                arr[last]=nums[i];
                last+=2;
            }
        }
        return arr;
    }
}
