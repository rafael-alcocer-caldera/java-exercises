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
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,1]
 * 
 * Output: true
 * 
 * Example 2:
 * 
 * Input: nums = [1,2,3,4]
 * 
 * Output: false
 * 
 * Example 3:
 * 
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * 
 * Output: true
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 10^5 
 * 
 * -10^9 <= nums[i] <= 10^9
 */
public class ContainsDuplicate {

    private static final int[] NUMS1 = { 1, 2, 3, 1 };
    private static final int[] NUMS2 = { 1, 2, 3, 4 };
    private static final int[] NUMS3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

    public static void main(String[] args) {
        ContainsDuplicate x = new ContainsDuplicate();
        System.out.println("NUMS1: " + x.containsDuplicate(NUMS1));
        System.out.println("NUMS2: " + x.containsDuplicate(NUMS2));
        System.out.println("NUMS3: " + x.containsDuplicate(NUMS3));
    }

    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 1 || nums.length > Math.pow(10, 5)) {
            return false;
        }

        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .anyMatch(entry -> entry.getValue() >= 2);
    }
}
