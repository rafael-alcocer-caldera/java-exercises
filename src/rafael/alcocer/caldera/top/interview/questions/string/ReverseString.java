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
package rafael.alcocer.caldera.top.interview.questions.string;

import java.util.Arrays;

/**
 * Write a function that reverses a string. The input string is given as an
 * array of characters s.
 * 
 * You must do this by modifying the input array in-place with O(1) extra
 * memory.
 * 
 * Example 1:
 * 
 * Input: s = ["h","e","l","l","o"]
 * 
 * Output: ["o","l","l","e","h"]
 * 
 * ------------------------------------
 * 
 * Example 2:
 * 
 * Input: s = ["H","a","n","n","a","h"]
 * 
 * Output: ["h","a","n","n","a","H"]
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 105 s[i] is a printable ascii character.
 */
public class ReverseString {

	private static final char[] C1 = { 'h', 'e', 'l', 'l', 'o' };
	private static final char[] C2 = { 'H', 'a', 'n', 'n', 'a', 'h' };

	public static void main(String[] args) {
		ReverseString x = new ReverseString();

		System.out.println("Reverse String Old School");
		System.out.println("-------------------------");
		System.out.print("INPUT: " + String.valueOf(C1));
		System.out.println("");
		System.out.print("OUTPUT: " + String.valueOf(x.reverseStringOldSchool(C1)));

		System.out.println("");
		System.out.println("");

		System.out.println("Reverse String Old School");
		System.out.println("-------------------------");
		System.out.print("INPUT: " + String.valueOf(C2));
		System.out.println("");
		System.out.print("OUTPUT: " + String.valueOf(x.reverseStringOldSchool(C2)));

		System.out.println("");
		System.out.println("");

		System.out.println("Reverse String With StringBuilder");
		System.out.println("---------------------------------");
		System.out.print("INPUT: " + String.valueOf(C1));
		System.out.println("");
		System.out.print("OUTPUT: " + String.valueOf(x.reverseStringWithStringBuilder(C1)));

		System.out.println("");
		System.out.println("");

		System.out.println("Reverse String With StringBuilder");
		System.out.println("---------------------------------");
		System.out.print("INPUT: " + String.valueOf(C2));
		System.out.println("");
		System.out.print("OUTPUT: " + String.valueOf(x.reverseStringWithStringBuilder(C2)));
	}

	/**
	 * The arrays C1, C2 are declared as final, but the elements of an array can be
	 * changed without any problem.
	 * 
	 * That's why I work with the copy of array, to avoid changes to the original
	 * arrays C1, C2.
	 * 
	 * @param s
	 * @return
	 */
	public char[] reverseStringOldSchool(char[] s) {
		char[] copy = Arrays.copyOf(s, s.length);
		int j = 1;

		for (int i = 0; i < s.length; i++) {
			copy[i] = s[s.length - j];
			j++;
		}

		return copy;
	}

	/**
	 * Appends the string representation of the char array argument to this
	 * sequence. The characters of the array argument are appended, in order, to the
	 * contents of this sequence. The length of this sequence increases by the
	 * length of the argument.
	 * 
	 * @param s
	 * @return
	 */
	public char[] reverseStringWithStringBuilder(char[] s) {
		return new StringBuilder().append(s).reverse().toString().toCharArray();
	}
}
