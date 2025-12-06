//bruteforce approach
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        return subsequence(text1,text2,0,0);
    }
     public int subsequence(String s1,String s2,int i,int j){
            if(i == s1.length() || j == s2.length()){
                return 0;
            }

            if(s1.charAt(i) == s2.charAt(j)){
                return 1 + subsequence(s1,s2,i+1,j);
            }else{
                return Math.max(subsequence(s1,s2,i+1,j),subsequence(s1,s2,i,j+1));
            }
        }
}
