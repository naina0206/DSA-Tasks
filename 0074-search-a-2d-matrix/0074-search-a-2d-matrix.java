class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int l=0; int r=m-1;
        int i=0;
        while(i<n && l<=r){
            int mid=l+(r-l)/2;
            if(matrix[i][mid]==target) return true;
            else if(target>matrix[i][m-1]){ 
                i++; l=0; r=m-1;
            }
            else if(matrix[i][mid]>target) r=mid-1;
            else if(matrix[i][mid]<target) l=mid+1;
        }
        return false;
    }
}