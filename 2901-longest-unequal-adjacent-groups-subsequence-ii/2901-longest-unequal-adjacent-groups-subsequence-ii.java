class Solution {
    static int hammingDistance(String word1,String word2)
    {
        int count=0;
        for(int i=0;i<word1.length();i++)
        {
            if(word1.charAt(i)!=word2.charAt(i))
                count++;
        }
        return count;
    }
    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
        int dp[]=new int[words.length];
        int prev[]=new int[words.length];
        for(int i=0;i<words.length;i++)
        {
            dp[i]=1;
            prev[i]=-1;
        }
        int maxLength=1;
        int maxIndex=0;
        for(int i=1;i<words.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(words[i].length()==words[j].length() && groups[i]!=groups[j] && hammingDistance(words[i],words[j])==1)
                {
                    if(dp[j]+1>dp[i])
                    {
                        dp[i]=dp[j]+1;
                        prev[i]=j;
                    }
                }
            }
            if(dp[i]>maxLength)
            {
                maxLength=dp[i];
                maxIndex=i;
            }
        }
        List<String>list=new ArrayList<>();
        int current=maxIndex;
        while(current!=-1)
        {
            list.add(0,words[current]);
            current=prev[current];
        }
        return list;
    }
}