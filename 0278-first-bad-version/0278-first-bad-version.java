/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int r=n; int l=1; int mid=0;
        int ans=0;
        while(l<=r){
            mid=l+(r-l)/2;
            boolean b=isBadVersion(mid);
            if(b){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}