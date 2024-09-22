class Solution 
{
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        Set<Integer> hs=new HashSet<>();
        //List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for(int num:nums)
        {
            hs.add(num);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!hs.contains(i))
                list2.add(i);
        }
        return list2;
    }
}