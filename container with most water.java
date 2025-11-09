class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int maxwater = 0;

        while(left< right){
            int length = Math.min(height[left],height[right]);
            int breadth = right-left;
            int area = length * breadth;
            maxwater = Math.max(maxwater,area);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxwater;
    }
}
