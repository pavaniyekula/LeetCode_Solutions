class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list=new ArrayList<>();
        HashMap<Integer, Integer>map=new HashMap<>();
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        HashSet<Integer>set3=new HashSet<>();
        for(int i=0;i<nums1.length;i++)   
        {
            if(set1.add(nums1[i])) map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++)   
        {
            if(set2.add(nums2[i])) map.put(nums2[i],map.getOrDefault(nums2[i],0)+1);
        }
        for(int i=0;i<nums3.length;i++)   
        {
            if(set3.add(nums3[i]))  map.put(nums3[i],map.getOrDefault(nums3[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>1) list.add(entry.getKey());
        }
        return list;
    }
}