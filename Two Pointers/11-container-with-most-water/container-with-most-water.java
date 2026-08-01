class Solution {
    public int maxArea(int[] height) {
        int l=0,h=height.length-1,max=0;
        int sqr=0;
        while(l<h){
            sqr=Math.min(height[l],height[h])*(h-l);

            max=Math.max(sqr,max);
            if(height[l]<height[h]){
                l++;
            }
            else{
                h--;
            }

        }
        return max;
    }
}
