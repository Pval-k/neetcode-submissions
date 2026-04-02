class Solution {

    public String encode(List<String> strs) {
        StringBuilder answer = new StringBuilder();
        for(String word : strs){
            answer.append(word.length()).append('#').append(word);
        }
        return answer.toString();
    }

    public List<String> decode(String str) {
        List<String> answer = new ArrayList<>();
        int left = 0;
        int length;
        while(left < str.length()){
            int right = left;
            while(str.charAt(right) != '#'){
                    right++;
            }
            length = Integer.parseInt(str.substring(left,right));
            left = right + 1;
            right = left + length;
            answer.add(str.substring(left,right));
            left = right;
        }
        return answer;
    }
}
//left = right; isn't correct you need to go to the character after that
//at the end: left = right; not left = right+ 1; bc of substring it is already one extra
//check while(str.charAt(right) != '#'){. don't forget to use str, its != # not ==
//Integer.parseInt must convert string to integer
//left = right + 1; right is at # so must point to the letter after
