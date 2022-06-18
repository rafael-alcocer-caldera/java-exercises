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
 * PROBLEM: From an array of strings, get only those that start with an 'S' in an
 * ascending order.
 * 
 * INPUT: { "Steve", "Svetlana", "sara", "John", "paul" }
 * 
 * OUTPUT: SARA STEVE SVETLANA
 * 
 * SOLUTION:
 * 
 * 1. Convert the specified string array in a Stream of strings.
 * 
 * 2. Convert each string to uppercase.
 * 
 * 3. Filter to get only the strings that start with 'S'.
 * 
 * 4. Sort the stream in ascending order.
 * 
 * 5. Print the result.
 */
public class Exercise01ArraysStream {

	private static final String[] NAMES = { "Steve", "Svetlana", "sara", "John", "paul" };

	public static void main(String[] args) {
		Exercise01ArraysStream x = new Exercise01ArraysStream();
		x.go(NAMES);
	}

	public void go(String[] names) {
		Arrays.stream(names)
				.map(name -> name.toUpperCase())
				.filter(name -> name.startsWith("S"))
				.sorted()
				.forEach(System.out::println);
	}
}
