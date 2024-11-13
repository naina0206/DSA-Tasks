class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];
        Arrays.fill(res,-1);
        for(int i=0;i<nums1.length;i++){
            for(int j=nums2.length-1;j>=0;j--){
                if(nums2[j]>nums1[i]) res[i]=nums2[j];
                else if(nums1[i]==nums2[j]) break;
            }
        }
        return res;
    }
}