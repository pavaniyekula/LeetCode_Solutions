class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int num=0;
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("--X") || operations[i].equals("X--"))
                num-=1;
            else
                num+=1;
        }  
        return num; 
    }
}