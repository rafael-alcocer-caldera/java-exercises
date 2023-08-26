/**
 * Copyright [2023] [RAFAEL ALCOCER CALDERA]
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
package rafael.alcocer.caldera.top.interview.questions.array;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Merge overlaping intervals:
 * 
 * Example 1:
 * 
 * Input: { {1,3}, {2,6}, {8,10}, {15,18} }
 * 
 * Output: { {1,6}, {8,10}, {15,18} }
 * 
 * Example 2:
 * 
 * Input: { {1,3}, {4,10}, {6,12}, {11,18} }
 * 
 * Output: { {1,3}, {4,18} }
 * 
 * Example 3:
 * 
 * Input: { { 1, 4 }, { 4, 5 } }
 * 
 * Output: { { 1, 5 }}
 * 
 * Example 4:
 * 
 * Input: { { 1, 4 }, { 0, 1 } }
 * 
 * Output: { { 0, 4 } }
 * 
 * Exanple 5:
 * 
 * Input: { { 1, 4 }, { 2, 3 } }
 * 
 * Output: { { 1, 4 } }
 * 
 * Example 6:
 * 
 * Input: { {2,3}, {4,5}, {6,7}, {8,9}, {1,10} }
 * 
 * Output: { {1,10} }
 *
 */
public class MergeArrays {

    private static final int[][] INPUT1 = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
    private static final int[][] INPUT2 = { { 1, 3 }, { 4, 10 }, { 6, 12 }, { 11, 18 } };
    private static final int[][] INPUT3 = { { 1, 4 }, { 4, 5 } };
    private static final int[][] INPUT4 = { { 1, 4 }, { 0, 1 } };
    private static final int[][] INPUT5 = { { 1, 4 }, { 2, 3 } };
    private static final int[][] INPUT6 = { { 2, 3 }, { 4, 5 }, { 6, 7 }, { 8, 9 }, { 1, 10 } };

    public static void main(String[] args) {
        MergeArrays t = new MergeArrays();
        t.merge(INPUT1);
        System.out.println("#################################");
        t.merge(INPUT2);
        System.out.println("#################################");
        t.merge(INPUT3);
        System.out.println("#################################");
        t.merge(INPUT4);
        System.out.println("#################################");
        t.merge(INPUT5);
        System.out.println("#################################");
        // t.merge(INPUT6);
        t.merge2(t.merge(INPUT6));
    }

    public int[][] merge(int[][] input) {
        System.out.println("##### merge()...");
        Set<int[]> set = new LinkedHashSet<>();
        int[] temp = new int[2];

        for (int i = 0; i < input.length; i++) {
            System.out.println("-----------------------------");
            System.out.println("##### i: " + i);

            int[] array1 = input[i];

            if (i + 1 == input.length) {
                set.add(array1);
                break;
            }

            int[] array2 = input[i + 1];

            System.out.println("-----------------------------");
            System.out.println("##### array1: " + array1);
            System.out.println("##### array1[0]: " + array1[0]);
            System.out.println("##### array1[1]: " + array1[1]);

            System.out.println("##### array2: " + array2);
            System.out.println("##### array2[0]: " + array2[0]);
            System.out.println("##### array2[1]: " + array2[1]);

            System.out.println("##### if: " + ((array1[0] >= array2[0] && array1[0] <= array2[1])
                    || (array1[1] >= array2[0] && array1[1] <= array2[1])));
            if ((array1[0] >= array2[0] && array1[0] <= array2[1])
                    || (array1[1] >= array2[0] && array1[1] <= array2[1])) {
                //
            } else if ((array2[0] >= array1[0] && array2[0] <= array1[1])
                    || (array2[1] >= array1[0] && array2[1] <= array1[1])) {
                //
            } else {
                set.add(array1);
                System.out.println("##### array1 added to list...");
                continue;
            }

            System.out.println("##### if 1: " + (array1[0] >= array2[0] && array1[0] <= array2[1]));
            if (array1[0] >= array2[0] && array1[0] <= array2[1]) {
                if (array1[0] >= array2[0]) {
                    temp[0] = array2[0];
                } else {
                    temp[0] = array1[0];
                }
            }

            System.out.println("##### if 1a: " + (array2[0] >= array1[0] && array2[0] <= array1[1]));
            if (array2[0] >= array1[0] && array2[0] <= array1[1]) {
                if (array2[0] >= array1[0]) {
                    temp[0] = array1[0];
                } else {
                    temp[0] = array2[0];
                }
            }

            System.out.println("##### if 2: " + (array1[1] >= array2[0] && array1[1] <= array2[1]));
            if (array1[1] >= array2[0] && array1[1] <= array2[1]) {
                if (array1[0] >= array2[0]) {
                    temp[0] = array2[0];
                } else {
                    temp[0] = array1[0];
                }

                if (array1[1] >= array2[0]) {
                    temp[1] = array2[1];
                } else {
                    temp[1] = array1[1];
                }
            } else {
                // temp[1] = array1[1];
            }

            System.out.println("##### if 2a: " + (array2[1] >= array1[0] && array2[1] <= array1[1]));
            if (array2[1] >= array1[0] && array2[1] <= array1[1]) {
                if (array2[0] >= array1[0]) {
                    temp[0] = array1[0];
                } else {
                    temp[0] = array2[0];
                }

                if (array2[1] >= array1[0]) {
                    temp[1] = array1[1];
                } else {
                    temp[1] = array2[1];
                }
            }

            System.out.println("##### temp: " + temp);
            System.out.println("##### temp[0]: " + temp[0]);
            System.out.println("##### temp[1]: " + temp[1]);
            System.out.println("##### MERGED temp array added to list...");
            set.add(temp);

            System.out.println("##### input[i + 1] = temp...");
            input[i + 1] = temp;
        }

        System.out.println("##### set.size(): " + set.size());
        set.stream().forEach(a -> {
            System.out.println("##### a[0]: " + a[0]);
            System.out.println("##### a[1]: " + a[1]);
        });

        int[][] result = new int[set.size()][];

        Iterator<int[]> it = set.iterator();
        int i = 0;

        while (it.hasNext()) {
            result[i] = it.next();
            i++;
        }

        System.out.println("##### result.length: " + result.length);
        for (int j = 0; j < result.length; j++) {
            int[] array = result[j];
            System.out.println("##### array[0]: " + array[0]);
            System.out.println("##### array[1]: " + array[1]);
        }

        return result;
    }

