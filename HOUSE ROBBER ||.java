class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];

        //case 1 : exclude last
        int case1 = robchange(nums,0,n-2);
        //case 2 : exclude first
        int case2 = robchange(nums,1,n-1);

        return Math.max(case1,case2);
    }
    private int robchange(int nums[],int start,int end){
        if(start == end) return nums[start];
        int prev2 = nums[start];
        int prev1 = Math.max(nums[start],nums[start+1]);
        int ans = prev1;
        for(int i = start +2 ;i<=end;i++){
            int take = nums[i] + prev2;
            int skip = prev1;
            ans = Math.max(take,skip);

            prev2 = prev1;
            prev1 = ans;
        }
        return ans;
    }
}
