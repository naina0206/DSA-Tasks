class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        String ans=""; String str="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                ans+=c;
                st.push(c);
            }
            else if(c==')' && !st.isEmpty()){
                ans+=c;
                st.pop();
            }
            if(st.isEmpty()){
                StringBuffer e=new StringBuffer(ans);
                e.deleteCharAt(0);
                e.deleteCharAt(e.length()-1);
                ans=e.toString();
                str+=ans;
                ans="";
            }
        }
        return str;
    }
}