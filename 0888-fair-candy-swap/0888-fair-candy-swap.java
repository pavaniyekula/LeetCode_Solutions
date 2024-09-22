class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum=0;
        int bobSum=0;
        for(int i=0;i<aliceSizes.length;i++)
        {
            aliceSum+=aliceSizes[i];
        }
        for(int i=0;i<bobSizes.length;i++)
        {
            bobSum+=bobSizes[i];
        }
        int diff=(bobSum-aliceSum)/2;
        Arrays.sort(bobSizes);
        for(int a:aliceSizes)
        {
            if(binarySearch(bobSizes,a+diff))
                return new int[]{a,a+diff};
        }
        return new int[0];
    }
    static boolean binarySearch(int arr[], int target)
    {
        int i=0, j=arr.length-1;
        while(i<=j)
        {
            int k=i+(j-i)/2;
            if(arr[k]==target)
                return true;
            else if(arr[k]>target)
                j=k-1;
            else
                i=k+1;
        }
        return false;
    }
}