class Solution {
    public String minWindow(String s, String t) {
        String res = "";
        HashMap<Character, Integer> tmap = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0)+1);
        }
        HashMap<Character, Integer> smap = new HashMap<>();

        int i = 0;
        int j = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int chars_found = 0;
        int chars_required = tmap.size();

        while(j<s.length()){
            smap.put(s.charAt(j), smap.getOrDefault(s.charAt(j), 0) +1);
            if(tmap.containsKey(s.charAt(j)) && tmap.get(s.charAt(j)).equals(smap.get(s.charAt(j)))){
                chars_found++;
            }

            while(chars_found == chars_required){
                if(minLen > j-i+1){
                    minLen = j-i+1;
                    start = i;
                    end = j;
                }

                smap.put(s.charAt(i), smap.get(s.charAt(i))-1);
                if(tmap.containsKey(s.charAt(i)) && tmap.get(s.charAt(i)) > smap.get(s.charAt(i))){
                    chars_found--;
                }
                i++;

            }
            j++;
        }

        if(minLen == Integer.MAX_VALUE){
            return res;
        }
        else{
            return s.substring(start,end+1);
        }
        
    }
}
