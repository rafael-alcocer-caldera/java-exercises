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
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * PROBLEM: Count the number of occurrences of words in an array.
 * 
 * INPUT:
 * 
 * "six", "one", "two", "three", "one", "six", "five", "six", "one", "six"
 * 
 * OUTPUT:
 * 
 * {six=4, one=3, five=1, three=1, two=1}
 */
public class Exercise30Stream {

	private static final String[] ARRAY = { "six", "one", "two", "three", "one", "six", "five", "six", "one", "six" };

	public static void main(String[] args) {
		Exercise30Stream x = new Exercise30Stream();
		
		System.out.println("Count the number of occurrences of words in an array Old School");
		System.out.println("---------------------------------------------------------------");
		x.goOldSchool(ARRAY);
		
		System.out.println("");
		
		System.out.println("Count the number of occurrences of words in an array New School");
		System.out.println("---------------------------------------------------------------");
		x.goNewSchool(ARRAY);
	}
	
	public void goOldSchool(String[] array) {
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i]) + 1);
			} else {
				map.put(array[i], 1);
			}
		}
		
		System.out.println(map);
	}

	public void goNewSchool(String[] array) {
		Map<String, Long> map = Arrays.asList(array)
				.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(map);
	}
}
