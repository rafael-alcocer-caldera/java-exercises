/**
 * Copyright [2026] [RAFAEL ALCOCER CALDERA]
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * This exercise was copied from:
 *
 * https://leetcode.com/problems/group-anagrams/description/
 *
 * Given an array of strings strs, group the anagrams together.
 * You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 *
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 *
 * Solution:
 *
 * Let's do a thought experiment with two words from the example: "eat" and "tea".
 *
 * The Stream processes "eat" and generates this frequency map: Map 1 -> {a=1, t=1, e=1}
 *
 * The Stream processes "tea" and generates this frequency map: Map 2 -> {a=1, t=1, e=1}
 *
 * (The internal order may vary, but the content is identical).
 *
 * When Java evaluates these two maps behind the scenes, this happens:
 *
 * map1.equals(map2); // The result is TRUE
 *
 * map1.hashCode() == map2.hashCode(); // The result is TRUE
 *
 * When the code executes the Stream with your array ["eat", "tea", "tan", "ate", "nat", "bat"],
 *
 * this is what happens in the program's memory:
 *
 * "eat" arrives: Generates the key {a=1, t=1, e=1}.
 *
 * Since that key doesn't exist in grouped,
 *
 * Java creates a new list and inserts the word into the current original grouped list:
 *
 * {{a=1, t=1, e=1} = [eat]}.
 *
 * "tea" arrives: Generates the key {a=1, t=1, e=1}.
 *
 * Java asks: Does this key already exist in my grouped map?
 *
 * Using the hashCode and it's equal, Java says: "Yes, it already exists!"
 *
 * So it takes the list of that key and adds "tea".
 *
 * current grouped: {{a=1, t=1, e=1} = [eat, tea]}
 *
 * Arrives "tan": Generates the key {a=1, t=1, n=1}.
 *
 * Java checks and sees that this key does not exist (because it has an 'n' instead of an 'e').
 *
 * Creates a new group. current grouped:
 *
 * {{a=1, t=1, e=1} = [eat, tea], {a=1, t=1, n=1} = [tan]}
 *
 * Arrives "ate": Generates the key {a=1, t=1, e=1}.
 *
 * Java detects that it already exists and adds it to the first grouped current:
 *
 * {{a=1, t=1, e=1} = [eat, tea, ate], {a=1, t=1, n=1} = [tan]}
 *
 * And so on with all the words.
 *
 * Summary:
 *
 * We use the frequency map as a key because it acts as the "fingerprints" of the word.
 *
 * The order of the letters in the original word doesn't matter;
 *
 * if they have the same letters in the same quantities, their fingerprints (maps) will be identical.
 *
 * By using that map as a key, Java automatically groups the values that share the same fingerprint.
 */
public class Exercie05AnagramGrouping {

    private static final String[] strs = {"eat","tea","tan","ate","nat","bat"};

    public static void main(String[] args) {
        Exercie05AnagramGrouping x = new Exercie05AnagramGrouping();
        System.out.println(x.groupAnagrams(strs));
    }

    public Map<Character, Long> groupChars(String s) {
        return s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Long>, List<String>> map =
                Arrays.stream(strs)
                        .collect(Collectors.groupingBy(this::groupChars, Collectors.toList()));

        return new ArrayList<>(map.values());
    }
}
