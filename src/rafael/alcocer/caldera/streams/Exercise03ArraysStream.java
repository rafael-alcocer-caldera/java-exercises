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
 * From a list of names, give me the total number of letters in all the names
 * with more than 5 letters.
 * 
 * INPUT: { "Steve", "Svetlana", "sara", "John", "paul", "Ramiro", "Amanda", "Courtney",
			"Hubert" }
 * 
 * OUTPUT: 34
 */
public class Exercise03ArraysStream {

	private static final String[] NAMES = { "Steve", "Svetlana", "sara", "John", "paul", "Ramiro", "Amanda", "Courtney",
			"Hubert" };

	public static void main(String[] args) {
		Exercise03ArraysStream x = new Exercise03ArraysStream();
		System.out.println(x.go(NAMES));
	}

	public int go(String[] names) {
		return Arrays.stream(names)
				.filter(name -> name.length() > 5)
				.mapToInt(name -> name.length())
				.sum();
	}
}
