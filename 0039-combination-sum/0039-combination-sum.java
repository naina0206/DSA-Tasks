class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ls = new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        comb(candidates,target,ls,l,0);
        return ls;
    }
    public static void comb(int[] a, int t, List<List<Integer>> ls,List<Integer> l,int start){
        if(t==0){
            ls.add(new ArrayList<>(l));
            return;
        }
        if(t<0){
            return;
        }
        for(int i=start;i<a.length;i++){
            l.add(a[i]);
            comb(a,t-a[i],ls,l,i);
            l.remove(l.size()-1);
        }
    }
}