class Solution {
    public int countSubstrings(String s) {
        /*
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(isPalindrome(s.substring(i,j+1))) count++;
            }
        }
        return count;*/
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            count+=isPalindrome(s,i,i);
            count+=isPalindrome(s,i,i+1);
        }
        return count;
    }
    static int isPalindrome(String s, int left, int right)
    {
        int count=0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            count++;
            left--;
            right++;
        }
        return count;
    }
    /*
    static boolean isPalindrome(String sub)
    {
        int i=0, j=sub.length()-1;
        while(i<=j)
        {
            if(sub.charAt(i)!=sub.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }*/
}