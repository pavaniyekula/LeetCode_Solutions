class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) 
    {
        licensePlate=licensePlate.toLowerCase();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<licensePlate.length();i++)
        {
            char c=licensePlate.charAt(i);
            if(Character.isLetter(c))
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        String result=null;
        for(String word:words)
        {
            if(completes(word,map))
            {
                if(result==null || word.length()<result.length())
                    result=word;
            }
        }
        return result;
    }
    static boolean completes(String word, HashMap<Character,Integer>map)
    {
        HashMap<Character,Integer>wordMap=new HashMap<>();
        for(int i=0;i<word.length();i++)
        {
            wordMap.put(word.charAt(i),wordMap.getOrDefault(word.charAt(i),0)+1);
        }
        for(Character c:map.keySet())
        {
            if(wordMap.getOrDefault(c,0)<map.get(c))
            {
                return false;
            }
        }
        return true;
    }
}