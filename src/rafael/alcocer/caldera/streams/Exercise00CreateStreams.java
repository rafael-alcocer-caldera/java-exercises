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

// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Exercise00CreateStreams {

    public static void main(String[] args) {
        Exercise00CreateStreams x = new Exercise00CreateStreams();

        System.out.println("Creates a Stream from Collection:");
        System.out.println("---------------------------------");
        x.createStreamFromCollection();

        System.out.println("Creates a Stream from Array:");
        System.out.println("---------------------------------");
        x.createStreamFromArray();

        System.out.println("Creates an IntStream from Array:");
        System.out.println("---------------------------------");
        x.createIntStreamFromArray();

        System.out.println("Creates an LongStream from Array:");
        System.out.println("---------------------------------");
        x.createLongStreamFromArray();

        System.out.println("Creates an DoubleStream from Array:");
        System.out.println("---------------------------------");
        x.createDoubleStreamFromArray();

        // x.createStreamFromFiles();

        System.out.println("Creates a Stream from Stream:");
        System.out.println("---------------------------------");
        x.createStreamFromStream();

        System.out.println("Creates a Stream from IntStream:");
        System.out.println("---------------------------------");
        x.createStreamFromIntStream();

        System.out.println("Creates a Stream from LongStream:");
        System.out.println("---------------------------------");
        x.createStreamFromLongStream();

        System.out.println("Creates a Stream from DoubleStream:");
        System.out.println("---------------------------------");
        x.createStreamFromDoubleStream();

        System.out.println("Creates a Stream from a Set:");
        System.out.println("---------------------------------");
        x.createStreamFromSet();

        System.out.println("Creates a Stream from a HashMap:");
        System.out.println("---------------------------------");
        x.createStreamFromHashMap();

        System.out.println("Creates a Stream from an Integer:");
        System.out.println("---------------------------------");
        x.createStreamFromInteger();

        System.out.println("Creates a Stream from a String:");
        System.out.println("---------------------------------");
        x.createStreamFromString();
    }

    /**
     * Creates a Stream from Collection.
     */
    public void createStreamFromCollection() {
        List<String> list = Arrays.asList("UNO", "DOS", "TRES");

        Stream<String> stream = list.stream();

        stream.forEach(System.out::println);
    }

    /**
     * Creates a Stream from Array.
     */
    public void createStreamFromArray() {
        String[] array = { "CUATRO", "CINCO", "SEIS" };

        Stream<String> stream = Arrays.stream(array);

        stream.forEach(System.out::println);
    }

    /**
     * Creates an IntStream from Array.
     */
    public void createIntStreamFromArray() {
        int[] array = { 1, 2, 3 };

        IntStream intStream = Arrays.stream(array);

        intStream.forEach(System.out::println);
    }

    /**
     * Creates a LongStream from Array.
     */
    public void createLongStreamFromArray() {
        long[] array = { 4, 5, 6 };

        LongStream longStream = Arrays.stream(array);

        longStream.forEach(System.out::println);
    }

    /**
     * Creates a DoubleStream from Array.
     */
    public void createDoubleStreamFromArray() {
        double[] array = { 10.23, 14.78, 66.33 };

        DoubleStream doubleStream = Arrays.stream(array);

        doubleStream.forEach(System.out::println);
    }

    /**
     * Creates a Stream from Files.
     */
    /*
     * public void createStreamFromFiles() { try { Stream<String> stream =
     * Files.lines(Paths.get("C:\\test\\test.txt"));
     * 
     * stream.forEach(System.out::println); } catch (IOException e) {
     * e.printStackTrace(); } }
     */

    /**
     * Creates a Stream from Stream.
     */
    public void createStreamFromStream() {
        Stream<String> stream = Stream.of("ONE", "TWO", "THREE");
        stream.forEach(System.out::println);
    }

    /**
     * Creates a Stream from IntStream.
     */
    public void createStreamFromIntStream() {
        IntStream intStream = IntStream.of(10, 11, 12);
        intStream.forEach(System.out::println);
    }

    /**
     * Creates a Stream from LongStream.
     */
    public void createStreamFromLongStream() {
        LongStream longStream = LongStream.of(1000000, 110000000, 1200000);
        longStream.forEach(System.out::println);
    }

    /**
     * Creates a Stream from DoubleStream.
     */
    public void createStreamFromDoubleStream() {
        DoubleStream doubleStream = DoubleStream.of(232.44, 12321.86, .3353);
        doubleStream.forEach(System.out::println);
    }

    /**
     * Creates a Stream from a Set.
     */
    public void createStreamFromSet() {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);

        Stream<Integer> stream = set.stream();
        stream.forEach(System.out::println);
    }

    /**
     * Creates a Stream from a HashMap.
     */
    public void createStreamFromHashMap() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("UNO", 1);
        map.put("DOS", 2);
        map.put("TRES", 3);

        Set<Entry<String, Integer>> entrySet = map.entrySet();

        Stream<Entry<String, Integer>> stream = entrySet.stream();
        stream.forEach(System.out::println);
    }

    /**
     * Creates a Stream from an Integer.
     */
    public void createStreamFromInteger() {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        stream.forEach(System.out::println);
    }

    /**
     * Creates a Stream from a String.
     */
    public void createStreamFromString() {
        Stream<String> stream = Stream.of("HOLA");
        stream.forEach(System.out::println);
    }
}
