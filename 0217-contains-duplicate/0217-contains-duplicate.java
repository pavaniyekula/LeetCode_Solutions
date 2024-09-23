class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        /*HashMap<Integer, Integer> freq=new HashMap<>();
        for(int num:nums)
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(int num:nums)
        {
            if(freq.get(num)>1)
                return true;
        }
        return false;*/
        
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i:nums)
        {
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        for(int j:freq.keySet())
        {
            if(freq.get(j)>1) return true;
        }
        return false;
    }
}