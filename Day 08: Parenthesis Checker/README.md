<h2>Parenthesis Checker</h2><strong>Difficulty: Easy | Accuracy: 28.56% | Points: 2</strong><hr>
<p>Given an expression string <strong>x</strong>. Examine whether the pairs and the orders of {,},(,),[,] are correct in exp.<br>For example, the function should return 'true' for exp = [()]{}{[()()]()} and 'false' for exp = [(]).</p>
<p><strong>Note:</strong> The <strong>driver code</strong> prints "balanced" if function return true, otherwise it prints "not balanced".</p><br>
<strong>Examples :</strong>
<pre>
<strong>Input:</strong> {([])}
<strong>Output:</strong> true
<strong>Explanation:</strong> { ( [ ] ) }. Same colored brackets can form balanced pairs, with 0 number of unbalanced bracket.
</pre>
<pre>
<strong>Input:</strong> ()
<strong>Output:</strong> true
<strong>Explanation:</strong> (). Same bracket can form balanced pairs,and here only 1 type of bracket is present and in balanced way.
</pre>
<pre>
<strong>Input:</strong> ([]
<strong>Output:</strong> false
<strong>Explanation:</strong> ([]. Here square bracket is balanced but the small bracket is not balanced and Hence , the output will be unbalanced.
</pre>
<strong>Expected Time Complexity:</strong> O(|x|)<br>
<strong>Expected Auixilliary Space:</strong> O(|x|)<br><br>
<strong>Constraints:</strong><br>
1 ≤ |x| ≤ 10<sup>5</sup>
