class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount=0;
        for(String str:sentences)
        {
            int count=1;
            for(char c:str.toCharArray())
            {
                if(c==' ')
                    count++;
            }
            maxCount=Math.max(count,maxCount);
        }
        return maxCount;
    }
}