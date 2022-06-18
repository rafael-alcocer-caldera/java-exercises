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
import java.util.List;

/**
 * From a list of numbers count those that are greater than 20 after applying
 * the square to each number.
 * 
 * INPUT: 1, 2, 3, 4, 5, 6
 * 
 * OUTPUT: 2
 * 
 * After square: 1, 4, 9, 16, 25, 36
 * 
 * Only 25, 36 are greater than 20, this means 2 numbers from the list.
 */
public class Exercise20Stream {

	public static void main(String[] args) {
		Exercise20Stream x = new Exercise20Stream();
		x.go();
	}

	public void go() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		long result = list.stream()
				.map(num -> num * num)
				.filter(num -> num > 20)
				.count();

		System.out.println(result);
	}
}
