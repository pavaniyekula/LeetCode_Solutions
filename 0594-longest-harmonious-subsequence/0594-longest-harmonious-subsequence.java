class Solution {
    public int findLHS(int[] nums) {
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int num:nums)
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        int maxLength=0;
        for(int num:nums)
        {
            if(freq.containsKey(num+1))
            {
                maxLength=Math.max(maxLength,freq.get(num)+freq.get(num+1));
            }
        }
        return maxLength;
    }
}