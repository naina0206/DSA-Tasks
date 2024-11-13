class Solution {
    public int mySqrt(int x) {
        long l=1; long r=x; long ans=0;
        while(l<=r){
            long mid=(l+r)/2;
            if(mid*mid>x){
                r=mid-1;
            }
            else{
                ans=mid;
                l=mid+1;
            }
        }
        return (int) ans;
    }
}