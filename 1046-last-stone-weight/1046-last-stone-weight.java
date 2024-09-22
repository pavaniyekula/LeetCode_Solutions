class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<stones.length;i++)
        {
            list.add(stones[i]);
        }
        while(list.size()>1)
        {
            int n=list.size();
            int stone1=list.get(n-1);
            int stone2=list.get(n-2);
            list.remove(n-1);
            list.remove(n-2);
            if(stone1!=stone2)
            {
                list.add(stone1-stone2);
            }
            list.sort(null);
        }
        return list.size()==1 ? list.get(0):0;
    }
}