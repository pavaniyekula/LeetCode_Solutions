class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, new Comparator<int[]>()
        {
            public int compare(int row1[], int row2[])
            {
                return Integer.compare(row2[k],row1[k]);
            }
        });
        return score;
    }
}