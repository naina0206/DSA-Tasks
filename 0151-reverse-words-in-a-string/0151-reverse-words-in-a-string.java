class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] a=s.split("\\s+");
        String res="";
        for(int i=a.length-1; i>0 ; i--){
            res+=a[i]+" ";
        }
        return res+a[0];
    }
}