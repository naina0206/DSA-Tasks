class Solution {
    public static int first(int[] a, int target){
        int ans=-1;
        int s=0; int e=a.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(a[mid]==target){
                ans=mid;
                e=mid-1;
            }
            else if(a[mid]<target){
                s=mid+1;
            }
            else
            e=mid-1;
        }
        return ans;
    }
    public static int last(int[] a, int target){
        int ans=-1;
        int s=0; int e=a.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(a[mid]==target){
                ans=mid;
                s=mid+1;
            }
            else if(a[mid]<target){
                s=mid+1;
            }
            else
            e=mid-1;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int a=first(nums,target);
        int b=last(nums,target);
        int[] arr={a,b};
        return arr;
    }
}