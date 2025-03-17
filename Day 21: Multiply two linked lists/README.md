<h2><a href="https://www.geeksforgeeks.org/problems/multiply-two-linked-lists/1">Multiply two linked lists
</a></h2>
<strong>Difficulty: Easy | Accuracy: 46.33% | Points: 2</strong><hr><p>Given elements as nodes of the two singly linked lists. The task is to multiply these two linked lists, say L1 and L2.</p><p><i>Note:</i> The output could be large take modulo 10^9+7.</p>
<strong>Examples:</strong>
<pre>
  Input: LinkedList L1 : 3->2 , LinkedList L2 : 2
  Output: 64
  Explanation:

  <img alt="" src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700336/Web/Other/blobid0_1721108424.png">
  
  Multiplication of 32 and 2 gives 64.
</pre>
<pre>
  Input: LinkedList L1: 1->0->0 , LinkedList L2 : 1->0
  Output: 1000
  Explanation:

  <img alt="" src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700336/Web/Other/blobid1_1721108436.png">

  Multiplication of 100 and 10 gives 1000.
</pre>
<strong>Expected Time Complexity:</strong> O(max(n,m))<br>
<strong>Expected Auxilliary Space:</strong> O(1)<br>
where n is the size of L1 and m is the size of L2<br><br>
<strong>Constraints:</strong><br>
1 <= number of nodes <= 10<sup>5</sup><br>
1 <= node->data <= 10<sup>3</sup>
