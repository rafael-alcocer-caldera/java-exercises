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
package rafael.alcocer.caldera.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * This exercise only shows what exactly the lambda expression is creating.
 */
public class Exercise22Stream {

    public static void main(String[] args) {
        Exercise22Stream x = new Exercise22Stream();
        x.go1();
        System.out.println("------");
        x.go2();
        System.out.println("------");
    }

    /**
     * The following is an implementer of the interface, this is an inner class 
     * to define an instance of a class that implements this interface:
     * ------------------------------------------------------------------------
     * Predicate<Integer> p = new Predicate<Integer>() {
     * 
     *     @Override 
     *     public boolean test(Integer i) { if (i >= 8) {
     *         System.out.println(i);
     * 
     *         return true; 
     *     }
     * 
     *         return false; 
     *     } 
     * };
     * 
     * The above can be improved and see more concise if we use Lambda Expression:
     * ---------------------------------------------------------------------------
     * Predicate<Integer> p = (Integer i) -> { 
     *     if (i >= 8) { 
     *         return true; 
     *     }
     * 
     *     return false; 
     * };
     * 
     * And even more concise:
     * ----------------------
     * Predicate<Integer> p = i -> i >= 8;
     */
    public void go1() {
        Integer[] array = { 1, 5, 8, 10 };
        // Stream<Integer> s = Arrays.stream(array);
        Stream<Integer> s = Stream.of(array);

        Predicate<Integer> p = i -> i >= 8;

        s.filter(p).forEach(System.out::println);
    }

    /**
     * The following is an implementer of the interface, this is an inner class 
     * to define an instance of a class that implements this interface:
     * ------------------------------------------------------------------------
     * Predicate<Entry<String, Integer>> p = new Predicate<Map.Entry<String,Integer>>() {
     * 
     *     @Override 
     *     public boolean test(Entry<String, Integer> t) { 
     *         if (t.getKey().equals("FIVE")) { 
     *             return true; 
     *         }
     * 
     *         return false; 
     *     } 
     * };
     * 
     * The above can be improved and see more concise if we use Lambda Expression:
     * ---------------------------------------------------------------------------
     * Predicate<Entry<String, Integer>> p = (Entry<String, Integer> entry) -> enytry.getKey().equals("FIVE");
     * 
     * And even more concise:
     * ----------------------
     * Predicate<Entry<String, Integer>> p = entry -> entry.getKey().equals("FIVE");
     */
    public void go2() {
        Map<String, Integer> map = new HashMap<>();
        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("FIVE", 5);

        Set<Entry<String, Integer>> set = map.entrySet();

        Stream<Entry<String, Integer>> s = set.stream();

        // Predicate<Entry<String, Integer>> p = (Entry<String, Integer> entry) ->
        // entry.getKey().equals("FIVE");
        Predicate<Entry<String, Integer>> p = entry -> entry.getKey().equals("FIVE");

        s.filter(p).forEach(System.out::println);
    }
}
