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
package rafael.alcocer.caldera.anagramas;

import java.util.HashMap;
import java.util.Map;

/**
 * PROBLEM: Check if 2 strings are anagrams. Space characters are not
 * considered.
 * 
 * EXPLANATION: Two words are anagrams of each other if they contain the same
 * combination of characters, including counts, but regardless of order. "BEAR"
 * and "BARE" are anagrams of each other, but "ARREAR" and "RARE" are not.
 * 
 * SOLUTION: Create 2 Maps, one for each string, compare one map against the
 * other. And as Baeldung says in the following link:
 * 
 * https://www.baeldung.com/java-compare-hashmaps
 * 
 * The way that Map.equals() works is by comparing keys and values using the
 * Object.equals() method. This means it only works when both key and value
 * objects implement equals() properly.
 */
public class Exercise02AnagramDeclarativeAndImperativeProgramming {

	private static final String S1 = "deudora";
	private static final String S2 = "eduardo";
	private static final String S3 = "funeral";
	private static final String S4 = "real      fun";

	public static void main(String[] args) {
		Exercise02AnagramDeclarativeAndImperativeProgramming x = new Exercise02AnagramDeclarativeAndImperativeProgramming();
		x.isAnagram(S1, S2);
		System.out.println("####################################################");
		x.isAnagram(S3, S4);
		System.out.println("####################################################");
		x.isAnagram(S1, S3);
		System.out.println("####################################################");
	}

	/**
	 * This solution is a mixed of Old School (Imperative Programming) and New
	 * School (Java Streams, (Declarative Programming).
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public boolean isAnagram(String s1, String s2) {
		System.out.println("##### \"" + s1 + "\" is Anagram of \"" + s2 + "\" ?");
		
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();

		s1.chars().mapToObj(c -> (char) c).forEach(c -> {
			if (Character.isSpaceChar(c)) {
				return;
			}

			if (map1.containsKey(c)) {
				map1.put(c, map1.get(c) + 1);
			} else {
				map1.put(c, 1);
			}
		});

		s2.chars().mapToObj(c -> (char) c).forEach(c -> {
			if (Character.isSpaceChar(c)) {
				return;
			}

			if (map2.containsKey(c)) {
				map2.put(c, map2.get(c) + 1);
			} else {
				map2.put(c, 1);
			}
		});

		System.out.println("##### map1: " + map1);
		System.out.println("##### map2: " + map2);
		System.out.println("##### map1.equals(map2): " + map1.equals(map2));
		System.out.println("");

		return map1.equals(map2);
	}
}
