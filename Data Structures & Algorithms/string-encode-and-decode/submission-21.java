class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for(String word : strs){
            result.append(word.length()).append('#').append(word);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            int j = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j+1, j+1 + len);
            result.add(word);
            i = j+len;
        }
        return result;
    }
}
