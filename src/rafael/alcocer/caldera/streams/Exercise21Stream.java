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

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * From a list of doubles get the average from those that are greater than 100.
 */
public class Exercise21Stream {

    public static void main(String[] args) {
        Exercise21Stream x = new Exercise21Stream();
        x.go();
    }
    
    public void go() {
        List<Double> list = Arrays.asList(100.50, 200.45, 300.90, 37.56);
        
        Double x = list.stream()
        	.filter(d -> d > 100)
        	.collect(Collectors.averagingDouble(d -> d));
        
        System.out.println(x);
    }
}
