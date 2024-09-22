class Solution {
    public List<List<String>> solveNQueens(int n) 
    {
        List<List<String>>result=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(board[i],'.');
        }
        backtrack(0,board,result);
        return result;
    }
    static void backtrack(int col, char board[][], List<List<String>>result)
    {
        if(col==board.length)
        {
            result.add(constructBoard(board));
            return;
        }
        for(int row=0;row<board.length;row++)
        {
            if(isSafe(row,col,board))
            {
                board[row][col]='Q';
                backtrack(col+1,board,result);
                board[row][col]='.';
            }
        }
    }
    static boolean isSafe(int row, int col, char board[][])
    {
        for(int j=0;j<board.length;j++) //row
        {
            if(board[row][j]=='Q')
                return false;
        }
        for(int i=0;i<board.length;i++) //col
        {
            if(board[i][col]=='Q')
                return false;
        }
        for(int i=row,j=col ; i>=0 && j>=0 ; i--,j--) //upper left diagonal
        {
            if(board[i][j]=='Q')
                return false;
        }
        for(int i=row,j=col ; i<board.length && j>=0 ; i++,j--) //lower left diagonal
        {
            if(board[i][j]=='Q')
                return false;
        }
        for(int i=row,j=col ; i>=0 && j<board.length ; i--,j++) //upper right diagonal
        {
            if(board[i][j]=='Q')
                return false;
        }
        for(int i=row,j=col ; i<board.length && j<board.length ; i++,j++) //lower right diagonal
        {
            if(board[i][j]=='Q')
                return false;
        }
        return true;
    }
    static List<String> constructBoard(char board[][])
    {
        List<String> newBoard=new ArrayList<>();
        for(int i=0;i<board.length;i++)
        {
            StringBuilder row=new StringBuilder();
            for(int j=0;j<board[0].length;j++)
            {
                row.append(board[i][j]);
            }
            newBoard.add(row.toString());
        }
        return newBoard;
    }
}