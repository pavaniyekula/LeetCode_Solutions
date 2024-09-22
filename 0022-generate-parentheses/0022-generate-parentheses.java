class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>result=new ArrayList<>();
        backtrack(n,result,"",0,0);
        return result;
    }
    static void backtrack(int n, List<String> result, String str, int open, int close)
    {
        if(open==n && close==n) 
        {
            result.add(str);
            return;
        }
        if(open<n) backtrack(n,result,str+"(",open+1,close);
        if(close<open) backtrack(n,result,str+")",open,close+1);
    }
}