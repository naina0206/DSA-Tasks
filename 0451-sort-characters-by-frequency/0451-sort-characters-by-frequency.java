class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        List<Map.Entry<Character, Integer> > list =
               new LinkedList<Map.Entry<Character, Integer> >(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() {
            public int compare(Map.Entry<Character, Integer> o1, 
                               Map.Entry<Character, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
         
        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        String st="";
        for(char c: temp.keySet()){
            int t=temp.get(c);
            while(t-->0){
                st+=c;
            }
        }
        return st;
    }
}