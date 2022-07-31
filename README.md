# JAVA EXERCISES

## Synopsis

Java Programs from Coding Interviews.

## Motivation

I wanted to have a series of exercises that are asked in interviews.

## PRE REQUIERMENTS

- Java SE Development Kit 8 

## EXERCISES
- Exercise01AnagramImperativeProgramming
    - Check if 2 strings are anagrams using the Imperative Programming way. Space characters are not considered.
    - Example: 	S1 = "deudora", S2 = "eduardo", S3 = "funeral", S4 = "real      fun"
    
***

- Exercise02AnagramDeclarativeAndImperativeProgramming
    - Check if 2 strings are anagrams using the Declarative and Imperative Programming way. Space characters are not considered.
    - Example: 	S1 = "deudora", S2 = "eduardo", S3 = "funeral", S4 = "real      fun"
    
***

- Exercise03AnagramDeclarativeProgramming
    - Check if 2 strings are anagrams using the Declarative Programming way. Space characters are not considered.
    - Example: 	S1 = "deudora", S2 = "eduardo", S3 = "funeral", S4 = "real      fun"
    
***

- Exercise04AnagramImperativeProgramming
    - Write a function that takes in an array of strings as its argument and then print all the anagrams found in the array. 
       - INPUT: 
           - {"eat", "tea", "funeral", "raza", "frog", "elvis", "real&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;fun", "lives", "deudora", "dog", "ate", "eduardo", "zara"}
       - OUTPUT: 
           - [tea, ate, raza, lives, deudora, funeral, eat, real&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;fun, eduardo, elvis, zara]
    
***

- MyStackTest
    - Create a Custom Stack that works like Stack and Deque (ArrayDeque) classes with the push and pop methods.

***

- Exercise00CreateStreams
    - Several ways to create a Stream.
    
***

- Exercise01ArraysStream
    - From an array of strings, print only the strings that start with 'S' in ascending order uppercased.
       - INPUT: 
           - { "Steve", "Svetlana", "sara", "John", "paul" }
       - OUTPUT: 
           - SARA STEVE SVETLANA
    
***

- Exercise02ArraysStream
    - Square each number in an array and print the average.
       - INPUT: 
           - { 2, 4, 6, 8, 10 }
       - OUTPUT: 
           - 44.0
    
***

