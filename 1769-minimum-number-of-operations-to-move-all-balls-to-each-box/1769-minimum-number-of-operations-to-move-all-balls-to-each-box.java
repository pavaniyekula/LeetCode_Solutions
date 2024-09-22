class Solution {
    public int[] minOperations(String boxes) 
    {
        char arr[]=boxes.toCharArray();
        int operationsArr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int operations=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]=='1')
                    operations+=Math.abs(j-i);
            }
            operationsArr[i]=operations;
        }
        return operationsArr;

        /*
        class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] operationsArr = new int[n];

        // Left to Right pass
        int count = 0; // Number of balls encountered
        int operations = 0; // Total operations for current box
        for (int i = 0; i < n; i++) {
            operationsArr[i] += operations;
            count += boxes.charAt(i) - '0'; // Increment ball count if current box has a ball
            operations += count; // Update operations count
        }

        // Reset for right to left pass
        count = 0;
        operations = 0;

        // Right to Left pass
        for (int i = n - 1; i >= 0; i--) {
            operationsArr[i] += operations;
            count += boxes.charAt(i) - '0'; // Increment ball count if current box has a ball
            operations += count; // Update operations count
        }

        return operationsArr;
    }
}
*/
    }
}