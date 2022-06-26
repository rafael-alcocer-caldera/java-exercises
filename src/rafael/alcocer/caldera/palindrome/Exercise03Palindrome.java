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
package rafael.alcocer.caldera.palindrome;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into
 * lowercase letters and removing all non-alphanumeric characters, it reads the
 * same forward and backward. Alphanumeric characters include letters and
 * numbers.
 * 
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * 
 * Example 1:
 * 
 * Input: s = "A man, a plan, a canal: Panama"
 * 
 * Output: true
 * 
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * 
 * Example 2:
 * 
 * Input: s = "race a car"
 * 
 * Output: false
 * 
 * Explanation: "raceacar" is not a palindrome.
 * 
 * Example 3:
 * 
 * Input: s = " "
 * 
 * Output: true
 * 
 * Explanation: s is an empty string "" after removing non-alphanumeric
 * characters. Since an empty string reads the same forward and backward, it is
 * a palindrome.
 */
public class Exercise03Palindrome {

	private static final String S1 = "A man, a plan, a canal: Panama";
	private static final String S2 = "race a car";
	private static final String S3 = " ";

	public static void main(String[] args) {
		Exercise03Palindrome x = new Exercise03Palindrome();

		System.out.println("INPUT: " + "\"" + S1 + "\"");
		System.out.println("OUTPUT: " + x.isPalindrome(S1));

		System.out.println("---------------------------------------");

		System.out.println("INPUT: " + "\"" + S2 + "\"");
		System.out.println("OUTPUT: " + x.isPalindrome(S2));

		System.out.println("---------------------------------------");

		System.out.println("INPUT: " + "\"" + S3 + "\"");
		System.out.println("OUTPUT: " + x.isPalindrome(S3));
	}

	public boolean isPalindrome(String s) {
		s = s.replaceAll("\\W|_", "").toLowerCase();
		
		System.out.println("\"" + s + "\"" + " is palindrome?");

		StringBuilder builder = new StringBuilder(s);

		return s.equals(builder.reverse().toString());
	}
}
