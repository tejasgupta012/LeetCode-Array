class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int arr[]= new int[nums.length];
        int first=0, last=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[first]=nums[i];
                first++;
            }
            else{
                arr[last]=nums[i];
                last--;
            }
        }
        return arr;
    }
}
