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

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * PROBLEM: Get the minimum number from an array
 *
 */
public class Exercise14IntStream {

	private static final int[] NUMBERS = { 100, 50, 56, 22, 3, 66 };

	public static void main(String[] args) {
		Exercise14IntStream x = new Exercise14IntStream();
		
		x.getMinimumNumberFromArrayOldSchool(NUMBERS);
		
		System.out.println("-----");
		
		x.getMinimumNumberFromArrayNewSchool(NUMBERS);
		
		System.out.println("-----");
		
		System.out.println(x.getMinimumNumberFromArrayNewSchool2(NUMBERS).getMin());
	}

	public void getMinimumNumberFromArrayOldSchool(int[] numbers) {
		int minNumber = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < minNumber) {
				minNumber = numbers[i];
			}
		}

		System.out.println(minNumber);
	}

	public void getMinimumNumberFromArrayNewSchool(int[] numbers) {
		IntStream.of(numbers)
			.min()
			.ifPresent(System.out::println);
	}
	
	public IntSummaryStatistics getMinimumNumberFromArrayNewSchool2(int[] numbers) {
		return IntStream.of(numbers)
				.summaryStatistics();
	}
}
