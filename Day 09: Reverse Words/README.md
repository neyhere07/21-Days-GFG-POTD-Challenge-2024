<h2><a href="https://www.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1">Reverse Words</a></h2><hr><p>Given a String str, reverse the string without reversing its individual words. Words are separated by dots.</p><p><strong>Note:</strong> The last character has not been '.'.</p>
<strong>Examples :</strong>
<pre>
<strong>Input:</strong> str = i.like.this.program.very.much
<strong>Output:</strong> much.very.program.this.like.i
<strong>Explanation:</strong> After reversing the whole string(not individual words), the input string becomes much.very.program.this.like.i
</pre>
<pre>
<strong>Input:</strong> str = pqr.mno
<strong>Output:</strong> mno.pqr
<strong>Explanation:</strong> After reversing the whole string , the input string becomes mno.pqr
</pre><br>
<strong>Expected Time Complexity:</strong> O(|str|)<br><strong>Expected Auxiliary Space:</strong> O(|str|)<br><br>
<strong>Constraints:</strong><br>1 <= |str| <= 10<sup>5</sup>
