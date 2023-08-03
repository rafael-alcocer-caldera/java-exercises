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

import java.util.Arrays;

/**
 * This is an example of an implementation of the Java classes Stack and Deque
 * (ArrayDeque) with the push and pop methods.
 * 
 * They use LIFO Last in First Out.
 * 
 * So, when we add elements, the last element added is the first in the stack.
 * 
 * Example: 20 15 10
 * 
 * push(25);
 * 
 * The resultant stack will be: 25 20 15 10
 */
public class MyStack {

    private Object[] stack;

    public MyStack() {
        stack = new Object[1];
    }

    public MyStack(Object data) {
        stack = new Object[1];
        stack[0] = data;
    }

    public MyStack(int capacity) {
        if (capacity > 0) {
            stack = new Object[capacity];
        } else {
            stack = new Object[1];
        }
    }

    public Object[] push(Object data) {
        Object[] copiedArray = Arrays.copyOf(getStack(), getStack().length + 1);
        copiedArray[0] = data;
        int index = 0;

        for (int i = 0; i < copiedArray.length - 1; i++) {
            copiedArray[++index] = getStack()[i];
        }

        setStack(copiedArray);

        return getStack();
    }

    public void pop() {
        Object[] array = getStack();

        for (int i = 0; i < array.length; i++) {
            System.out.println("##### array[" + i + "]: " + array[i]);
        }
    }

    public Object[] getStack() {
        return stack;
    }

    public void setStack(Object[] stack) {
        this.stack = stack;
    }
}
