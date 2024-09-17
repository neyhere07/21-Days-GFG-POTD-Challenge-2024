<h2><a href="https://www.geeksforgeeks.org/problems/minimize-the-heights3351/1">Minimize the Heights II</a></h2><strong>Difficulty: Medium | Accuracy: 15.06% | Points: 4</strong><hr>
<p>Given an array <strong>arr[]</strong> denoting heights of <strong>N</strong> towers and a positive integer <strong>K</strong>.</p>
<p>For <strong>each</strong> tower, you must perform <strong>exactly one</strong> of the following operations <strong>exactly once</strong>.</p>
<li><strong>Increase</strong> the height of the tower by <strong>K</strong></li>
<li><strong>Decrease</strong> the height of the tower by <strong>K</strong></li><br>
<p>Find out the <strong>minimum</strong> possible difference between the height of the shortest and tallest towers after you have modified each tower.</p>
<strong>Note:</strong> It is <strong>compulsory</strong> to increase or decrease the height by K for each tower. <strong>After</strong> the operation, the resultant array should <strong>not</strong> contain any <strong>negative integers</strong>.<br><br>

<strong>Examples :</strong>
<pre>
Input: k = 2, arr[] = {1, 5, 8, 10}
Output: 5
Explanation: The array can be modified as {1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}.The difference between the largest and the smallest is 8-3 = 5.
</pre>
<pre>
Input: k = 3, arr[] = {3, 9, 12, 16, 20}
Output: 11
Explanation: The array can be modified as {3+k, 9+k, 12-k, 16-k, 20-k} -> {6, 12, 9, 13, 17}.The difference between the largest and the smallest is 17-6 = 11. 
</pre>
<strong>Expected Time Complexity:</strong> O(n*logn)<br>
<strong>Expected Auxiliary Space:</strong> O(n)<br><br>
<strong>Constraints</strong><br>
1 ≤ k ≤ 10<sup>7</sup><br>
1 ≤ n ≤ 10<sup>5</sup><br>
1 ≤ arr[i] ≤ 10<sup>7</sup><br>

