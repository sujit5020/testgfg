//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            System.out.println(new Solution().minJumps(arr));
            // System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    static int minJumps(int[] arr) {
        int n = arr.length;
        if (n <= 1) return 0; // Already at the last index
        if (arr[0] == 0) return -1; // Cannot move from first position
        
        int maxReach = arr[0]; 
        int steps = arr[0];    // Steps we can still take in the current range
        int jumps = 1;         // At least one jump is needed
        
        for (int i = 1; i < n; i++) {
            if (i == n - 1) return jumps; // If we reach the end, return jumps
            
            maxReach = Math.max(maxReach, i + arr[i]); // Update maxReach
            steps--; // Use one step
            
            if (steps == 0) { // Need to jump
                jumps++;
                if (i >= maxReach) return -1; // Cannot move further
                steps = maxReach - i; // Reset steps for new range
            }
        }
        return -1; // If end is unreachable
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr)); // Expected Output: 3
    }
}
