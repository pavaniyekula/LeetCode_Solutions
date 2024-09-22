class Solution {
    public boolean isSubsequence(String s, String t) {
        /*List<Character>list=new ArrayList<>();
        for(char c:t.toCharArray())
        {
            list.add(c);
        }
        for(int i=0;i<s.length();i++)
        {
            if(!list.contains(s.charAt(i)))
                return false;
        }
        return true;*/

        int i=0,j=0;
        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
            }
            j++;
        }
        if(i==s.length())
            return true;
        return false;
    }
}