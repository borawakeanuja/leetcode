class Solution {
    public String mergeAlternately(String word1, String word2) {
     int len = word1.length();
     int len2 = word2.length();
     StringBuilder result = new StringBuilder();
     for(int i =0 ; i< len || i <len2; i++){
        if(i< len)
        result.append(word1.charAt(i));
        if(i < len2)
        result.append(word2.charAt(i));
     }   
     return result.toString();
    }
}