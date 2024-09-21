<h2><a href="https://www.geeksforgeeks.org/problems/clone-a-linked-list-with-next-and-random-pointer/1">Clone a linked list with next and random pointer
</a></h2><hr>
<p>You are given a special linked list where each node has a next pointer pointing to its next node. You are also given some random pointers, where you will be given some pairs denoting two nodes <strong>a</strong> and <strong>b</strong> i.e. a->random = b (<strong>random</strong> is a pointer to a random node).</p>
<p>Construct a copy of the given list. The copy should consist of the same number of new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the original and copied list pointers represent the same list state. None of the pointers in the new list should point to nodes in the original list.</p>
<p>For example, if there are two nodes <strong>x</strong> and <strong>y</strong> in the original list, where <strong>x->random = y</strong>, then for the corresponding two nodes <strong>x<sub>new</sub></strong> and <strong>y<sub>new</sub></strong> in the copied list, <strong>x<sub>new</sub>->random = y<sub>new</sub></strong>.</p><p>Return the head of the copied linked list.</p><br>
<strong>NOTE :</strong><br>1. If there is any node whose arbitrary pointer is not given then it's by default NULL.<br>2. Don't make any changes to the original linked list.
<img alt="ArbitLinked List1" src="https://contribute.geeksforgeeks.org/wp-content/uploads/clone.jpg">
<strong>Note:</strong> The diagram isn't part of any example, it just depicts an example of how the linked list may look.<br><br>
<strong>Examples:</strong>
<pre>
<strong>Input:</strong> LinkedList: 1->2->3->4 , pairs = [{1,2},{2,4}]
<strong>Output:</strong> true
<strong>Explanation:</strong> In this test case, there are 4 nodes in linked list.  Among these 4 nodes,  2 nodes have arbitrary pointer set, rest two nodes have arbitrary pointer as NULL. Second line tells us the value of four nodes. The third line gives the information about arbitrary pointers. The first node arbitrary pointer is set to node 2.  The second node arbitrary pointer is set to node 4.
</pre>
<pre>
<strong>Input:</strong> LinkedList: 1->3->5->9 , pairs[] = [{1,1},{3,4}]
<strong>Output:</strong> true
<strong>Explanation:</strong> In the given testcase, applying the method as stated in the above example, the output will be 1.
</pre>
<strong>Expected Time Complexity:</strong> O(n)<br><strong>Expected Auxiliary Space:</strong> O(1)<br><br>
<strong>Constraints:</strong><br>
1 <= numbers of random pointer <= number of nodes <= 100<br>0 <= node->data <= 1000<br>1 <= a, b <= 100