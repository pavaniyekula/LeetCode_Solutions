class Solution {
    public int[] replaceElements(int[] arr) 
    {
        int result[]=new int[arr.length];
        result[arr.length-1]=-1;
        for(int i=0;i<arr.length-1;i++)
        {
            int max=0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>max) max=arr[j];
            }
            result[i]=max;
        }
        return result;
    }
}