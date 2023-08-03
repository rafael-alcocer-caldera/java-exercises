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

import java.util.HashSet;
import java.util.Set;

/**
 * PROBLEM: Write a function that takes in an array of strings as its argument
 * and then print all the anagrams found in the array.
 * 
 * EXPLANATION: Two words are anagrams of each other if they contain the same
 * combination of characters, including counts, but regardless of order. "BEAR"
 * and "BARE" are anagrams of each other, but "ARREAR" and "RARE" are not.
 * 
 * SOLUTION: I will use isAnagram(String s1, String s2) from
 * Exercise01AnagramImperativeProgramming class. I could've have used any of the
 * other two classes (Exercise21AnagramImperativeProgramming,
 * Exercise03AnagramImperativeProgramming) with the same result.
 * 
 * INPUT: {"eat", "tea", "funeral", "raza", "frog", "elvis",
 * "real&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;fun", "lives", "deudora", "dog",
 * "ate", "eduardo", "zara"}
 * 
 * OUTPUT: [tea, ate, raza, lives, deudora, funeral, eat,
 * real&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;fun, eduardo, elvis, zara]
 */
public class Exercise04AnagramImperativeProgramming {

    private static final String[] STRING_ARRAY = { "eat", "tea", "funeral", "raza", "frog", "elvis", "real      fun",
            "lives", "deudora", "dog", "ate", "eduardo", "zara" };

    public static void main(String[] args) {
        Exercise04AnagramImperativeProgramming x = new Exercise04AnagramImperativeProgramming();
        x.findAnagrams(STRING_ARRAY);
    }

    public Set<String> findAnagrams(String[] stringArray) {
        Exercise01AnagramImperativeProgramming exercise01 = new Exercise01AnagramImperativeProgramming();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray.length; j++) {
                // Skip the same word
                if (i == j) {
                    continue;
                }

                if (exercise01.isAnagram(stringArray[i], stringArray[j])) {
                    set.add(stringArray[i]);
                    set.add(stringArray[j]);
                }
            }
        }

        System.out.println(set);

        return set;
    }
}
