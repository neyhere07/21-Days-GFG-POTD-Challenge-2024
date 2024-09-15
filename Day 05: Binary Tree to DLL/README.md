<h2><a href="https://www.geeksforgeeks.org/problems/binary-tree-to-dll/1">Binary Tree to DLL</a></h2><strong>Difficulty: Hard | Accuracy: 53.36% | Points: 8</strong><hr>
<div>
  <p>Given a Binary Tree (BT), convert it to a Doubly Linked List (DLL) in place. The left and right pointers in nodes will be used as previous and next pointers respectively in converted DLL. The <strong>order of nodes</strong> in DLL must be the same as the order of the given Binary Tree. The first node of <strong>Inorder traversal</strong> (leftmost node in BT) must be the head node of the DLL.</p><p><strong>Note:</strong> h is the tree's height, and this space is used implicitly for the recursion stack.</p>
  <img alt="" src="http://www.geeksforgeeks.org/wp-content/uploads/TreeToList.png"><br><br>
  <strong>Examples:</strong>
  <pre>
    <strong>Input:</strong>
          1
        /  \
       3    2
    <strong>Output:</strong>
    3 1 2 
    2 1 3
    <img alt="" src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700144/Web/Other/blobid0_1723093893.png">
    <strong>Explanation:</strong> DLL would be 3<=>1<=>2</pre>
    <pre>
      <strong>Input:</strong>
           10
          /   \
         20   30
       /   \
      40   60
      <strong>Output:</strong>
      40 20 60 10 30
      30 10 60 20 40
      <img alt="" src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700144/Web/Other/blobid1_1723093972.png">
      <strong>Explanation:</strong>  DLL would be 40<=>20<=>60<=>10<=>30.
    </pre>
          <strong>Expected Time Complexity:</strong> O(no. of nodes)<br>
          <strong>Expected Space Complexity:</strong> O(height of the tree)<br><br>
          <strong>Constraints:</strong><br>
          1 ≤ Number of nodes ≤ 10<sup>5</sup><br>
          0 ≤ Data of a node ≤ 10<sup>5</sup>
</div>