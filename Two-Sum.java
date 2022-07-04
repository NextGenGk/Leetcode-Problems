import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
    // Two Sum Function
    static int[] twoSum(int[] nums, int target) {
    // Create an HashMap
    HashMap<Integer, Integer> map = new HashMap<>();

    // Loop through nums length
        for(int i=0; i<nums.length; i++) {
            // add all the elements in hashMap
            map.put(nums[i], i);
        }

        // Loop through nums length
        for(int i=0; i<nums.length; i++) {
            // Store the first number
            int number = nums[i];
            // find remainder (target - number)
            int remainder = target - number;
            // If hashMap contains value
            if(map.containsKey(remainder)) {
            // Find second element index
            int index = map.get(remainder);
            // Find duplicate elements
            // Don't pick the same element (2,2)
            if(index == i){
                 continue;
            }
            // return indices
            // return new int[] {i, index};
            }
        }
        return new int[]{};
    }
}

/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */