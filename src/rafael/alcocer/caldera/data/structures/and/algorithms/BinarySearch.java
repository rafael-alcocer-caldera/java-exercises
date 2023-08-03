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
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The binary search algorithm needs a sorted data set which has its costs too.
 * 
 * Time Complexity: O(logn).
 * 
 * Space Complexity: O(1) [for iterative algorithm].
 * 
 * Before sort => NUMS = { 8, 1, 13, 15, 7 };
 * 
 * After sort => NUMS = { 1, 7, 8, 13, 15 };
 */
public class BinarySearch {

    private static final int[] NUMS = { 8, 1, 13, 15, 7 };

    public static void main(String[] args) {
        BinarySearch x = new BinarySearch();
        System.out.println("Binary Search Iterative Implementation");
        System.out.println("--------------------------------------");
        System.out.println(x.binarySearchIterativeImplementation(NUMS, 7));

        System.out.println("");

        System.out.println("Binary Search Recursive Implementation");
        System.out.println("--------------------------------------");
        System.out.println(x.binarySearchRecursiveImplementation(NUMS, 0, 4, 7));

        System.out.println("");

        System.out.println("Binary Search With Arrays");
        System.out.println("-------------------------");
        System.out.println(x.binarySearchWithArrays(NUMS, 7));

        System.out.println("");

        System.out.println("Binary Search With Collections");
        System.out.println("------------------------------");
        System.out.println(x.binarySearchWithCollections(NUMS, 7));
    }

    /**
     * If the number to search is 7:
     * -----------------------------
     * low = 0
     * high = nums.length - 1 = 5 - 1 = 4
     * 
     * while (low <= high) => (0 <= 4) {
     *     mid = low + ((high - low) / 2) = 2
     *     nums[mid] => nums[2]: 8
     *     
     *     else {
     *         high =  mid - 1 = 2 + 1 = 3
     *     } 
     * }
     * 
     * ------------------------------------------
     * 
     * low = 0
     * high = 1
     * 
     * while (low <= high) => (0 <= 1) {
     *     mid = low + ((high - low) / 2) = 0
     *     nums[mid] => nums[0]: 1
     *     
     *     else if (nums[mid] < data) => (1 < 7) {
     *         low =  mid + 1 = 0 + 1 = 1
     *     }
     * }
     * 
     * ------------------------------------------
     * 
     * low = 1
     * high = 1
     * 
     * while (low <= high) => (0 <= 1) {
     *     mid = low + ((high - low) / 2) = 1
     *     nums[mid] => nums[1]: 7
     *     
     *     if (nums[mid] == data) => (7 == 7) {
     *         return mid => return 1
     *     }
     * }
     * 
     * @param nums
     * @param data
     * @return
     */
    public int binarySearchIterativeImplementation(int[] nums, int data) {
        Arrays.sort(nums);

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (nums[mid] == data) {
                return mid;
            } else if (nums[mid] < data) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public int binarySearchRecursiveImplementation(int[] nums, int low, int high, int data) {
        int mid = low + ((high - low) / 2);

        if (low > high) {
            return -1;
        }

        if (nums[mid] == data) {
            return mid;
        } else if (nums[mid] < data) {
            return binarySearchRecursiveImplementation(nums, mid + 1, high, data);
        } else {
            return binarySearchRecursiveImplementation(nums, low, mid - 1, data);
        }
    }

    public int binarySearchWithArrays(int[] nums, int data) {
        Arrays.sort(nums);

        return Arrays.binarySearch(nums, data);
    }

    public int binarySearchWithCollections(int[] nums, int data) {
        Arrays.sort(nums);

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        return Collections.binarySearch(list, data);
    }
}
