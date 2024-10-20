class Solution {
    public void sortColors(int[] nums) {
                int[] a=new int[3];
        for(int i: nums){
            a[i]++;
        }
        int pos=0;
        for(int i=0;i<nums.length;i++){
            while(a[pos]==0)
            pos++;
            nums[i]=pos;
            a[pos]--;
        }
    }
}