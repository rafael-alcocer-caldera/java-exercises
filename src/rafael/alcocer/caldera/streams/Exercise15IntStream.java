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
import java.util.stream.IntStream;

/**
 * PROBLEM: Find 3 distinct smallest numbers from an array.
 * 
 * INPUT: {100, 50, 56, 22, 3, 66, 200, 24, 13,3}
 * 
 * OUTPUT: 3, 13, 22
 */
public class Exercise15IntStream {
	
	private static final int[] NUMBERS = {100, 50, 56, 22, 3, 66, 200, 24, 13,3};

    public static void main(String[] args) {
        Exercise15IntStream x = new Exercise15IntStream();
        x.goOldSchool(NUMBERS);
        System.out.println("-----");
        x.go(NUMBERS);
    }
    
    public void goOldSchool(int[] numbers) {
        Arrays.sort(numbers);
        
        for (int i = 0; i < 3; i++) {
            System.out.println(numbers[i]); // distinct is missing
        }
    }

    public void go(int[] numbers) {
        IntStream.of(numbers)
            .distinct()
            .sorted()
            .limit(3)
            .forEach(System.out::println);
    }
}
