class Solution {
    static boolean isInside(int circle[], int point[])
    {
        return (circle[0]-point[0])*(circle[0]-point[0]) + (circle[1]-point[1])*(circle[1]-point[1]) <= (circle[2]*circle[2]);
    }
    public int[] countPoints(int[][] points, int[][] queries) {
        int countArr[]=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int count=0;
            for(int[] point:points)
            {
                if(isInside(queries[i],point))
                    count++;
            }
            countArr[i]=count;
        }
        return countArr;
    }
}