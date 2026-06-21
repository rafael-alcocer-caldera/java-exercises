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
package rafael.alcocer.caldera.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
    Given a string s and an integer k, return the consecutive characters that are
    the same in s, but only if they are repeated k times. If there are no
    characters that are repeated k times, return an empty string.
 */
public class StringTests {

    private static final String STRING_VALUE = "abhydaaajjfppppprtsss";

    public static void main(String[] args) {
        StringTests test = new StringTests();
        System.out.println("###################");
        System.out.println("USING STREAMS");
        System.out.println("###################");
        test.usingStreams(STRING_VALUE, 3);

        System.out.println("###################");
        System.out.println("USING LIST");
        System.out.println("###################");
        test.usingList(STRING_VALUE, 3);

        System.out.println("###################");
        System.out.println("USING StringBuilder");
        System.out.println("###################");
        test.usingStringBuilder(STRING_VALUE, 3);
    }

    public void usingStreams(String s, int length) {
        String result = Pattern.compile("(?<=(.))(?!\\1)")
                .splitAsStream(s)
                .filter(block -> block.length() >= length)
                .collect(Collectors.joining());

        System.out.println(result);
    }

    /**
     * Not the best approach...
     *
     * @param s
     * @param length
     */
    public void usingList(String s, int length) {
        char currentChar = s.charAt(0);
        List<String> list = new ArrayList<>();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                count++;
            } else {
                list.add(currentChar + ":" + count);
                currentChar = s.charAt(i);
                count = 1;
            }
        }

        list.add(currentChar + ":" + count);
        System.out.println(list);

        List<String> result = new ArrayList<>();

        for (String item : list) {
            String[] split = item.split(":");

            if (Integer.parseInt(split[1]) >= length) {
                for (int i = 0; i < Integer.parseInt(split[1]); i++) {
                    result.add(split[0]);
                }
            }
        }

        System.out.println(result);
        
        String x = result.stream().reduce("", (a, b) -> a + b);
        System.out.println(x);
    }

    /**
     * This is the best approach...
     * From Java 11
     *
     * @param s
     * @param length
     */
    public void usingStringBuilder(String s, int length) {
        StringBuilder builder = new StringBuilder();
        char currentChar = s.charAt(0);
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                count++;
            } else {
                if (count >= length) {
                    builder.append(String.valueOf(currentChar).repeat(count));
                }

                count = 1;
                currentChar = s.charAt(i);
            }
        }

        if (count >= length) {
            builder.append(String.valueOf(currentChar).repeat(count));
        }

        System.out.println(builder);
    }
}
