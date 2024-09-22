class Solution {
    public int maxCoins(int[] piles) 
    {
        int ans=0;
        List<Integer>list=new ArrayList<>();
        for(int num:piles)
        {
            list.add(num);
        }
        Collections.sort(list);
        for(int i=0;i<list.size()/3;i++)
        {
            ans+=list.get(list.size()-2*i-2);
        }
        /*
        while(!list.isEmpty())
        {
            ans+=list.get(list.get(list.size()-2));
            list.remove(list.get(list.size()-1));
            list.remove(list.get(list.size()-1));
            list.remove(list.get(0));
        }*/
        return ans;
    }
}