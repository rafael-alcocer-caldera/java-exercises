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

/**
 * PROBLEM: Given an array of n numbers, give an algorithm for checking whether
 * there are any duplicate elements in the array or no?
 * 
 * SOLUTION: This is one of the simplest problems. One obvious answer to this is
 * exhaustively searching for duplicates in the array. That means, for each
 * input element check whether there is any element with the same value. This we
 * can solve just by using two simple for loops. The code for this solution can
 * be given as:
 */
public class CheckDuplicatesBruteForce {

    private static final int[] NUMS1 = { 8, 1, 13, 15, 7 };
    private static final int[] NUMS2 = { 8, 1, 13, 15, 7, 13 };

    public static void main(String[] args) {
        CheckDuplicatesBruteForce x = new CheckDuplicatesBruteForce();
        x.checkDuplicates(NUMS1);
        System.out.println("");
        x.checkDuplicates(NUMS2);
    }

    /**
     * Time Complexity: O(n^2), for two nested for loops.
     * 
     * Space Complexity: O(1).
     * 
     * @param nums
     */
    public void checkDuplicates(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println("Duplicates: " + nums[i] + " <=> " + nums[j]);

                    return;
                }
            }
        }

        System.out.println("No duplicates");
    }
}
