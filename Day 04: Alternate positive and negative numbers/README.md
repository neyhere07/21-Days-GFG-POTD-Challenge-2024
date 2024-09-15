<h2><a href="https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1">Alternate positive and negative numbers</a></h2><strong>Difficulty: Easy | Accuracy: 33.86% | Points: 2</strong><hr>
<div>
  <p>Given an unsorted array<strong>arr</strong> containing both <strong>positive</strong> and <strong>negative</strong> numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.<br><strong>Note:</strong> Array should start with a positive number and 0 (zero) should be considered a positive element.</p>
  <strong>Examples:</strong>
  <pre>
    <strong>Input:</strong> arr[] = [9, 4, -2, -1, 5, 0, -5, -3, 2]
    <strong>Output:</strong> 9 -2 4 -1 5 -5 0 -3 2
    <strong>Explanation:</strong> Positive elements : [9,4,5,0,2]
    Negative elements : [-2,-1,-5,-3]
    As we need to maintain the relative order of postive elements and negative elements we will pick each element from the positive and negative and will store them. If any of the positive and negative numbersare completed. we will continue with the remaining signed elements.
    The output is 9,-2,4,-1,5,-5,0,-3,2.
  </pre>
  <pre>
    Input: arr[] = [-5, -2, 5, 2, 4, 7, 1, 8, 0, -8]
    Output: 5 -5 2 -2 4 -8 7 1 8 0
    Explanation : Positive elements : [5,2,4,7,1,8,0]
    Negative elements : [-5,-2,-8]
    The output is 5, -5, 2, -2, 4, -8, 7, 1, 8, 0.
  </pre>
  <strong>Expected Time Complexity:</strong> O(n)<br>
  <strong>Expected Auxiliary Space:</strong> O(n)<br><br>
  <strong>Constraints:</strong><br>
  1 ≤ arr.size() ≤ 10<sup>7</sup><br>
  -10<sup>6</sup> ≤ arr[i] ≤ 10<sup>7</sup>
</div>
