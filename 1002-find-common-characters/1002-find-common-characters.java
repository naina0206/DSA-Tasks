class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0; i<words[0].length();i++){
            char c=words[0].charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=1;i<words.length;i++){
            HashMap<Character,Integer> curr=new HashMap<>();
            for(int j=0;j<words[i].length();j++){
               char c=words[i].charAt(j);
               curr.put(c,curr.getOrDefault(c,0)+1);
            }
            for(char c:map.keySet()){
                if(curr.containsKey(c))
                map.put(c,Math.min(curr.get(c),map.get(c)));
                else
                map.put(c,0);
            }
        }
        List<String> a=new ArrayList<>();
        for(char i:map.keySet()){
            while(map.get(i)!=0){
                a.add(String.valueOf(i));
                map.put(i,map.get(i)-1);
            }
        }
        return a;
    }
}