class Solution 
{
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,0,new boolean[nums.length],new ArrayList<>(),result);
        return result;
    }
    static void backtrack(int nums[], int start, boolean visited[], List<Integer>currentList, List<List<Integer>>result)
    {
        result.add(new ArrayList<>(currentList));
        for(int i=start;i<nums.length;i++)
        {
            if(visited[i] || (i>0 && nums[i]==nums[i-1] && !visited[i-1]))
                continue;
            visited[i]=true;
            currentList.add(nums[i]);
            backtrack(nums,i+1,visited,currentList,result);
            currentList.remove(currentList.size()-1);
            visited[i]=false;
        }
    }
}