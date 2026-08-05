package rafael.alcocer.caldera.top.interview.questions.array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given an array of integers, find the longest continuous sublist of even
 * numbers.
 *
 * If there are multiple lists of the same length, return the first one.
 *
 * Example Input: Input: arr[] = {3, 4, 11, 2, 9, 21} Output: 2
 *
 *
 * Explanation: The longest subsequence containing even numbers is {4, 2}.
 *
 * Hence, the answer is 2.
 *
 * This text is not well explained because "The longest subsequence" but it
 * could be "contiguous sublist".
 */
public class LongestEvenNumber {

    private static final int ARR[] = { 3, 4, 11, 2, 9, 21 };

    public static void main(String[] args) {
        LongestEvenNumber x = new LongestEvenNumber();
        System.out.println(x.longestContinuousSublist(ARR));
        x.longestSubsequence1(ARR);
        System.out.println(x.longestSubsequence2(ARR));
        System.out.println(x.longestSubsequence3(ARR));
    }

    public int longestContinuousSublist(int arr[]) {
        int maxGlobal = 0;
        int maxCurrent = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                maxCurrent++;

                if (maxCurrent > maxGlobal) {
                    maxGlobal = maxCurrent;
                }
            } else {
                maxCurrent = 0;
            }
        }

        return maxGlobal;
    }

    public void longestSubsequence1(int arr[]) {
        Map<Boolean, List<Integer>> map = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.partitioningBy(a -> a % 2 == 0));
        System.out.println(map);
        List<Integer> list = map.get(true);
        System.out.println(list);
    }

    public int longestSubsequence2(int arr[]) {
        return Arrays.stream(arr)
                .boxed()
                .collect(Collectors.partitioningBy(a -> a % 2 == 0))
                .get(true)
                .size();
    }

    public long longestSubsequence3(int arr[]) {
        return Arrays.stream(arr)
                .filter(a -> a % 2 == 0)
                .count();
    }
}
