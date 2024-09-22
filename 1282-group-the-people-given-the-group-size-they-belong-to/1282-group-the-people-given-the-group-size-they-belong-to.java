class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>>result=new ArrayList<>();
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        for(int i=0;i<groupSizes.length;i++)
        {
            if(!map.containsKey(groupSizes[i]))
            {
                map.put(groupSizes[i],new ArrayList<>());
            }   
            List<Integer>currentList=map.get(groupSizes[i]);
            currentList.add(i);
            if(currentList.size()==groupSizes[i]) 
            {
                result.add(new ArrayList<>(currentList));
                map.remove(groupSizes[i]);
            }
        }
        return result;
    }
}