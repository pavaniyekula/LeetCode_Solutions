class Solution {
    public int sumCounts(List<Integer> nums) {
        int result=0;
        for(int i=0;i<nums.size();i++)
        {
            HashSet<Integer> hs=new HashSet<>();
            for(int j=i;j<nums.size();j++)
            {
                hs.add(nums.get(j));
                result+=Math.pow(hs.size(),2);
            }
        }
        return result;
    }
}