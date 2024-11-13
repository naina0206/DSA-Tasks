class Solution {
    public int findMin(int[] nums) {
        //Approach is that first the sorted half is recognized.
        //Then weknow ki min element sorted half m nhi aayega kyuki roating point par hee min hoga
        // agar rotating point mid hai toh mid ko bhi compare krengr sth mai
        int n=nums.length; 
        int l=0; int r=n-1;int min=nums[(l+r)/2];
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]>=nums[l]){
                min=Math.min(min,Math.min(nums[l],nums[mid]));
                l=mid+1;
            }
            else{
                min=Math.min(min,Math.min(nums[r],nums[mid]));
                r=mid-1;}
        }
        return min;
    }
}