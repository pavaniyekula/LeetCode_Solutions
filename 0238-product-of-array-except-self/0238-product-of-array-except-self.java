class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int zeroCount=0;
        for(int i:nums)
        {
            if(i==0) zeroCount++;
            else product*=i;
        }
        int arr[]=new int[nums.length];
        for(int i=0;i<arr.length;i++)
        {
            if(zeroCount==0) arr[i]=product/nums[i];
            else if(zeroCount==1)
            {
                if(nums[i]==0) arr[i]=product;
                else arr[i]=0;
            }
            else arr[i]=0;
        }
        return arr;
    }
}