class Solution {
    public static boolean ispossible(int[] piles, long h,long mid){
        long sum=0;
        for(int i:piles){
            sum = sum + (long)(Math.ceil((double)i/(double)mid));
        }
        if(sum<=h)
        return true;
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles); long ans=-1;
        long l=1; long r=piles[piles.length-1];
        while(l<=r){
            long mid=(l+r)/2;
            if(ispossible(piles,(long)h,mid)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return (int)ans;
    }
}