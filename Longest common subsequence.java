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
//dp top down approach
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int dp[][] = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        return subsequence(text1,text2,0,0,dp);
    }
    private int subsequence(String s1,String s2,int i,int j,int dp[][]){
        if(i == s1.length() || j == s2.length()){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s1.charAt(i) == s2.charAt(j)){
            return 1 + subsequence(s1,s2,i+1,j+1,dp);
        }else{
            int opt1 = subsequence(s1,s2,i+1,j,dp);
            int opt2 = subsequence(s1,s2,i,j+1,dp);
            dp[i][j] = Math.max(opt1,opt2);
        }
        return dp[i][j];
    }
}
