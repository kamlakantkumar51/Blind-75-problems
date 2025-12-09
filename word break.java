#bruteforce approach
import java.util.*;
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        return check(s,new HashSet<String>(wordDict));
    }
    private boolean check(String s,Set<String>dict){
        if(s.length() == 0){
            return true;
        }
        for(int i = 1;i<=s.length();i++){
            String prefix = s.substring(0,i);

            if(dict.contains(prefix)){
                if(check(s.substring(i),dict)){
                    return true;
                }
            }
        }
        return false;
    }
}
