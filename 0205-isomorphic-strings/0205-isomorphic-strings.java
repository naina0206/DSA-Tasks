class Solution {
    public static boolean check(String s, String t){
        HashMap<Character, Character> h=new HashMap<>();
        for(int i=0; i<s.length() ;i++){
            char c1=s.charAt(i); char c2=t.charAt(i);
            if(!h.containsKey(c1)){
                h.put(c1,c2);
            }
            else{
                if(h.get(c1)!=c2)
                return false;
            }
        }
        return true;
    }
    public boolean isIsomorphic(String s, String t) {
        return check(s,t) && check(t,s);
    }
}