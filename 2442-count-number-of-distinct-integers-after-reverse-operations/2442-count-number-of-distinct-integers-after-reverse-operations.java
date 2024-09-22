class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
            int result=0;
            while(i!=0)
            {
                int rem=i%10;
                result=result*10+rem;
                i/=10;
            }
            set.add(result);
        }      
        return set.size();
    }
}