- Exercise03ArraysStream
    -  The following exercise comes from:
       [Letter Count Test](https://www.codingame.com/playgrounds/20782/java-guild-meeting-52018/streams---practice)
    - Now, starting again from a list of names, give me the total number of letters in all the names with more than 5 letters.
        - INPUT: 
            - { "Steve", "Svetlana", "sara", "John", "paul", "Ramiro", "Amanda", "Courtney", "Hubert" }
        - OUTPUT: 
            - 34

***

- Exercise10IntStream
    - Print the int numbers from 1 to 9 and from 1 to 10.
    
***

- Exercise11IntStream
    - From an int range of numbers from 1 to 10, print from 6 to 10. This means to skip the first 5 numbers.
        - OUTPUT:
         - 6
         - 7
         - 8
         - 9
         - 10 
    
***

- Exercise12IntStream
    - Sum numbers from 1 to 4.
        - OUTPUT: 
            - 10

***

- Exercise13IntStream
    - Example of IntSummaryStatistics:
       - double average = summary.getAverage();
       - long count = summary.getCount();
       - int max = summary.getMax();
       - int min = summary.getMin();
       - long sum = summary.getSum();

***

- Exercise14IntStream
    - Get the minimum number from an array
       - INPUT: 
           - { 100, 50, 56, 22, 3, 66 }
       - OUTPUT: 
           - 3

***

- Exercise15IntStream
    - Find 3 distinct smallest numbers from an array.
       - INPUT: 
           - { 100, 50, 56, 22, 3, 66 }
       - OUTPUT: 
          - 3
          - 13
          - 22

***

- Exercise01Palindrome
    - Several ways to check if a String is a Palindrome.
       - INPUT String: 
           - "abcdf"
       - Reversed String: 
           - "fdcba"
       - OUTPUT: 
           - false
       <br />
       - Input String: 
           - "reconocer"
       - Reversed String: 
           - "reconocer"
       - OUTPUT: 
           - true

***

- Exercise02Palindrome
    - Find the longest palindrome within a string..
       - INPUT String: 
           - "abcdfhreconocerhyhduracer"
       - OUTPUT: 
           - hreconocerh

***

- Exercise02Palindrome
    - A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers. Given a string s, return true if it is a palindrome, or false otherwise.
      - Example 1:
        - Input: 
            - s = "A man, a plan, a canal: Panama"
        - Output: 
            - true
        -  Explanation: 
            - "amanaplanacanalpanama" is a palindrome.
      - Example 2:
        - Input: 
            - s = "race a car"
        - Output: 
            - false
        - Explanation: 
            - "raceacar" is not a palindrome.
      - Example 3:
        - Input: 
            - s = " "
        - Output: 
            - true
        - Explanation: 
            - s is an empty string "" after removing non-alphanumeric characters. Since an empty string reads the same forward and backward, it is a palindrome.

***

- Exercise20Stream
    - From a list of numbers count those that are greater than 20 after after applying the square to each number.
       - INPUT: 
           - 1, 2, 3, 4, 5, 6
       - OUTPUT: 
           - 2

***

- Exercise21Stream
    - From a list of doubles get the average from those that are greater than 100.
       - INPUT: 
           - 100.50, 200.45, 300.90, 37.56
       - OUTPUT: 
           - 200.61666666666665

***

- Exercise22Stream
    - This exercise only shows what exactly the lambda expression is creating.

***

- Exercise23Stream
    - From a list of names, find the first one sorted in ascending order.
       - INPUT: 
           - "Carl", "Ben", "Ana"
       - OUPUT: 
           - "Ana"

***

- Exercise24Stream
    - From a list of employees get the names of the top 3 with most higher salary.
       - INPUT:
         - Employee e1 = new Employee(1, "Emp1", 100, 50000.60, "active");
         - Employee e2 = new Employee(2, "Emp2", 100, 30500.75, "inactive");
         - Employee e3 = new Employee(3, "Emp3", 300, 45500.85, "inactive");
         - Employee e4 = new Employee(4, "Emp4", 300, 75500.30, "active");
         - Employee e5 = new Employee(5, "Emp5", 500, 88500.45, "active");
         - Employee e6 = new Employee(6, "Emp6", 100, 22690.33, "active");
       - OUTPUT:
         - Emp5
         - Emp4
         - Emp1

***

- Exercise25Stream
    -  Write a program to print employee details working in each department.
       - INPUT:
         - Employee e1 = new Employee(1, "Emp1", 100, 50000.60, "active");
         - Employee e2 = new Employee(2, "Emp2", 100, 30500.75, "inactive");
         - Employee e3 = new Employee(3, "Emp3", 300, 45500.85, "inactive");
         - Employee e4 = new Employee(4, "Emp4", 300, 75500.30, "active");
         - Employee e5 = new Employee(5, "Emp5", 500, 88500.45, "active");
         - Employee e6 = new Employee(6, "Emp6", 100, 22690.33, "active");
       - OUTPUT:
         - 500-[Employee:
         - Id: 5
         - Name: Emp5
         - Department Id: 500
         - Salary: 88500.45
         - Status: active
         - ]
         - 100-[Employee:
         - Id: 1
         - Name: Emp1
         - Department Id: 100
         - Salary: 50000.6
         - Status: active
         - , Employee:
         - Id: 2
         - Name: Emp2
         - Department Id: 100
         - Salary: 30500.75
         - Status: inactive
         - , Employee:
         - Id: 6
         - Name: Emp6
         - Department Id: 100
         - Salary: 22690.33
         - Status: active
         - ]
         - 300-[Employee:
         - Id: 3
         - Name: Emp3
         - Department Id: 300
         - Salary: 45500.85
         - Status: inactive
         - , Employee:
         - Id: 4
         - Name: Emp4
         - Department Id: 300
         - Salary: 75500.3
         - Status: active
         - ]

***

- Exercise26Stream
    -  Write a program to print employees count working in each department.
       - INPUT:
         - Employee e1 = new Employee(1, "Emp1", 100, 50000.60, "active");
         - Employee e2 = new Employee(2, "Emp2", 100, 30500.75, "inactive");
         - Employee e3 = new Employee(3, "Emp3", 300, 45500.85, "inactive");
         - Employee e4 = new Employee(4, "Emp4", 300, 75500.30, "active");
         - Employee e5 = new Employee(5, "Emp5", 500, 88500.45, "active");
         - Employee e6 = new Employee(6, "Emp6", 100, 22690.33, "active");
       - OUTPUT:
         - 500-----1
         - 100-----3
         - 300-----2
         - 
         - {500=1, 100=3, 300=2}
***

- Exercise27Stream
    - Write a program to print active and inactive employees in the given collection.
      - INPUT:
         - Employee e1 = new Employee(1, "Emp1", 100, 50000.60, "active");
         - Employee e2 = new Employee(2, "Emp2", 100, 30500.75, "inactive");
         - Employee e3 = new Employee(3, "Emp3", 300, 45500.85, "inactive");
         - Employee e4 = new Employee(4, "Emp4", 300, 75500.30, "active");
         - Employee e5 = new Employee(5, "Emp5", 500, 88500.45, "active");
         - Employee e6 = new Employee(6, "Emp6", 100, 22690.33, "active");
       - OUTPUT:
         - inactive-----[Employee:
         - Id: 2
         - Name: Emp2
         - Department Id: 100
         - Salary: 30500.75
         - Status: inactive
         - , Employee:
         - Id: 3
         - Name: Emp3
         - Department Id: 300
         - Salary: 45500.85
         - Status: inactive
         - ]
         - active-----[Employee:
         - Id: 1
         - Name: Emp1
         - Department Id: 100
         - Salary: 50000.6
         - Status: active
         - , Employee:
         - Id: 4
         - Name: Emp4
         - Department Id: 300
         - Salary: 75500.3
         - Status: active
         - , Employee:
         - Id: 5
         - Name: Emp5
         - Department Id: 500
         - Salary: 88500.45
         - Status: active
         - , Employee:
         - Id: 6
         - Name: Emp6
         - Department Id: 100
         - Salary: 22690.33
         - Status: active
         - ]
         - 
         - {inactive=[Employee:
         - Id: 2
         - Name: Emp2
         - Department Id: 100
         - Salary: 30500.75
         - Status: inactive
         - , Employee:
         - Id: 3
         - Name: Emp3
         - Department Id: 300
         - Salary: 45500.85
         - Status: inactive
         - ], active=[Employee:
         - Id: 1
         - Name: Emp1
         - Department Id: 100
         - Salary: 50000.6
         - Status: active
         - , Employee:
         - Id: 4
         - Name: Emp4
         - Department Id: 300
         - Salary: 75500.3
         - Status: active
         - , Employee:
         - Id: 5
         - Name: Emp5
         - Department Id: 500
         - Salary: 88500.45
         - Status: active
         - , Employee:
         - Id: 6
         - Name: Emp6
         - Department Id: 100
         - Salary: 22690.33
         - Status: active
         - ]}

*** 

- Exercise28Stream
    - Write a program to print Max/Min employee salary from the given collection.
      - INPUT:
         - Employee e1 = new Employee(1, "Emp1", 100, 50000.60, "active");
         - Employee e2 = new Employee(2, "Emp2", 100, 30500.75, "inactive");
         - Employee e3 = new Employee(3, "Emp3", 300, 45500.85, "inactive");
         - Employee e4 = new Employee(4, "Emp4", 300, 75500.30, "active");
         - Employee e5 = new Employee(5, "Emp5", 500, 88500.45, "active");
         - Employee e6 = new Employee(6, "Emp6", 100, 22690.33, "active");
       - OUTPUT:
         - ##### Max Employee Salary #####
         - Employee:
         - Id: 5
         - Name: Emp5
         - Department Id: 500
         - Salary: 88500.45
         - Status: active
         -
         - ##### Min Employee Salary #####
         - Employee:
         - Id: 6
         - Name: Emp6
         - Department Id: 100
         - Salary: 22690.33
         - Status: active

***     

- Exercise29Stream
    - Write a program to print the max salary of an employee from each department.
      - INPUT:
         - Employee e1 = new Employee(1, "Emp1", 100, 50000.60, "active");
         - Employee e2 = new Employee(2, "Emp2", 100, 30500.75, "inactive");
         - Employee e3 = new Employee(3, "Emp3", 300, 45500.85, "inactive");
         - Employee e4 = new Employee(4, "Emp4", 300, 75500.30, "active");
         - Employee e5 = new Employee(5, "Emp5", 500, 88500.45, "active");
         - Employee e6 = new Employee(6, "Emp6", 100, 22690.33, "active");
       - OUTPUT:
         - Employee:
         - Id: 5
         - Name: Emp5
         - Department Id: 500
         - Salary: 88500.45
         - Status: active
         - 
         - Employee:
         - Id: 1
         - Name: Emp1
         - Department Id: 100
         - Salary: 50000.6
         - Status: active
         - 
         - Employee:
         - Id: 4
         - Name: Emp4
         - Department Id: 300
         - Salary: 75500.3
         - Status: active
         - 
         -
         - {500=Optional[Employee:
         - Id: 5
         - Name: Emp5
         - Department Id: 500
         - Salary: 88500.45
         - Status: active
         - ], 100=Optional[Employee:
         - Id: 1
         - Name: Emp1
         - Department Id: 100
         - Salary: 50000.6
         - Status: active
         - ], 300=Optional[Employee:
         - Id: 4
         - Name: Emp4
         - Department Id: 300
         - Salary: 75500.3
         - Status: active
         - ]}        

***

- Exercise30Stream
    - Count the number of occurrences of words in an array..
      - INPUT:
        - { "six", "one", "two", "three", "one", "six", "five", "six", "one", "six" }
      - OUTPUT:
        - {six=4, one=3, five=1, three=1, two=1}
        
***

- Exercise31Stream
    - Count the number of occurrences of letters in a String.
      - INPUT:
        - "abcdekyrfadcelmaaafdghjkdsda"
      - OUTPUT:
        - {a=6, b=1, c=2, d=5, e=2, f=2, g=1, h=1, j=1, k=2, l=1, m=1, r=1, s=1, y=1}

***

- Exercise32Stream
    - Sum the numbers using reduce.
      - INPUT:
        - 7.3, 5.2, 8.8
      - OUTPUT:
        - 21.3
        
***

- Exercise33Stream
    - Write a program to print active and inactive employees in the given collection.
      - INPUT:
         - Employee e1 = new Employee(1, "Emp1", 100, 50000.60, "active");
         - Employee e2 = new Employee(2, "Emp2", 100, 30500.75, "inactive");
         - Employee e3 = new Employee(3, "Emp3", 300, 45500.85, "inactive");
         - Employee e4 = new Employee(4, "Emp4", 300, 75500.30, "active");
         - Employee e5 = new Employee(5, "Emp5", 500, 88500.45, "active");
         - Employee e6 = new Employee(6, "Emp6", 100, 22690.33, "active");
       - OUTPUT:
         - {false=[Employee:
         - Id: 2
         - Name: Emp2
         - Department Id: 100
         - Salary: 30500.75
         - Status: inactive
         - , Employee:
         - Id: 3
         - Name: Emp3
         - Department Id: 300
         - Salary: 45500.85
         - Status: inactive
         - ], 
         -
         - true=[Employee:
         - Id: 1
         - Name: Emp1
         - Department Id: 100
         - Salary: 50000.6
         - Status: active
         - , Employee:
         - Id: 4
         - Name: Emp4
         - Department Id: 300
         - Salary: 75500.3
         - Status: active
         - , Employee:
         - Id: 5
         - Name: Emp5
         - Department Id: 500
         - Salary: 88500.45
         - Status: active
         - , Employee:
         - Id: 6
         - Name: Emp6
         - Department Id: 100
         - Salary: 22690.33
         - Status: active
         - ]}

*** 

***

- BinarySearch
    - The binary search algorithm needs a sorted data set which has its costs too.
      - EXPECTED RESULT: We want the index of the data searched.
      - INPUT Before Sort: 
        - { 8, 1, 13, 15, 7 }
      - INPUT After Sort: 
        - { 1, 7, 8, 13, 15 }
      - OUTPUT:
        - 1

***

- CheckDuplicatesBruteForce
    - Given an array of n numbers, give an algorithm for checking whether there are any duplicate elements in the array or no?
      - INPUT: 
        - { 8, 1, 13, 15, 7 }
      - OUTPUT:
        - No duplicates
      - INPUT:
        -  { 8, 1, 13, 15, 7, 13 }
      - OUTPUT:
        - Duplicates: 13 <=> 13
***

- CheckDuplicatesSorting
    - Can we improve the complexity of CheckDuplicatesBruteForce's solution?
      - INPUT: 
        - {  8, 1, 13, 15, 7 }
      - OUTPUT:
        - No duplicates
      - INPUT:
        -  { 8, 1, 13, 15, 7, 15 }
      - OUTPUT:
        - Duplicates: 15 <=> 15

***

- UnorderedLinearSearch
    - Let us assume we are given an array where the order of the elements is not known. That means the elements of the array are not sorted. In this case, to search for an element we have to scan the complete array and see if the element is there in the given list or not.
      - EXPECTED RESULT: We want the index of the data searched.
        - INPUT: 
          - { 8, 1, 13, 15, 7 }
        - If data = 13
        - OUTPUT: 
          - 2

***

- SortedOrderedLinearSearch
    - If the elements of the array are already sorted, then in many cases we don’t have to scan the complete array to see if the element is there in the given array or not.
      - EXPECTED RESULT: We want the index of the data searched.
        - Before sort: 
            - NUMS = { 8, 1, 13, 15, 7 }
        - After Sort: 
            - NUMS = { 1, 7, 8, 13, 15 }
        - OUTPUT: 
            - 2

***

## TOP INTERVIEW QUESTIONS ARRAY
- ContainsDuplicate
    - Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
      - Example 1:
        - Input: 
            - nums = [1,2,3,1] 
        - Output: 
            - true 
      - Example 2:
        - Input: 
            - nums = [1,2,3,4] 
        - Output: 
            - false 
      - Example 3:
        - Input: 
            - nums = [1,1,1,3,3,4,3,2,4,2] 
        - Output: 
            - true
      - Constraints:
        - 1 <= nums.length <= 10^5 
        - -10^9 <= nums[i] <= 10^9

***

- RemoveDuplicatesFromSortedArray
    - Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements. Return k after placing the final result in the first k slots of nums. Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
      - Example 1:
        - Input: 
            - nums = [1,1,2]
        - Output: 
            - 2
            - nums = [1,2,_]
        - Explanation: 
            - Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively. It does not matter what you leave beyond the returned k (hence they are underscores). 
      - Example 2:
        - Input: 
            - nums = [0,0,1,1,1,2,2,3,3,4]
        - Output: 
            - 5
            - nums = [0,1,2,3,4,_,_,_,_,_]
        - Explanation: 
            - Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively. It does not matter what you leave beyond the returned k (hence they are underscores).
      - Example 3:
        - Input: 
            - nums = [1]
        - Output: 
            - 1
            - nums = [1]
      - Example 4:
        - Input: 
            - nums = [1,1]
        - Output: 
            - 1
            - nums = [1,_]
      - Example 5:
        - Input: 
            - nums = [1,1,2,2,2,2,3]
        - Output: 
            - 3
            - nums = [1,2,3,_,_,_,_]
      - Constraints:
        - nums is sorted in non-decreasing order.

***

- RotateArray
    - Given an array, rotate the array to the right by k steps, where k is non-negative.
      - Example 1:
        - Input: 
            - nums = [1,2,3,4,5,6,7]
            - k = 3
        - Output: 
            - [5,6,7,1,2,3,4]
        - Explanation:
            - rotate 1 steps to the right: [7,1,2,3,4,5,6]
            - rotate 2 steps to the right: [6,7,1,2,3,4,5]
            - rotate 3 steps to the right: [5,6,7,1,2,3,4]
      - Example 2:
        - Input: 
            - nums = [-1,-100,3,99]
            - k = 2
        - Output: 
            - [3,99,-1,-100]
        - Explanation:
            - rotate 1 steps to the right: [99,-1,-100,3]
            - rotate 2 steps to the right: [3,99,-1,-100]
      - Constraints:
        - 1 <= nums.length <= 10^5
        - -2^31 <= nums[i] <= 2^31 - 1
        -  0 <= k <= 10^5

***

- SingleNumber
    - Given a non-empty array of integers nums, every element appears twice except for one. Find that single one. You must implement a solution with a linear runtime complexity and use only constant extra space.
      - Example 1:
        - Input: 
            - nums = [2,2,1]
        - Output: 
            - 1
      - Example 2:
        - Input: 
            - nums = [4,1,2,1,2]
        - Output: 
            - 4
      - Example 3:
        - Input: 
            - nums = [1]
        - Output: 
            - 1
      - Constraints:
        - Each element in the array appears twice except for one element which appears only once.

***

- TwoSum
    - Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.
      - Example 1:
        - Input: 
            - nums = [2,7,11,15]
            - target = 9
        - Output: 
            - [0,1]
        - Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
      - Example 2:
        - Input: 
            - nums = [3,2,4]
            - target = 6
        - Output: 
            - [1,2]
      - Example 3:
        - Input: 
            - nums = [3,3]
            - target = 6
        - Output: 
            - [0,1]
      - Constraints:
          - 2 <= nums.length <= 10^4
          - -10^9 <= nums[i] <= 10^9
          - -10^9 <= target <= 10^9

## TOP INTERVIEW QUESTIONS STRING
- ReverseInteger
    - Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
    Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
        - Example 1:
          - Input: 
              - x = 123
          - Output: 
              - 321
        - Example 2:
          - Input: 
              - x = -123
          - Output: 
              - -321
        - Example 3:
          - Input: 
              - x = 120
          - Output: 
              - 21
        - Constraints:
          - -2^31 <= x <= 2^31 - 1

***

- ReverseString
    - Write a function that reverses a string. The input string is given as an array of characters s. You must do this by modifying the input array in-place with O(1) extra memory.
      - Example 1:
        - Input: 
            - s = ["h","e","l","l","o"]
        - Output: 
            - ["o","l","l","e","h"]
      - Example 2:
        - Input:
            - s = ["H","a","n","n","a","h"]
        -  Output:
            - ["h","a","n","n","a","H"]
      - Constraints:
        - 1 <= s.length <= 105 s[i] is a printable ascii character.

***
## License

All work is under Apache 2.0 license