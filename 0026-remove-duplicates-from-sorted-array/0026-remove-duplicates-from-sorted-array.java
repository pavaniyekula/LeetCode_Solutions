class Solution {
    public int removeDuplicates(int[] nums) 
    {
        /*
        HashMap<Integer, Integer> hm=new HashMap<>();
        int count=0;
        for(int ele:nums)
        {
            hm.put(ele,hm.getOrDefault(ele,0)+1);
        }    
        List<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry:hm.entrySet())
        {
            if(entry.getValue()==1)
            {
                list.add(entry.getKey());
            }
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        return list.size();*/
        int j=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}