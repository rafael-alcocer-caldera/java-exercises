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
package rafael.alcocer.caldera.streams.groupingby;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * PROBLEM: Count the number of occurrences of letters in a String.
 * 
 * INPUT:
 * 
 * "abcdekyrfadcelmaaafdghjkdsda"
 * 
 * OUTPUT:
 * 
 * {a=6, b=1, c=2, d=5, e=2, f=2, g=1, h=1, j=1, k=2, l=1, m=1, r=1, s=1, y=1}
 */
public class Exercise31Stream {

	private static final String WORD = "abcdekyrfadcelmaaafdghjkdsda";

	public static void main(String[] args) {
		Exercise31Stream x = new Exercise31Stream();
		x.go(WORD);
	}

	public void go(String word) {
		Map<Character, Long> map = word.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(map);
	}
}
