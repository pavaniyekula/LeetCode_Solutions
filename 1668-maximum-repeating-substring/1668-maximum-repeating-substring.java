class Solution {
    public int maxRepeating(String sequence, String word) {
        int max=0;
        for(int i=0;i<=sequence.length()-word.length();i++)
        {
            int count=0;
            int j=i;
            int k=j+word.length();
            while(k<=sequence.length() && sequence.substring(j,k).equals(word))
            {
                count++;
                j=k;
                k+=word.length();
            }
            max=Math.max(count,max);
        }
        return max;
    }
}