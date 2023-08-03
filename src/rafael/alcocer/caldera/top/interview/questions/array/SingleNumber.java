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
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given a non-empty array of integers nums, every element appears twice except
 * for one. Find that single one.
 * 
 * You must implement a solution with a linear runtime complexity and use only
 * constant extra space.
 * 
 * Example 1:
 * 
 * Input: nums = [2,2,1]
 * 
 * Output: 1
 * 
 * Example 2:
 * 
 * Input: nums = [4,1,2,1,2]
 * 
 * Output: 4
 * 
 * Example 3:
 * 
 * Input: nums = [1]
 * 
 * Output: 1
 * 
 * 
 * Constraints:
 * 
 * Each element in the array appears twice except for one element which appears
 * only once.
 */
public class SingleNumber {

    private static final int[] NUMS1 = { 2, 2, 1 };
    private static final int[] NUMS2 = { 4, 1, 2, 1, 2 };
    private static final int[] NUMS3 = { 1 };

    public static void main(String[] args) {
        SingleNumber x = new SingleNumber();

        System.out.println("Single Number Old School");
        System.out.println("------------------------");

        System.out.println("INPUT: " + Arrays.toString(NUMS1));
        System.out.println("OUTPUT: " + x.singleNumberOldSchool(NUMS1));

        System.out.println("");

        System.out.println("INPUT: " + Arrays.toString(NUMS2));
        System.out.println("OUTPUT: " + x.singleNumberOldSchool(NUMS2));

        System.out.println("");

        System.out.println("INPUT: " + Arrays.toString(NUMS3));
        System.out.println("OUTPUT: " + x.singleNumberOldSchool(NUMS3));

        System.out.println("");

        System.out.println("Single Number New School");
        System.out.println("------------------------");

        System.out.println("INPUT: " + Arrays.toString(NUMS1));
        System.out.println("OUTPUT: " + x.singleNumberNewSchool(NUMS1));

        System.out.println("");

        System.out.println("INPUT: " + Arrays.toString(NUMS2));
        System.out.println("OUTPUT: " + x.singleNumberNewSchool(NUMS2));

        System.out.println("");

        System.out.println("INPUT: " + Arrays.toString(NUMS3));
        System.out.println("OUTPUT: " + x.singleNumberNewSchool(NUMS3));
    }

    public int singleNumberOldSchool(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);

                continue;
            }

            map.put(nums[i], 1);
        }

        Set<Entry<Integer, Integer>> set = map.entrySet();
        int result = 0;

        for (Entry<Integer, Integer> entry : set) {
            if (entry.getValue() == 1) {
                return result = entry.getKey();
            }
        }

        return result;
    }

    public int singleNumberNewSchool(int[] nums) {
        return Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst().map(m -> m.getKey())
                .orElseGet(() -> 0).intValue();
    }
}
