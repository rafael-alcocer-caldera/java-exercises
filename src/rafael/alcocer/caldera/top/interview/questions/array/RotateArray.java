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

/**
 * Given an array, rotate the array to the right by k steps, where k is
 * non-negative.
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * 
 * Output: [5,6,7,1,2,3,4]
 * 
 * Explanation:
 * 
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * 
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * 
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * 
 * Example 2:
 * 
 * Input: nums = [-1,-100,3,99], k = 2
 * 
 * Output: [3,99,-1,-100]
 * 
 * Explanation:
 * 
 * rotate 1 steps to the right: [99,-1,-100,3]
 * 
 * rotate 2 steps to the right: [3,99,-1,-100]
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 10^5
 * 
 * -2^31 <= nums[i] <= 2^31 - 1
 * 
 * 0 <= k <= 10^5
 * 
 * 
 * Follow up:
 * 
 * Try to come up with as many solutions as you can. There are at least three
 * different ways to solve this problem. Could you do it in-place with O(1)
 * extra space?
 */
public class RotateArray {

	private static final int[] NUMS1 = { 8, 1, 13, 15, 7 };
	private static final int[] NUMS2 = { 2, 7, 11, 15 };
	private static final int[] NUMS3 = { 3, 2, 4 };
	private static final int[] NUMS4 = { 1, 2, 3, 4, 5, 6, 7 };
	private static final int[] NUMS5 = { -1, -100, 3, 99 };

	public static void main(String[] args) {
		RotateArray x = new RotateArray();

		// [8,1,13,15,7] -> [7,8,1,13,15]
		System.out.println("INPUT: " + Arrays.toString(NUMS1));
		System.out.println("OUTPUT: " + Arrays.toString(x.rotate(NUMS1, 1)));

		System.out.println("");

		// [2,7,11,15] -> [15,2,7,11] -> [11,15,2,7] -> [7,11,15,2]
		System.out.println("INPUT: " + Arrays.toString(NUMS2));
		System.out.println("OUTPUT: " + Arrays.toString(x.rotate(NUMS2, 3)));

		System.out.println("");

		// [3,2,4] -> [4,3,2] -> [2,4,3]
		System.out.println("INPUT: " + Arrays.toString(NUMS3));
		System.out.println("OUTPUT: " + Arrays.toString(x.rotate(NUMS3, 2)));

		System.out.println("");

		// [1,2,3,4,5,6,7] -> [7,1,2,3,4,5,6] -> [6,7,1,2,3,4,5] -> [5,6,7,1,2,3,4]
		System.out.println("INPUT: " + Arrays.toString(NUMS4));
		System.out.println("OUTPUT: " + Arrays.toString(x.rotate(NUMS4, 3)));

		System.out.println("");

		// [-1,-100,3,99] -> [99,-1,-100,3] -> [3,99,-1,-100]
		System.out.println("INPUT: " + Arrays.toString(NUMS5));
		System.out.println("OUTPUT: " + Arrays.toString(x.rotate(NUMS5, 2)));
	}

	public int[] rotate(int[] nums, int k) {
		if (k < 0 || k > Math.pow(10, 5) || nums.length < 1 || nums.length > Math.pow(10, 5)) {
			return new int[] {};
		}

		int temp[] = Arrays.copyOf(nums, nums.length);

		for (int i = 0; i < k; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (j == 0) {
					temp[j] = nums[nums.length - 1];
					continue;
				}

				temp[j] = nums[j - 1];
			}

			nums = Arrays.copyOf(temp, temp.length);
		}

		return nums;
	}
}
