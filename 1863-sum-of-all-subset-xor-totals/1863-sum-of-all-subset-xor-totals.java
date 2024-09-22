class Solution {
    public int subsetXORSum(int[] nums) {
        int sum=0;
        sum=backrack(nums,new ArrayList<>(),0,sum);
        return sum;
    }
    static int backrack(int nums[], List<Integer>currentList,int start, int sum)
    {
        int ans=0;
        for(int num:currentList)
        {
            ans^=num;
        }
        sum+=ans;
        for(int i=start;i<nums.length;i++)
        {
            currentList.add(nums[i]);
            sum=backrack(nums,currentList,i+1,sum);
            currentList.remove(currentList.size()-1);
        }
        return sum;
    }
}