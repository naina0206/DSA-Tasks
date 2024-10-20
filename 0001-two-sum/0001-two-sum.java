class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer,Integer> h=new HashMap<>(); 
        for(int i=0;i<nums.length;i++){
            int req=target-nums[i];
            if(h.containsKey(req)){
                return new int[]{h.get(req),i};
            }
            else{
                h.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}