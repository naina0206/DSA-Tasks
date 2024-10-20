class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0; int max=0;
        for(int i:nums){
            if(i==0){
                c=0;
            }
            else{
                c++;
            }
            max=Math.max(c,max);
        }
        return max;
    }
}