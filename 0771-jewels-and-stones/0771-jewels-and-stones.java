class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int c1:stones.toCharArray())
        {
            for(char c2:jewels.toCharArray())
            {
                if(c1==c2)
                    count++;
            }
        }
        return count;
    }
}