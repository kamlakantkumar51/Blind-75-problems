class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans = new ArrayList<>();
        backtrack(candidates,0,target,new ArrayList<>(),ans);
        return ans;
    }
    private void backtrack(int arr[],int i,int target,List<Integer>curr,List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(i>= arr.length || target<0) return;
        //include
        curr.add(arr[i]);
        backtrack(arr,i,target-arr[i],curr,ans);
        curr.remove(curr.size()-1);

        //skip
        backtrack(arr,i+1,target,curr,ans);
    }
}
