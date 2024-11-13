class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Arrays.sort(strs);
        // int i=0; int j=0; 
        // char[] a=strs[0].toCharArray();
        // char[] b=strs[strs.length-1].toCharArray();
        // String res="";
        // while(i<a.length && j<b.length){
        //     if(a[i]==b[j]){
        //         res+=a[i];
        //         i++; j++;
        //     }
        //     else
        //     break;
        // }
        // return res;
        Arrays.sort(strs);
        String word1=strs[0]; String word2=strs[strs.length-1];
        String res=""; int limit=Math.min(word1.length(),word2.length());
        for(int i=0; i<limit ;i++){
            if(word1.charAt(i)==word2.charAt(i))
            res+=word1.charAt(i);
            else
            break;
        }
        return res;
    }
}