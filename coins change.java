import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public int coinChange(int[] coins, int amount) {
        int count = 0;
        Arrays.sort(coins);
        for(int i=coins.length-1;i>=0;i--){
            while(amount >= coins[i]){
                amount -= coins[i];
                count++;
            }
        }
        if(amount == 0){
            return count;
        }else{
            return -1;
        }
    }
}
//optimised code is by the dp process
