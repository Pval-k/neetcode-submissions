class Solution {
    public String minWindow(String s, String t) {
        String res = "";
        int minLen = Integer.MAX_VALUE;

        HashMap<Character, Integer> tmap = new HashMap<>();
        HashMap<Character, Integer> smap = new HashMap<>();

        for(int i = 0; i < t.length(); i++){
            tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0) +1);
        }

        int i = 0;
        int j = 0;
        int valid_letters = 0;
        int required = tmap.size();
        int start = 0;
        int end = 0;

        while(j < s.length()){
            smap.put(s.charAt(j), smap.getOrDefault(s.charAt(j), 0)+1);
            if(tmap.containsKey(s.charAt(j)) && tmap.get(s.charAt(j)).equals(smap.get(s.charAt(j)))){
                valid_letters++;
            }

            while(valid_letters == required){
                if(j-i+1 < minLen){
                    minLen = j-i+1;
                    start = i;
                    end = j;
                }
                
                smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) -1);
                
                if(tmap.containsKey(s.charAt(i)) && tmap.get(s.charAt(i)) > smap.get(s.charAt(i))){
                    valid_letters--;
                }
                i++;
            }
            j++;
        }
        if(minLen ==Integer.MAX_VALUE){
            return res;
        }
        else{
            return s.substring(start, end+1);
        }

    }
}

