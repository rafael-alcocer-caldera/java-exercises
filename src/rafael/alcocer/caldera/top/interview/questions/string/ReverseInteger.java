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

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If
 * reversing x causes the value to go outside the signed 32-bit integer range
 * [-2^31, 2^31 - 1], then return 0.
 * 
 * Assume the environment does not allow you to store 64-bit integers (signed or
 * unsigned).
 * 
 * Example 1:
 * 
 * Input: x = 123
 * 
 * Output: 321
 * 
 * ---------------------
 * 
 * Example 2:
 * 
 * Input: x = -123
 * 
 * Output: -321
 * 
 * ---------------------
 * 
 * Example 3:
 * 
 * Input: x = 120
 * 
 * Output: 21
 * 
 * ---------------------
 * 
 * Constraints:
 * 
 * -2^31 <= x <= 2^31 - 1
 * 
 * ---------------------
 * 
 * Java Primitive Type: int
 * 
 * Description: signed 32 bits
 * 
 * Java Data Range: -2147483648 to 2147483647
 * 
 * Integer.MAX_VALUE = 2147483647
 * 
 * Integer.MIN_VALUE = -2147483648
 * 
 */
public class ReverseInteger {

    private static final int X = -123;

    public static void main(String[] args) {
        ReverseInteger x = new ReverseInteger();

        System.out.println("INPUT: " + X);
        System.out.println("OUTPUT: " + x.reverse(X));

        System.out.println("");

        System.out.println("INPUT: " + Integer.MAX_VALUE);
        System.out.println("OUTPUT: " + x.reverse(Integer.MAX_VALUE));
    }

    public int reverse(int x) {
        try {
            if (x < 0) {
                return Math.negateExact(
                        Integer.parseInt(new StringBuilder(String.valueOf(Math.abs(x)))
                                .reverse()
                                .toString()));
            }

            return Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());
        } catch (NumberFormatException ex) {
            return 0;
        }
    }
}
