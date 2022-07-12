public class Jump_Game_I {
    // Jump Game I Function
    public boolean canJump(int[] nums) {
        // Initialize i to 0
        int i = 0;
        // Loop through nums length to max Reach
        for (int maxReach = 0; i < nums.length && i <= maxReach; i++) {
            // Calculate the max of ith + current element, & maxReach
            maxReach = Math.max( maxReach, i + nums[i]);
        }
        // Finally return true, if i is equal nums length
        return i == nums.length;
    }
}

// Output -
/*
Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
*/

// Explantion
/*
i) For Input 1, we can jump 1 step from index 0 to 1, then 3 steps to the last index.

ii) For Input 2, we can try different ways but every time we will arrive at index 3. Its maximum jump length is 0. So we can’t go further from that index. So it is impossible to reach the last index.
*/

// Algorithm -
/*
1. At every step, we can check what is the maximum index we can reach from that index.
2. It’s like a greedy approach.
3. In the end, we can check if the maximum index reached is the last index of the array.
4. If both are the same, we can return true otherwise we can return false.
*/

// Time & Space Complexity -
/*
Time -O(n)
Space - O(1)
*/