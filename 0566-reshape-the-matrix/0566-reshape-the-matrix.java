class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int resultMatrix[][]=new int[r][c];
        if(mat.length*mat[0].length!=r*c)
            return mat;
        int arr[]=new int[mat.length*mat[0].length];
        int index=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                arr[index]=mat[i][j];
                index++;
            }
        }
        index=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                resultMatrix[i][j]=arr[index];
                index++;
            }
        }
        return resultMatrix;
    }
}