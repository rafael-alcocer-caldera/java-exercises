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
 * Sum numbers from 1 to 4.
 * 
 * OUTPUT: 10
 */
public class Exercise12IntStream {

	public static void main(String[] args) {
		Exercise12IntStream x = new Exercise12IntStream();
		x.go();
	}

	/**
	 * Sum numbers from 1 to 4.
	 * 
	 * 1 + 2 + 3 + 4
	 * 
	 * Result: 10
	 */
	public void go() {
		System.out.println(IntStream.range(1, 5).sum());
		
		System.out.println(IntStream.rangeClosed(1, 4).sum());
	}
}
