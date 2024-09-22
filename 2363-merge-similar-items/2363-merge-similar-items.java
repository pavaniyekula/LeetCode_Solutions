class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>>result=new ArrayList<>();
        HashSet<Integer>used=new HashSet<>();
        for(int i=0;i<items1.length;i++)
        {
            List<Integer>list=new ArrayList<>();
            int a=items1[i][0];
            int b=items1[i][1];
            for(int j=0;j<items2.length;j++)
            {
                if(items1[i][0]==items2[j][0]) 
                {
                    b+=items2[j][1];
                    used.add(j);
                    break;
                }
            }
            list.add(a);
            list.add(b);
            result.add(list);
        }
        for(int k=0;k<items2.length;k++)
        {
            if(!used.contains(k))
            {
                List<Integer>list=new ArrayList<>();
                list.add(items2[k][0]);
                list.add(items2[k][1]);
                result.add(list);
            }
        }
        result.sort(Comparator.comparingInt(l -> l.get(0)));
        return result;
    }
}