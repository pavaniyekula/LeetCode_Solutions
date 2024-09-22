class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        HashMap<Character,Integer>map=new HashMap<>();
        int ans=0;
        for(int i=0;i<garbage.length;i++)
        {
            ans+=garbage[i].length();
            for(char c:garbage[i].toCharArray())
            {
                map.put(c,i);
            }
        }
        for(int i=1;i<travel.length;i++)
        {
            travel[i]+=travel[i-1];
        }
        for(char c:map.keySet())
        {
            if(map.get(c)>0)
            {
                ans+=travel[map.get(c)-1];
            }
        }
        return ans;
    }
}