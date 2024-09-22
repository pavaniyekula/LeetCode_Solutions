class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer>list=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            list.add(i);
        }
        return josephus(list,k-1,0);
    }
    static int josephus(List<Integer>list,int k, int i)
    {
        if(list.size()==1) return list.get(0);
        i=(i+k)%list.size();
        list.remove(i);
        return josephus(list,k,i);
    }
}