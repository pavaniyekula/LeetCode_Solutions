class Solution {
    public void rotate(int[][] m) {
        int n=m.length;
        for(int r=0;r<n/2;r++)
        {
            for(int c=r;c<n-r-1;c++)
            {
                //top left & top right
                int temp=m[r][c];
                m[r][c]=m[c][n-r-1];
                m[c][n-r-1]=temp;
                //top left & bottom right
                temp=m[r][c];
                m[r][c]=m[n-r-1][n-c-1];
                m[n-r-1][n-c-1]=temp;
                //top left & bottom left
                temp=m[r][c];
                m[r][c]=m[n-c-1][r];
                m[n-c-1][r]=temp;
            }
        }
    }
}