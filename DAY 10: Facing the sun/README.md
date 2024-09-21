<h2><a href="https://www.geeksforgeeks.org/problems/facing-the-sun2126/1">Facing the sun</a></h2>
<p>Given an array <strong>height</strong> representing the heights of buildings. You have to count the buildings that will see the sunrise (Assume the sun rises on the side of the array starting point).<br><em>Note:</em> The height of the building should be strictly greater than the height of the buildings left in order to see the sun.</p>
<img alt="" src="https://media.geeksforgeeks.org/wp-content/uploads/Building.png">
<strong>Examples :</strong>
<pre>
<strong>Input:</strong> height = [7, 4, 8, 2, 9]
<strong>Output:</strong> 3
<strong>Explanation:</strong> As 7 is the first element, it can see the sunrise. 4 can't see the sunrise as 7 is hiding it. 8 can see. 2 can't see the sunrise. 9 also can see
the sunrise.
</pre>
<pre>
<strong>Input:</strong> height = [2, 3, 4, 5]
<strong>Output:</strong> 4
<strong>Explanation:</strong> As 2 is the first element, it can see the sunrise.  3 can see the sunrise as 2 is not hiding it. Same for 4 and 5, they also can see the sunrise.
</pre>
<strong>Expected Time Complexity:</strong> O(n)<br><strong>Expected Auxiliary Space:</strong> O(1)<br><br>
<strong>Constraints:</strong><br>1 ≤ height.size() ≤ 10<sup>6</sup><br>1 ≤ height<sub>i</sub> ≤ 10<sup>8</sup>
