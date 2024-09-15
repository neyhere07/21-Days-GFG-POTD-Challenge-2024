// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        int n = arr.size();
        
        // Separate positive and negative numbers into two lists
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        // Populate pos and neg lists
        for (int i = 0; i < n; i++) {
            int num = arr.get(i);
            if (num >= 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }
        
        int i = 0, j = 0, ind = 0;
        boolean isPositiveTurn = true;

        // Alternatingly place positive and negative numbers
        while (i < pos.size() && j < neg.size()) {
            if (isPositiveTurn) {
                arr.set(ind++, pos.get(i++));
            } else {
                arr.set(ind++, neg.get(j++));
            }
            isPositiveTurn = !isPositiveTurn;
        }

        // Append remaining positive numbers if any
        while (i < pos.size()) {
            arr.set(ind++, pos.get(i++));
        }

        // Append remaining negative numbers if any
        while (j < neg.size()) {
            arr.set(ind++, neg.get(j++));
        }
    }
}