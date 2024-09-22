class Solution {
    public boolean exist(char[][] board, String word) {
        boolean visited[][]=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(backtrack(board,word,i,j,0,visited))
                    return true;
            }
        }
        return false;
    }
    static boolean backtrack(char board[][],String word, int i, int j, int start, boolean visited[][])
    {
        if(start==word.length())
            return true;
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word.charAt(start))
            return false;
        char temp=board[i][j];
        board[i][j]='#';
        boolean found=backtrack(board,word,i-1,j,start+1,visited) || backtrack(board,word,i+1,j,start+1,visited) || backtrack(board,word,i,j-1,start+1,visited) || backtrack(board,word,i,j+1,start+1,visited);
        board[i][j]=temp;
        return found;
    }
}