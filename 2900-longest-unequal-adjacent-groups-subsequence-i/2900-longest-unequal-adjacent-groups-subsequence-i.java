class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int prev=groups[0];
        List<String>list=new ArrayList<>();
        list.add(words[0]);
        for(int i=1;i<words.length;i++)
        {
            if(groups[i]!=prev)
            {
                list.add(words[i]);
                prev=groups[i];
            }
        }
        return list;
    }
}