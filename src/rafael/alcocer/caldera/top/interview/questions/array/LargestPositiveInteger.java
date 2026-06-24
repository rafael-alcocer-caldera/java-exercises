/**
 * Copyright [2026] [RAFAEL ALCOCER CALDERA]
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rafael.alcocer.caldera.top.interview.questions.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * This one was gotten fromÑ
 *
 * https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/description/?envType=problem-list-v2&envId=mmza0utr
 *
 * Given an integer array nums that does not contain any zeros, find the largest positive integer k such that -k also exists in the array.
 *
 * Return the positive integer k. If there is no such integer, return -1.
 *
 * Example 1:
 *
 * Input: nums = [-1,2,-3,3]
 *
 * Output: 3
 *
 * Explanation: 3 is the only valid k we can find in the array.
 *
 * Example 2:
 *
 * Input: nums = [-1,10,6,7,-7,1]
 *
 * Output: 7
 *
 * Explanation: Both 1 and 7 have their corresponding negative values in the array. 7 has a larger value.
 *
 * Example 3:
 *
 * Input: nums = [-10,8,6,7,-2,-3]
 *
 * Output: -1
 *
 * Explanation: There is no a single valid k, we return -1.
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 1000
 *
 * -1000 <= nums[i] <= 1000
 *
 * nums[i] != 0
 */
public class LargestPositiveInteger {

    private static final int[] nums1 = {-1, 2, -3, 3};
    private static final int[] nums2 = {-1, 10, 6, 7, -7, 1};
    private static final int[] nums3 = {-10, 8, 6, 7, -2, -3};

    public static void main(String[] args) {
        LargestPositiveInteger x = new LargestPositiveInteger();

        System.out.println(x.findMaxUsingStreams(nums1));
        System.out.println(x.findMaxUsingStreams(nums2));
        System.out.println(x.findMaxUsingStreams(nums3));
        System.out.println("--------------------------");
        System.out.println(x.findMaxUsingSet(nums1));
        System.out.println(x.findMaxUsingSet(nums2));
        System.out.println(x.findMaxUsingSet(nums3));
    }

    public int findMaxUsingStreams(int[] nums) {
        Map<Integer, List<Integer>> map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Math::abs));

        System.out.println(map); // {1=[-1, 1], 6=[6], 7=[7, -7], 10=[10]}

        int max = map.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(entry.getKey())
                        && entry.getValue().contains(-entry.getKey()))
                .mapToInt(entry -> entry.getKey())
                .max()
                .orElse(-1);

        return max;
    }

    public int findMaxUsingSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxK = -1;

        for (int num : nums) {
            // Si el opuesto ya existe en el set, evaluamos si es el mayor k encontrado
            if (set.contains(-num)) {
                maxK = Math.max(maxK, Math.abs(num));
            }

            // Guardamos el número actual en el set
            set.add(num);
        }

        return maxK;
    }
}
