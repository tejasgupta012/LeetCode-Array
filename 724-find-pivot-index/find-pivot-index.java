class Solution {
    public int pivotIndex(int[] nums) {
        int suml=0,sumr=0;int c=0,s=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                suml=suml+nums[j];
            }
            for(int k=i+1;k<nums.length;k++){
                sumr=sumr+nums[k];
            }
            if(sumr==suml){
                s=i;
                c++;
                break;
                
            }
            sumr=0;
            suml=0;
            
        }
        if(c!=1){
            return -1;
        }
        else{
            return s;
        }
    }
}