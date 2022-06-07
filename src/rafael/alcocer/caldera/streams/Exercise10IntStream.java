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

import java.util.stream.IntStream;

/**
 * Print the int numbers from 1 to 9 and from 1 to 10.
 */
public class Exercise10IntStream {

    public static void main(String[] args) {
        Exercise10IntStream x = new Exercise10IntStream();
        x.go();
    }

    /**
     * range(1, 10) => 1-9
     * rangeClosed(1, 10) => 1-10
     */
    public void go() {
        IntStream.range(1, 10)
            .forEach(System.out::println);
        
        System.out.println("-----------");
        
        IntStream.rangeClosed(1, 10)
        .forEach(System.out::println);
    }
}
