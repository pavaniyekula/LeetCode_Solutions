class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<int[]>list=new ArrayList<>();
        for(int i=0;i<mat.length;i++)
        {
            int c=0;
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    c++;
                }
            }
            list.add(new int[]{c,i});
        }
        Collections.sort(list,(a,b)->
        {
            if(a[0]!=b[0])
                return Integer.compare(a[0],b[0]);
            else
                return Integer.compare(a[1],b[1]);
        });
        int result[]=new int[k];
        for(int i=0;i<k;i++)
        {
            result[i]=list.get(i)[1];
        }
        return result;
    }
}