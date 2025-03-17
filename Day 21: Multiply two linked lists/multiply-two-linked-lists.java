
class Solution {
    static final long MOD = 1000000007;
    
    // Function to convert the linked list to a number
    private long listToNumber(Node head) {
        long num = 0;
        while (head != null) {
            num = (num * 10 + head.data) % MOD;
            head = head.next;
        }
        return num;
    }
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        // Convert both linked lists to numbers
        long num1 = listToNumber(first);
        long num2 = listToNumber(second);
        
        // Multiply the numbers and return result modulo MOD
        return (num1 * num2) % MOD;
    }
}