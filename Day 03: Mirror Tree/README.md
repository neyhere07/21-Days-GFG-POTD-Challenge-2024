<h2><a href="https://www.geeksforgeeks.org/problems/mirror-tree/1">Mirror Tree</a></h2><strong>Difficulty: Easy | Accuracy: 72.67% | Points: 2</strong><hr>
<div>
  <p>Given a Binary Tree, convert it into its mirror.</p>
  <img alt="" src="https://contribute.geeksforgeeks.org/wp-content/uploads/mirrortrees.jpg" style="width:600px;height:300px;">
  <p>&nbsp;</p>
  <strong>Examples:</strong><br><br>
  <pre>
    <strong>Input:</strong>
        1
      /  \
     2    3
  <strong>Output:</strong> 3 1 2 <br>
  <strong>Explanation:</strong> The tree is
    1    (mirror)   1
   /  \    =>      /  \
  2    3          3    2
  The inorder of mirror is 3 1 2
  </pre>
  <pre>
  <strong>Input:</strong>
        10
       /  \
      20   30
     /  \
    40  60
  <strong>Output:</strong> 30 10 60 20 40
  <strong>Explanation:</strong> The tree is
        10                10
      /    \  (mirror)  /    \
     20    30    =>    30    20
    /  \                    /   \
   40  60                  60   40
  The inroder traversal of mirror is: 30 10 60 20 40.
  </pre><br>
  <strong>Expected Time Complexity:</strong> O(n)<br>
  <strong>Expected Auxiliary Space:</strong> O(height of the tree)<br><br>
  <strong>Constraints:</strong><br>
  1 ≤ Number of nodes ≤ 10<sup>5</sup><br>
  1 ≤ Data of a node ≤ 10<sup>5</sup>
</div>
