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

import java.util.stream.IntStream;

/**
 * PROBLEM: Let us assume we are given an array where the order of the elements
 * is not known. That means the elements of the array are not sorted. In this
 * case, to search for an element we have to scan the complete array and see if
 * the element is there in the given list or not.
 * 
 * EXPECTED RESULT: We want the index of the data searched.
 * 
 * INPUT: { 8, 1, 13, 15, 7 }
 * 
 * If data = 13
 * 
 * OUTPUT: 2
 */
public class UnorderedLinearSearch {

    private static final int[] NUMS = { 8, 1, 13, 15, 7 };

    public static void main(String[] args) {
        UnorderedLinearSearch x = new UnorderedLinearSearch();

        System.out.println("Unordered Linear Search Old School");
        System.out.println("----------------------------------");
        System.out.println(x.searchOldSchool(NUMS, 13));

        System.out.println("");

        System.out.println("Unordered Linear Search New School");
        System.out.println("----------------------------------");
        x.searchNewSchool(NUMS, 13);
    }

    /**
     * Time complexity: O(n), in the worst case we need to scan the complete array.
     * 
     * Space complexity: O(1).
     * 
     * @param nums
     * @param n
     * @param data
     * @return
     */
    public int searchOldSchool(int[] nums, int data) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == data) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Here we create an IntStream with range from 0 to (array length - 1), so that,
     * we can get the index.
     * 
     * @param nums
     * @param data
     */
    public void searchNewSchool(int[] nums, int data) {
        IntStream.range(0, nums.length)
            .filter(i -> nums[i] == data)
            .findFirst()
            .ifPresent(System.out::println);
    }
}
