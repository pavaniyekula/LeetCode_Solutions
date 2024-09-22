class Solution {
    public int[] pivotArray(int[] nums, int pivot) 
    {
        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        List<Integer>list3=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
                list1.add(nums[i]);
            else if(nums[i]>pivot)
                list3.add(nums[i]);
            else
                list2.add(nums[i]);
        }
        int i=0;
        for(int num:list1)
        {
            nums[i++]=num;
        }
        for(int num:list2)
        {
            nums[i++]=num;
        }
        for(int num:list3)
        {
           nums[i++]=num;
        }
        return nums;
    }
}