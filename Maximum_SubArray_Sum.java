public class Maximum_SubArray_Sum {
    // Maximum SubArray Sum Function
    public int maxSubArray(int[] nums) {
        // Initialize maxSum And currentSum to first index
        int maxSum = nums[0];
        int currentSum = nums[0];

        // Loop for each element of the array
        for (int i = 1; i < nums.length; i++) {
            // Find max of current element & current element + currentSum
            currentSum = Math.max(nums[i], nums[i] + currentSum);

            // currentSum is greater than maxSum then, currentSum is maxSum
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
}

// Output -
/*
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
*/

// Algorithms (Kadane Algorithm) -
/*
Initialize:
    maxSum = 0;
    currentSum = 0
Loop for each element of the array
  (a) Find max of current element & current element + currentSum
  (b) if(currentSum > maxSum)
            maxSum = currentSum
return maxSum
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
 */