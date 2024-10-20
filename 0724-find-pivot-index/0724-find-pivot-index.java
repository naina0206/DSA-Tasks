class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] sumLeft=new int[n];
        int[] sumRight=new int[n];
        sumLeft[0]=0;
        for(int i=1;i<n;i++){
            sumLeft[i]=sumLeft[i-1]+nums[i-1];
        }
        sumRight[n-1]=0;
        for(int j=n-2;j>=0;j--){
            sumRight[j]=sumRight[j+1]+nums[j+1];
        }
        for(int i=0;i<n;i++){
            if(sumLeft[i]==sumRight[i]) return i;
        }
        return -1;
    }
}