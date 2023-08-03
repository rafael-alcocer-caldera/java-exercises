/**
 * Copyright [2022] [RAFAEL ALCOCER CALDERA]
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rafael.alcocer.caldera.top.interview.questions.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * You can return the answer in any order.
 * 
 * Example 1:
 * 
 * Input: nums = [2,7,11,15], target = 9
 * 
 * Output: [0,1]
 * 
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Example 2:
 * 
 * Input: nums = [3,2,4], target = 6
 * 
 * Output: [1,2]
 * 
 * Example 3:
 * 
 * Input: nums = [3,3], target = 6
 * 
 * Output: [0,1]
 * 
 * 
 * Constraints:
 * 
 * 2 <= nums.length <= 10^4
 * 
 * -10^9 <= nums[i] <= 10^9
 * 
 * -10^9 <= target <= 10^9
 */
public class TwoSum {

    private static final int[] NUMS1 = { 2, 1, 11, 15, 7 }; // target = 9 Output: [0,4]
    private static final int[] NUMS2 = { 2, 7, 11, 15 }; // target = 9 Output: [0,1]
    private static final int[] NUMS3 = { 3, 2, 4 }; // target = 6 Output: [1,2]
    private static final int[] NUMS4 = { 3, 3 }; // target = 6 Output: [0,1]

    int index = 0;

    public static void main(String[] args) {
        TwoSum x = new TwoSum();

        System.out.println("Two Sum with Map");
        System.out.println("----------------");

        System.out.println("INPUT: " + Arrays.toString(NUMS1));
        System.out.println("TARGET: " + 9);
        System.out.println("OUTPUT: " + Arrays.toString(x.twoSum(NUMS1, 9)));

        System.out.println("");

        System.out.println("INPUT: " + Arrays.toString(NUMS2));
        System.out.println("TARGET: " + 9);
        System.out.println("OUTPUT: " + Arrays.toString(x.twoSum(NUMS2, 9)));

        System.out.println("");

        System.out.println("INPUT: " + Arrays.toString(NUMS3));
        System.out.println("TARGET: " + 6);
        System.out.println("OUTPUT: " + Arrays.toString(x.twoSum(NUMS3, 6)));

        System.out.println("");

        System.out.println("INPUT: " + Arrays.toString(NUMS4));
        System.out.println("TARGET: " + 6);
        System.out.println("OUTPUT: " + Arrays.toString(x.twoSum(NUMS4, 6)));

        System.out.println("");

        System.out.println("Two Sum Brute Force");
        System.out.println("-------------------");

        System.out.println("INPUT: " + Arrays.toString(NUMS1));
        System.out.println("TARGET: " + 9);
        System.out.println("OUTPUT: " + Arrays.toString(x.twoSumBruteForce(NUMS1, 9)));

        System.out.println("");

        System.out.println("INPUT: " + Arrays.toString(NUMS2));
        System.out.println("TARGET: " + 9);
        System.out.println("OUTPUT: " + Arrays.toString(x.twoSumBruteForce(NUMS2, 9)));

        System.out.println("");

        System.out.println("INPUT: " + Arrays.toString(NUMS3));
        System.out.println("TARGET: " + 6);
        System.out.println("OUTPUT: " + Arrays.toString(x.twoSumBruteForce(NUMS3, 6)));

        System.out.println("");

        System.out.println("INPUT: " + Arrays.toString(NUMS4));
        System.out.println("TARGET: " + 6);
        System.out.println("OUTPUT: " + Arrays.toString(x.twoSumBruteForce(NUMS4, 6)));
    }

    /**
     * i = 0 =>
     * 
     * x = target - nums[i] = 9 - 2 = 7
     * 
     * map.put(nums[i], i) => map.put(2, 0)
     * 
     * ------------------------------------
     * 
     * i = 1 =>
     * 
     * x = target - nums[i] = 9 - 1 = 8
     * 
     * map.put(nums[i], i) => map.put(1, 1)
     * 
     * ------------------------------------
     * 
     * Cuando llega al segundo numero que hace que el target sea 9... esto es, el
     * primero fue 2... el segundo es 7
     * 
     * i = 4 =>
     * 
     * x = target - nums[i] = 9 - 7 = 2
     * 
     * map.put(nums[i], i) => map.put(7, 4)
     * 
     * El map contiene lo siguiente:
     * 
     * {1=1, 2=0, 7=4, 11=2, 15=3}
     * 
     * Por lo tanto, if (map.containsKey(x)) {...} if (map.containsKey(2)) {} es
     * true
     * 
     * entonces return new int[] { map.get(x), i } =>
     * 
     * return new int[] { 0, 4 }
     * 
     * Time complexity: O(n)
     * 
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        if (target < -Math.pow(10, 9) || target > Math.pow(10, 9) || nums.length < 2 || nums.length > Math.pow(10, 9)) {
            return new int[] {};
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] { map.get(target - nums[i]), i };
            }

            map.put(nums[i], i); // value-index
        }

        return new int[] {};
    }

    /**
     * Time complexity: O(n^2)
     * 
     * @param nums
     * @param target
     * @return
     */
    private int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {};
    }
}
