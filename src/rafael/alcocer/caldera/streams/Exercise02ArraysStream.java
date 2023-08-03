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
package rafael.alcocer.caldera.streams;

import java.util.Arrays;

/**
 * PROBLEM: From an array of integers, get the square of each one and get the
 * average.
 * 
 * INPUT: { 2, 4, 6, 8, 10 }
 * 
 * OUTPUT: 44.0
 * 
 * 1. Convert the specified int array in an IntStream.
 * 
 * 2. Square each number.
 * 
 * 3. Get the average.
 * 
 * 4. Print the result.
 */
public class Exercise02ArraysStream {

    private static final int[] NUMBERS = { 2, 4, 6, 8, 10 };

    public static void main(String[] args) {
        Exercise02ArraysStream x = new Exercise02ArraysStream();
        x.go(NUMBERS);
    }

    public void go(int[] numbers) {
        Arrays.stream(numbers)
              .map(number -> number * number)
              .average()
              .ifPresent(System.out::println);
    }
}
