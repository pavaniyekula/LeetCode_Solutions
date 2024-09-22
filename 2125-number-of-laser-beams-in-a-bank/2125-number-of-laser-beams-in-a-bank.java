class Solution {
    public int numberOfBeams(String[] bank) {
        int count[]=new int[bank.length];
        for(int i=0;i<bank.length;i++)
        {
            count[i]=0;
            for(char ch:bank[i].toCharArray())
            {
                if(ch=='1')
                {
                    count[i]++;
                }
            }
        }
        int prevCount=0, totalBeans=0;
        for(int i=0;i<count.length;i++)
        {
            if(count[i]>0)
            {
                totalBeans+=prevCount*count[i];
                prevCount=count[i];
            }
        }
        return totalBeans;
    }
}