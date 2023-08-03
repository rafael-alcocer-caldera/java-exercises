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

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * Find the longest palindrome within a string.
 */
public class Exercise02Palindrome {

    private static final String S1 = "abcdfhreconocerhyhduracer";

    public static void main(String[] args) {
        Exercise02Palindrome x = new Exercise02Palindrome();
        x.go(S1);
    }

    public void go(String s) {
        Exercise01Palindrome palindrome = new Exercise01Palindrome();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (palindrome.isPalindromeWithStringBuilder(s.substring(i, j))) {
                    set.add(s.substring(i, j));
                }
            }
        }

        System.out.println("##### Palindromes found: " + set);

        System.out.println("##### The longest Palindrome within the String is:");

        set.stream()
           .max(Comparator.comparingInt(p -> p.length()))
           .ifPresent(System.out::println);
    }
}
