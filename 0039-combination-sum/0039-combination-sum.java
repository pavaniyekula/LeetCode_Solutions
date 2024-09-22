class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
    static void backtrack(int candidates[], int target, int start, List<Integer>currentList, List<List<Integer>>result)
    {
        if(target==0)
        {
            result.add(new ArrayList<>(currentList));
            return;
        }
        if(target<0)
            return;
        for(int i=start;i<candidates.length;i++)
        {
            currentList.add(candidates[i]);
            backtrack(candidates, target-candidates[i],i,currentList,result);
            currentList.remove(currentList.size()-1);
        }
    }
}