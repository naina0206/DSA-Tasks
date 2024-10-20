class Solution {
    public int maxArea(int[] height) {
         int n=height.length;
        int left=0;
        int right=n-1;
        int maxarea=0;
        while(left<right){
            int min=Math.min(height[left],height[right]);
            int currarea=(right-left)*min;
            maxarea=Math.max(maxarea,currarea);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
}