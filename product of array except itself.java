//bruteforce approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int prod = 1;
            for(int j=0;j<nums.length;j++){
                if(i!= j){
                    prod *= nums[j]; 
                }
            }
            ans[i] = prod;
        }
        return ans;
    }
}

//prefix suffix approach....
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        for(int i=0;i<n;i++){
            ans[i] = 1;
        }

        //left side
        int left = 1;
        for(int i=0;i<n;i++){
            ans[i] *= left;
            left *= nums[i];
        }

        //right side
        int right = 1;
        for(int j=n-1;j>=0;j--){
            ans[j] *= right;
            right *= nums[j];
        }
        return ans;
    }
}
