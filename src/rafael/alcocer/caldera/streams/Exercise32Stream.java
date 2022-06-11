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

import java.util.stream.Stream;

/**
 * PROBLEM: Sum the numbers using reduce.
 *
 * INPUT:
 * 
 * 7.3, 5.2, 8.8
 * 
 * OUTPUT:
 * 
 * 21.3
 */
public class Exercise32Stream {

	public static void main(String[] args) {
		Exercise32Stream x = new Exercise32Stream();
		x.go();
	}

	public void go() {
		double d = Stream.of(7.3, 5.2, 8.8)
				.reduce(0.0, (o1, o2) -> o1 + o2)
				.doubleValue();

		System.out.println(d);
	}
}
