class Solution {
        public List<String> generateParenthesis(int n) {
                List<String> ls=new ArrayList<>();
                parenthesis(n,0,0,"",ls);
                return ls;
}
public static void parenthesis(int n, int open,int close,String ans,List<String> ls){
if(open==n && close==n){
    ls.add(ans);
    return;
}
if(open<n)
parenthesis(n,open+1,close,ans+"(",ls);
if(close<open)
parenthesis(n,open,close+1,ans+")",ls);
}}
