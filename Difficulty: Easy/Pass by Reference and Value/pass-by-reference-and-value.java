//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            Solution obj = new Solution();
            int ans[] = obj.passedBy(n, m);

            System.out.println(ans[0] + " " + ans[1]);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static int[] passedBy(int a, int b) {
        a += 1; // Adding 1 to 'a'
        b += 2; // Adding 2 to 'b'
        
        return new int[]{a, b}; // Returning updated values
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int[] result = passedBy(a, b);

        System.out.println("After pass_by_value (a): " + result[0]); // a + 1
        System.out.println("After pass_by_value (b): " + result[1]); // b + 2
    }
}
