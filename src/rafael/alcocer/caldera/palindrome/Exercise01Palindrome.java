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

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Several ways to check if a String is a Palindrome.
 */
public class Exercise01Palindrome {

    private static final String S1 = "abcdf";
    private static final String S2 = "reconocer";

    public static void main(String[] args) {
        Exercise01Palindrome x = new Exercise01Palindrome();

        System.out.println(x.isPalindromeWithStringBuilder(S1));

        System.out.println("-------------------------------");

        System.out.println(x.isPalindromeWithStringBuilder(S2));

        System.out.println("-------------------------------");

        System.out.println(x.isPalindromeWithDeque(S1));

        System.out.println("-------------------------------");

        System.out.println(x.isPalindromeWithDeque(S2));

        System.out.println("-------------------------------");

        System.out.println(x.isPalindromeWithCollectionsReverse(S1));

        System.out.println("-------------------------------");

        System.out.println(x.isPalindromeWithCollectionsReverse(S2));

        System.out.println("-------------------------------");

        System.out.println(x.isPalindromeWithCollectionsReverse2(S1));

        System.out.println("-------------------------------");

        System.out.println(x.isPalindromeWithCollectionsReverse2(S2));
    }

    public boolean isPalindromeWithStringBuilder(String s) {
        System.out.println("Palindrome With StringBuilder:");
        System.out.println("Input String: " + s);

        StringBuilder builder = new StringBuilder(s);
        String reversed = builder.reverse().toString();

        System.out.println("Reversed String: " + reversed);

        if (s.equals(reversed)) {
            return true;
        }

        return false;
    }

    public boolean isPalindromeWithDeque(String s) {
        System.out.println("Palindrome With Deque:");
        System.out.println("Input String: " + s);

        Deque<Character> deque = new ArrayDeque<>();

        s.chars().mapToObj(c -> (char) c)
            .forEach(c -> deque.push(c));

        String reversed = deque.stream()
                .map(c -> deque.pop().toString())
                .collect(Collectors.joining());

        System.out.println("Reversed String: " + reversed);

        if (s.equals(reversed)) {
            return true;
        }

        return false;
    }

    public boolean isPalindromeWithCollectionsReverse(String s) {
        System.out.println("Palindrome With Collections reverse:");
        System.out.println("Input String: " + s);

        List<Character> list = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        // Because is a Character list the order of the letters is reversed
        Collections.reverse(list);

        String reversed = list.stream(
                ).map(Object::toString)
                .collect(Collectors.joining());

        System.out.println("Reversed String: " + reversed);

        if (s.equals(reversed)) {
            return true;
        }

        return false;
    }

    public boolean isPalindromeWithCollectionsReverse2(String s) {
        System.out.println("Palindrome With Collections reverse 2:");
        System.out.println("Input String: " + s);

        String reversed = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList()).stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), lst -> {
                    Collections.reverse(lst);
                    return lst.stream();
                }))
                .map(c -> c.toString())
                .collect(Collectors.joining());

        System.out.println("Reversed String: " + reversed);

        if (s.equals(reversed)) {
            return true;
        }

        return false;
    }
}
