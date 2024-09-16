<p>Given a string <strong>str</strong> consisting of opening and closing parenthesis <strong>'('</strong> and <strong>')'</strong>. Find length of the longest valid parenthesis substring.</p>

A parenthesis string is valid if:

<li>For every opening parenthesis, there is a closing parenthesis.</li>
<li>Opening parenthesis must be closed in the correct order.</li><br>
<strong>Examples :</strong><br><br>
<pre>
<strong>Input:</strong> str = ((()
<strong>Output:</strong> 2
<strong>Explaination:</strong> The longest valid parenthesis substring is "()".
</pre>
<pre>
<strong>Input:</strong> str = )()())
<strong>Output:</strong> 4
<strong>Explaination:</strong> The longest valid parenthesis substring is "()()".
</pre>
<strong>Expected Time Complexity:</strong> O(|str|)<br>
<strong>Expected Auxiliary Space:</strong> O(|str|)<br><br>
<strong>Constraints:</strong><br>
1 ≤ |str| ≤ 10<sup>5</sup>
