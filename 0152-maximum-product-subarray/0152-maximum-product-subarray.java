class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            int product=nums[i];
            maxProduct=Math.max(maxProduct,product);
            for(int j=i+1;j<nums.length;j++)
            {
                product*=nums[j];
                maxProduct=Math.max(maxProduct,product);
            }
            //maxProduct=Math.max(maxProduct,product);
        }
        return maxProduct;
    }
}