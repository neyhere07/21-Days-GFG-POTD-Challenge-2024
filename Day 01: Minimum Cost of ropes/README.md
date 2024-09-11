<h2><a href="https://www.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1">Minimum Cost of ropes</a></h2>
<strong>Difficulty: Easy | Accuracy: 42.73% | Points: 2</strong><hr><p>Given an array arr containing the lengths of the different ropes, we need to connect these ropes to form one rope. The cost to connect two ropes is equal to sum of their lengths. The task is to connect the ropes with minimum cost.</p>
<strong>Examples:</strong>
<pre>
  Input: arr[] = [4, 3, 2, 6]
  Output: 29
  Explanation: We can connect the ropes in following ways.
  1) First connect ropes of lengths 2 and 3. Which makes the array [4, 5, 6]. Cost of this operation 2 + 3 = 5. 
  2) Now connect ropes of lengths 4 and 5. Which makes the array [9, 6]. Cost of this operation 4 + 5 = 9.
  3) Finally connect the two ropes and all ropes have connected. Cost of this operation 9 + 6 =15
  Total cost for connecting all ropes is 5 + 9 + 15 = 29. This is the optimized cost for connecting ropes. 
  Other ways of connecting ropes would always have same or more cost. For example, if we connect 4 and 6 first (we get three rope of 3, 2 and 10), then connect 10 and 3 (we gettwo rope of 13 and 2). Finally we connect 13 and 2. Total cost in this way is 10 + 13 + 15 = 38.
</pre>
<pre>
  Input: arr[] = [4, 2, 7, 6, 9]
  Output: 62
  Explanation: First, connect ropes 4 and 2, which makes the array [6, 7, 6, 9]. Cost of this operation 4 + 2 = 6. 
  Next, add ropes 6 and 6, which results in [12, 7, 9]. Cost of this operation 6 + 6 = 12.
  Then, add 7 and 9, which makes the array [12,16]. Cost of this operation 7 + 9 = 16. And
finally, add these two which gives [28]. Hence, the total cost is 6 + 12 + 16 + 28 = 62.
</pre>
<strong>Expected Time Complexity:</strong> O(n logn)<br>
<strong>Expected Auxilliary Space:</strong> O(n)<br><br>
<strong>Constraints:</strong><br>
1 ≤ arr.size() ≤ 20<sup>5</sup><br>
1 ≤ arr[i] ≤ 10<sup>6</sup>
