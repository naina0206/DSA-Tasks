class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=1; i<n; i++){
            if(nums[i]<nums[i-1]){
                c++;
            }
        }
        if((nums[n-1]>nums[0] && c>0)|| c>1){
            return false;
        }
        return true;
    }
}