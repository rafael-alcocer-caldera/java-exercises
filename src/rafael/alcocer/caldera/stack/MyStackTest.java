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
package rafael.alcocer.caldera.stack;

public class MyStackTest {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        Object[] array = stack.getStack();
        array[0] = "One";

        stack.pop();

        System.out.println("-----------------------------------------------------");

        array = stack.push(2);
        System.out.println("##### array.length: " + array.length);

        stack.pop();

        System.out.println("-----------------------------------------------------");

        array = stack.push(3);
        System.out.println("##### array.length: " + array.length);

        stack.pop();

        System.out.println("-----------------------------------------------------");

        array = stack.push(4);
        System.out.println("##### array.length: " + array.length);

        stack.pop();

        System.out.println("-----------------------------------------------------");
    }
}
