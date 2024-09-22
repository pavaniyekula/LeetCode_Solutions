class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        /*
        int sum=0;
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return arr;
        */
        HashMap<Integer,Integer> hm=new HashMap<>();
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(target-nums[i]))
            {
                arr[0]=i;
                arr[1]=hm.get(target-nums[i]);
                return arr;
            }
            hm.put(nums[i],i);
        }
        return arr;
    }
}