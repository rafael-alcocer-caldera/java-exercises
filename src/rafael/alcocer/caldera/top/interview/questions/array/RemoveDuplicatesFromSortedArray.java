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
import java.util.stream.IntStream;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the
 * duplicates in-place such that each unique element appears only once. The
 * relative order of the elements should be kept the same.
 * 
 * Since it is impossible to change the length of the array in some languages,
 * you must instead have the result be placed in the first part of the array
 * nums. More formally, if there are k elements after removing the duplicates,
 * then the first k elements of nums should hold the final result. It does not
 * matter what you leave beyond the first k elements.
 * 
 * Return k after placing the final result in the first k slots of nums.
 * 
 * Do not allocate extra space for another array. You must do this by modifying
 * the input array in-place with O(1) extra memory.
 * 
 * Custom Judge:
 * 
 * The judge will test your solution with the following code:
 * 
 * int[] nums = [...]; // Input array int[]
 * 
 * expectedNums = [...]; // The expected answer with correct length
 * 
 * int k = removeDuplicates(nums); // Calls your implementation
 * 
 * assert k == expectedNums.length;
 * 
 * for (int i = 0; i < k; i++) { assert nums[i] == expectedNums[i]; }
 * 
 * If all assertions pass, then your solution will be accepted.
 * 
 * Example 1:
 * 
 * Input: nums = [1,1,2]
 * 
 * Output: 2, nums = [1,2,_]
 * 
 * Explanation: Your function should return k = 2, with the first two elements
 * of nums being 1 and 2 respectively. It does not matter what you leave beyond
 * the returned k (hence they are underscores). Example 2:
 * 
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * 
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * 
 * Explanation: Your function should return k = 5, with the first five elements
 * of nums being 0, 1, 2, 3, and 4 respectively. It does not matter what you
 * leave beyond the returned k (hence they are underscores).
 * 
 * Constraints:
 * 
 * nums is sorted in non-decreasing order.
 */
public class RemoveDuplicatesFromSortedArray {

	private static final int[] NUMS1 = { 1, 1, 2 };
	private static final int[] NUMS2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
	private static final int[] NUMS3 = { 1 };
	private static final int[] NUMS4 = { 1, 1 };
	private static final int[] NUMS5 = { 1, 1, 2, 2, 2, 2, 3 };

	private int x = 0;

	public static void main(String[] args) {
		System.out.println("INPUT: " + Arrays.toString(NUMS1));
		System.out.println("k:" + new RemoveDuplicatesFromSortedArray().removeDuplicates(NUMS1));

		System.out.println("");

		System.out.println("INPUT: " + Arrays.toString(NUMS2));
		System.out.println("k:" + new RemoveDuplicatesFromSortedArray().removeDuplicates(NUMS2));

		System.out.println("");

		System.out.println("INPUT: " + Arrays.toString(NUMS3));
		System.out.println("k:" + new RemoveDuplicatesFromSortedArray().removeDuplicates(NUMS3));

		System.out.println("");

		System.out.println("INPUT: " + Arrays.toString(NUMS4));
		System.out.println("k:" + new RemoveDuplicatesFromSortedArray().removeDuplicates(NUMS4));

		System.out.println("");

		System.out.println("INPUT: " + Arrays.toString(NUMS5));
		System.out.println("k:" + new RemoveDuplicatesFromSortedArray().removeDuplicates(NUMS5));
	}

	/**
	 * This line:
	 * 
	 * nums[count] = nums[nums.length - 1];
	 * 
	 * is needed, without it we only have [0, 1, 2, 3] for NUMS2 for example.
	 * 
	 * We need to add the last element (4) to the next index (count => 5).
	 * 
	 * k = count + 1 = 5 + 1 = 6 elements in the array for NUMS2.
	 * 
	 * @param nums
	 * @return
	 */
	public int removeDuplicates(int[] nums) {
		int count = (int) IntStream.range(x, nums.length)
				.filter(i -> i < nums.length - 1)
				.filter(i -> nums[i] != nums[i + 1])
				.mapToObj(i -> {
					nums[x] = nums[i]; // modifying the input array
					
					x++;
					
					return nums[i];
				})
				.count();
			
			nums[count] = nums[nums.length - 1];
			
			int k = count + 1;
			
			// filling with 0´s after the first k elements
			IntStream.range(k, nums.length)
				.forEach(i -> nums[i] = 0);
			
			System.out.println("OUTPUT: " + Arrays.toString(nums));
			
			return k;
	}
}
