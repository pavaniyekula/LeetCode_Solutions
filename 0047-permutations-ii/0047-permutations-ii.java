class Solution 
{
    public List<List<Integer>> permuteUnique(int[] nums) 
    {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, new boolean[nums.length], new ArrayList<>(), result);
        return result;
    }
    static void backtrack(int nums[], boolean visited[], List<Integer>currentList, List<List<Integer>> result)
    {
        if(currentList.size()==nums.length)
        {
            //if(!result.contains(currentList))
            //{
                result.add(new ArrayList<>(currentList));
            //}
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(visited[i] || (i>0 && nums[i]==nums[i-1] && !visited[i-1]))
            {
                continue;
            }
            visited[i]=true;
            currentList.add(nums[i]);
            backtrack(nums,visited,currentList,result);
            currentList.remove(currentList.size()-1);
            visited[i]=false;          
        }
    }
}