
// Time Complexity :O(2^N - 1) for Brute Force,O(N) for Approach 2
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes Both Approaches Worked
// 


/**
 * Approach 1 Naive or Brute Force
 * Naive Approach: Simple approach is to generate all possible subset one by one and calculate sum of all elements. Time Complexity of this approach is exponential as there are total 2n – 1 subsets.
 * 
 * 
 * Approach 2
 * An Efficient approach is to generalize the whole problem into some pattern. Suppose we have two numbers a and b. 
 *  We can write all possible subset products as:-
 * = a + b + ab 
   = a(1+b) + b + 1 - 1 
   = a(1+b) + (1+b) - 1 
   = (a + 1) * (b + 1) - 1
   = (1+a) * (1 + b) - 1

   Now take three numbers a, b, c:-
      = a + b + c + ab + bc + ca + abc 
   = a + ac + b + bc + ab + abc + c + 1 - 1
   = a(1+c) + b(1+c) + ab(1+c) + c + 1 - 1
   = (a + b + ab + 1)(1+c) - 1 
   = (1+a) * (1+b) * (1+c) - 1 
 */


public class Subset 
{ 
    // Returns sum of products of all subsets 
    // of arr[0..n-1] 
    static int productOfSubsetSums(int arr[], int n) 
    { 
        int ans = 1; 
        for (int i = 0; i < n; ++i ) 
            ans = ans * (arr[i] + 1); 
        return ans-1; 
    } 
      
    public static void main (String[] args) 
    { 
        int arr[] = {1, 2, 3, 4}; 
        int n = arr.length; 
        System.out.println(productOfSubsetSums(arr, n)); 
    } 
}