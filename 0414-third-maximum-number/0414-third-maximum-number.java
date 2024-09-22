class Solution {
    public int thirdMax(int[] nums) 
    {
        /*
        Arrays.sort(nums);
        List<Integer>list=new ArrayList();
        for(int i=nums.length-1;i>=0;i--)
        {
            if(!list.contains(nums[i]))
                list.add(nums[i]);
        }
        if(list.size()>=3)
            return list.get(2);
        else
            return list.get(0);
        */
        Arrays.sort(nums);
        int count=0;
        for(int i=nums.length-1;i>0;i--)
        {
            if(nums[i]!=nums[i-1])
                count++;
            if(count==2)
                return nums[i-1];
        }
        return nums[nums.length-1];
    }
}