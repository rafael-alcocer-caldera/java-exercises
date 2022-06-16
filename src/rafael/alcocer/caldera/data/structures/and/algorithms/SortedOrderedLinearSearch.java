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
import java.util.stream.IntStream;

/**
 * If the elements of the array are already sorted, then in many cases we don’t
 * have to scan the complete array to see if the element is there in the given
 * array or not.
 * 
 * Before sort: NUMS = { 8, 1, 13, 15, 7 }
 * 
 * After Sort: NUMS = { 1, 7, 8, 13, 15 }
 */
public class SortedOrderedLinearSearch {

	private static final int[] NUMS = { 8, 1, 13, 15, 7 };

	public static void main(String[] args) {
		SortedOrderedLinearSearch x = new SortedOrderedLinearSearch();
		
		System.out.println("Sorted Ordered Linear Search Old School");
		System.out.println("---------------------------------------");
		System.out.println(x.searchOldSchool(NUMS, 13));
		
		System.out.println("Sorted Ordered Linear Search New School");
		System.out.println("---------------------------------------");
		System.out.println(x.searchNewSchool(NUMS, 13));
	}

	/**
	 * In the algorithm below, it can be seen that, at any point if the value at
	 * nums[i] is greater than the data to be searched, then we just return –1 without
	 * searching the remaining array.
	 * 
	 * Time complexity of this algorithm is O(n).This is because in the worst case
	 * we need to scan the complete array. But in the average case it reduces the
	 * complexity even though the growth rate is the same. Space complexity: O(1).
	 * 
	 * @param nums
	 * @param data
	 * @return
	 */
	public int searchOldSchool(int[] nums, int data) {
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == data) {
				return i;
			} else if (nums[i] > data) {
				return -1;
			}
		}

		return -1;
	}
	
	/**
	 * 
	 * 
	 * @param nums
	 * @param data
	 * @return
	 */
	public int searchNewSchool(int[] nums, int data) {
		Arrays.sort(nums);
		
		return IntStream.range(0, nums.length)
			.filter(i -> nums[i] == data)
			.findFirst()
			.orElseGet(() -> -1);
	}
}
