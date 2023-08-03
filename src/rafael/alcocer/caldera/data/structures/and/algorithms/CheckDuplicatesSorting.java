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
package rafael.alcocer.caldera.data.structures.and.algorithms;

import java.util.Arrays;

/**
 * PROBLEM: Can we improve the complexity of Problem-1’s (CheckDuplicates)
 * solution?
 * 
 * SOLUTION: Yes. Sort the given array. After sorting, all the elements with
 * equal values will be adjacent. Now, do another scan on this sorted array and
 * see if there are elements with the same value and adjacent.
 */
public class CheckDuplicatesSorting {

    private static final int[] NUMS1 = { 8, 1, 13, 15, 7 };
    private static final int[] NUMS2 = { 8, 1, 13, 15, 7, 15 };

    public static void main(String[] args) {
        CheckDuplicatesSorting x = new CheckDuplicatesSorting();
        x.checkDuplicates(NUMS1);
        System.out.println("");
        x.checkDuplicates(NUMS2);
    }

    /**
     * Time Complexity: O(nlogn), for sorting (assuming nlogn sorting algorithm).
     * 
     * Space Complexity: O(1).
     * 
     * @param nums
     */
    public void checkDuplicates(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                System.out.println("Duplicates: " + nums[i] + " <=> " + nums[i + 1]);

                return;
            }
        }

        System.out.println("No duplicates");
    }
}
