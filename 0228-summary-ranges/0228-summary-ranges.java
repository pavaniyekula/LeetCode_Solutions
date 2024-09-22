class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String>result=new ArrayList<>();
        if(nums.length==0)
            return result;
        int startIndex=nums[0];
        for(int i=1;i<=nums.length;i++)
        {
            if(i==nums.length || nums[i]-nums[i-1]!=1)
            {
                if(startIndex==nums[i-1])
                {
                    result.add(String.valueOf(startIndex));
                }
                else
                    result.add(startIndex+"->"+nums[i-1]);
                if(i<nums.length)
                {
                    startIndex=nums[i];
                }
            }
        }
        return result;
    }
}