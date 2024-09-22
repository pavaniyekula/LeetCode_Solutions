class Solution {
    static boolean contains(String word, StringBuilder sb)
    {
        for(char c:word.toCharArray())
        {
            if(sb.indexOf(String.valueOf(c))==-1)
                return false;
        }
        return true;
    }
    public String[] findWords(String[] words)
    {
        StringBuilder sb1=new StringBuilder("qwertyuiop");
        StringBuilder sb2=new StringBuilder("asdfghjkl");
        StringBuilder sb3=new StringBuilder("zxcvbnm");
        List <String> finalWords=new ArrayList<>();
        for(String word:words)
        {
            if(contains(word.toLowerCase(),sb1) || contains(word.toLowerCase(),sb2) ||contains(word.toLowerCase(),sb3))
            {
                finalWords.add(word);
            }
        }
        return finalWords.toArray(new String[0]);
    }
}