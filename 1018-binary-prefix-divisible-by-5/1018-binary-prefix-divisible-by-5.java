class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list=new ArrayList<>();
        /*
        for(int i=0;i<nums.length;i++)
        {
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<=i;j++)
            {
                sb.append(nums[j]);
            }
            int num=Integer.parseInt(sb.toString(),2);
            if(num%5==0) list.add(true);
            else list.add(false);
        }
        return list;*/
        int prefix=0;
        for(int num:nums)
        {
            prefix=(prefix*2+num)%5;
            if(prefix==0) list.add(true);
            else list.add(false);
        }
        return list;
    }
}