class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> h=new HashMap<>();
        int prefixsum=0;int c=0;
        h.put(0,1);
        for(int i=0; i<nums.length; i++){
            prefixsum+=nums[i];
            if(h.containsKey(prefixsum-k)){
                c+=h.get(prefixsum-k);
            }
            h.put(prefixsum,h.getOrDefault(prefixsum,0)+1);
        }
        return c;
    }
}