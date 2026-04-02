class Solution {

    public String encode(List<String> strs) {
         StringBuilder answer = new StringBuilder();
    for (String word : strs) {
        answer.append(word.length()).append('#').append(word);
    }
    return answer.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> answer = new ArrayList<>();
        for(int i =0; i< str.length();){
            int j = str.indexOf('#',i);
            int len = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j+1,j+1+len);
            answer.add(word);

            i = j+1+len;
        }
        return answer;
    }
}
