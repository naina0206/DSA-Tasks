class Solution {
    public int searchInsert(int[] a, int x) {
        int low=0;
        int high=a.length-1;
        int idx=-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(x<=a[mid]){
                idx=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(idx==-1)
        return a.length;
        return idx;
    }
}