    public int[][] merge2(int[][] input) {
        System.out.println("##### merge2()...");
        Set<int[]> set = new LinkedHashSet<>();
        int[] temp = new int[2];
        int x = (input.length - 1);
        System.out.println("##### x: " + x);

        for (int j = x; j >= 0; j--) {
            System.out.println("-----------------------------");
            System.out.println("##### j: " + j);

            int[] array1 = input[j];

            if (j == 0) {
                set.add(array1);
                break;
            }

            int[] array2 = input[j - 1];

            System.out.println("-----------------------------");
            System.out.println("##### array1: " + array1);
            System.out.println("##### array1[0]: " + array1[0]);
            System.out.println("##### array1[1]: " + array1[1]);

            System.out.println("##### array2: " + array2);
            System.out.println("##### array2[0]: " + array2[0]);
            System.out.println("##### array2[1]: " + array2[1]);

            System.out.println("##### if: " + ((array1[0] >= array2[0] && array1[0] <= array2[1])
                    || (array1[1] >= array2[0] && array1[1] <= array2[1])));
            if ((array1[0] >= array2[0] && array1[0] <= array2[1])
                    || (array1[1] >= array2[0] && array1[1] <= array2[1])) {
                //
            } else if ((array2[0] >= array1[0] && array2[0] <= array1[1])
                    || (array2[1] >= array1[0] && array2[1] <= array1[1])) {
                //
            } else {
                set.add(array1);
                System.out.println("##### array1 added to list...");
                continue;
            }

            System.out.println("##### if 1: " + (array1[0] >= array2[0] && array1[0] <= array2[1]));
            if (array1[0] >= array2[0] && array1[0] <= array2[1]) {
                if (array1[0] >= array2[0]) {
                    temp[0] = array2[0];
                } else {
                    temp[0] = array1[0];
                }
            }

            System.out.println("##### if 1a: " + (array2[0] >= array1[0] && array2[0] <= array1[1]));
            if (array2[0] >= array1[0] && array2[0] <= array1[1]) {
                if (array2[0] >= array1[0]) {
                    temp[0] = array1[0];
                } else {
                    temp[0] = array2[0];
                }
            }

            System.out.println("##### if 2: " + (array1[1] >= array2[0] && array1[1] <= array2[1]));
            if (array1[1] >= array2[0] && array1[1] <= array2[1]) {
                if (array1[0] >= array2[0]) {
                    temp[0] = array2[0];
                } else {
                    temp[0] = array1[0];
                }

                if (array1[1] >= array2[0]) {
                    temp[1] = array2[1];
                } else {
                    temp[1] = array1[1];
                }
            } else {
                // temp[1] = array1[1];
            }

            System.out.println("##### if 2a: " + (array2[1] >= array1[0] && array2[1] <= array1[1]));
            if (array2[1] >= array1[0] && array2[1] <= array1[1]) {
                if (array2[0] >= array1[0]) {
                    temp[0] = array1[0];
                } else {
                    temp[0] = array2[0];
                }

                if (array2[1] >= array1[0]) {
                    temp[1] = array1[1];
                } else {
                    temp[1] = array2[1];
                }
            }

            System.out.println("##### temp: " + temp);
            System.out.println("##### temp[0]: " + temp[0]);
            System.out.println("##### temp[1]: " + temp[1]);
            System.out.println("##### MERGED temp array added to list...");
            set.add(temp);

            System.out.println("##### input[j - 1] = temp...");
            input[j - 1] = temp;
        }

        System.out.println("##### set.size(): " + set.size());
        set.stream().forEach(a -> {
            System.out.println("##### a[0]: " + a[0]);
            System.out.println("##### a[1]: " + a[1]);
        });

        int[][] result = new int[set.size()][];

        Iterator<int[]> it = set.iterator();
        int i = 0;

        while (it.hasNext()) {
            result[i] = it.next();
            i++;
        }

        System.out.println("##### result.length: " + result.length);
        for (int j = 0; j < result.length; j++) {
            int[] array = result[j];
            System.out.println("##### array[0]: " + array[0]);
            System.out.println("##### array[1]: " + array[1]);
        }

        return result;
    }
}
