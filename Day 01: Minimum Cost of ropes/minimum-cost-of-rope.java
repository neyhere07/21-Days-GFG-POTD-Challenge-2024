//Back-end complete function Template for Java
class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public long minCost(long[] arr) {
        // code here
        PriorityQueue <Long> pq = new PriorityQueue<>();
        for(long k:arr){
            pq.add(k);
        }
        long cost = 0;
        while(pq.size() > 1){
            long a = pq.remove();
            long b = pq.remove();
            long curr = a + b;
            cost += curr;
            pq.add(curr);
        }
        return cost;
    }
}