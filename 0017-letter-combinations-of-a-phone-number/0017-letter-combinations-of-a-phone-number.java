class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>result=new ArrayList<>();
        if(digits.length()==0)
            return result;
        String mapping[]=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(result,digits,mapping,new StringBuilder(),0);
        return result;
    }
    static void backtrack(List<String>result,String digits,String mapping[],StringBuilder current,int i)
    {
        if(current.length()==digits.length())
        {
            result.add(current.toString());
            return;
        }
        int digit=digits.charAt(i)-'0';
        for(char c:mapping[digit].toCharArray())
        {
            current.append(c);
            backtrack(result,digits,mapping,current,i+1);
            current.deleteCharAt(current.length()-1);
        }
    }
}