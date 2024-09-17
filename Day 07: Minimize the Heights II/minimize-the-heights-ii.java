// User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
        int n = arr.length;
        if (n == 1) {
            return 0;  // If there's only one element, the difference is 0
        }

        // Sort the array
        Arrays.sort(arr);

        // Initial difference between the largest and smallest values
        int ans = arr[n - 1] - arr[0];

        // Consider the smallest and largest possible heights
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;
        
        // Traverse through the array and calculate the minimum difference
        for (int i = 0; i < n - 1; i++) {
            int minHeight = Math.min(smallest, arr[i + 1] - k);
            int maxHeight = Math.max(largest, arr[i] + k);
            if (minHeight < 0) continue; // Skip negative heights
            ans = Math.min(ans, maxHeight - minHeight);
        }
        return ans;
        
        
    }
}
