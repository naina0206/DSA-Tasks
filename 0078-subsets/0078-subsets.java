class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ar=new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        subset(list,ar,nums,0);
        return list;
    }
    public static void subset(List<List<Integer>> list,List<Integer> ar,int [] nums,int i){
        if(i==nums.length){
            list.add(new ArrayList<>(ar));
            return;
        }
        ar.add(nums[i]);
        subset(list,ar,nums,i+1);
        ar.remove(ar.size()-1);
        subset(list,ar,nums,i+1);
    }
}