class Solution {
    public String[] findRelativeRanks(int[] score)
    {
        String result[]=new String[score.length];
        int sortedScore[]=score.clone();   
        Arrays.sort(sortedScore);
        HashMap<Integer,String>map=new HashMap<>();
        for(int i=0;i<score.length;i++)
        {
            int rank=score.length-i;
            if(rank==1)
                map.put(sortedScore[i],"Gold Medal");
            else if(rank==2)
                map.put(sortedScore[i],"Silver Medal");
            else if(rank==3)
                map.put(sortedScore[i],"Bronze Medal");
            else
                map.put(sortedScore[i],String.valueOf(rank));
        }
        for(int i=0;i<score.length;i++)
        {
            result[i]=map.get(score[i]);
        }
        return result;
    }
}