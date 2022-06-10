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
    
<br />

- Exercise02AnagramDeclarativeAndImperativeProgramming
    - Check if 2 strings are anagrams using the Declarative and Imperative Programming way. Space characters are not considered.
    - Example: 	S1 = "deudora", S2 = "eduardo", S3 = "funeral", S4 = "real      fun"
    
<br />

- Exercise03AnagramDeclarativeProgramming
    - Check if 2 strings are anagrams using the Declarative Programming way. Space characters are not considered.
    - Example: 	S1 = "deudora", S2 = "eduardo", S3 = "funeral", S4 = "real      fun"
    
<br />

- Exercise04AnagramImperativeProgramming
    - Write a function that takes in an array of strings as its argument and then print all the anagrams found in the array. 
       - INPUT: {"eat", "tea", "funeral", "raza", "frog", "elvis", "real&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;fun", "lives", "deudora", "dog", "ate", "eduardo", "zara"}
       - OUTPUT: [tea, ate, raza, lives, deudora, funeral, eat, real&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;fun, eduardo, elvis, zara]
    
<br />

- MyStackTest
    - Create a Custom Stack that works like Stack and Deque (ArrayDeque) classes with the push and pop methods.

<br />

- Exercise00CreateStreams
    - Several ways to create a Stream.
    
<br />

- Exercise01ArraysStream
    - From an array of strings, print only the strings that start with 'S' in ascending order uppercased.
       - INPUT: { "Steve", "Svetlana", "sara", "John", "paul" }
       - OUTPUT: SARA STEVE SVETLANA
    
<br />

- Exercise02ArraysStream
    - Square each number in an array and print the average.
       - INPUT: { 2, 4, 6, 8, 10 }
       - OUTPUT: 44.0
    
<br />

- Exercise03ArraysStream
    -  The following exercise comes from:
       [Letter Count Test](https://www.codingame.com/playgrounds/20782/java-guild-meeting-52018/streams---practice)
    - Now, starting again from a list of names, give me the total number of letters in all the names with more than 5 letters.
        - INPUT: { "Steve", "Svetlana", "sara", "John", "paul", "Ramiro", "Amanda", "Courtney", "Hubert" }
        - OUTPUT: 34

<br />

- Exercise10IntStream
    - Print the int numbers from 1 to 9 and from 1 to 10.
    
<br />

- Exercise11IntStream
    - From an int range of numbers from 1 to 10, print from 6 to 10. This means to skip the first 5 numbers.
        - OUTPUT:
         - 6
         - 7
         - 8
         - 9
         - 10
    
    
<br />

- Exercise12IntStream
    - Sum numbers from 1 to 4.
        - OUTPUT: 10

<br />

- Exercise13IntStream
    - Example of IntSummaryStatistics:
       - double average = summary.getAverage();
       - long count = summary.getCount();
       - int max = summary.getMax();
       - int min = summary.getMin();
       - long sum = summary.getSum();

<br />

- Exercise14IntStream
    - Get the minimum number from an array
       - INPUT: { 100, 50, 56, 22, 3, 66 }
       - OUTPUT: 3

<br />

- Exercise15IntStream
    - Find 3 distinct smallest numbers from an array.
       - INPUT: { 100, 50, 56, 22, 3, 66 }
       - OUTPUT: 
          - 3
          - 13
          - 22

<br />

- Exercise01Palindrome
    - Several ways to check if a String is a Palindrome.
       - INPUT String: "abcdf"
       - Reversed String: "fdcba"
       - OUTPUT: false
       <br />
       - Input String: "reconocer"
       - Reversed String: "reconocer"
       - OUTPUT: true

<br />

- Exercise02Palindrome
    - Find the longest palindrome within a string..
       - INPUT String: "abcdfhreconocerhyhduracer"
       - OUTPUT: hreconocerh

<br />

- Exercise20Stream
    - From a list of numbers count those that are greater than 20 after after applying the square to each number.
       - INPUT: 1, 2, 3, 4, 5, 6
       - OUTPUT: 2

<br />

- Exercise21Stream
    - From a list of doubles get the average from those that are greater than 100.
       - INPUT: 100.50, 200.45, 300.90, 37.56
       - OUTPUT: 200.61666666666665

<br />

- Exercise22Stream
    - This exercise only shows what exactly the lambda expression is creating.

<br />

- Exercise23Stream
    - From a list of names, find the first one sorted in ascending order.
       - INPUT: "Carl", "Ben", "Ana"
       - OUPUT: "Ana"

<br />

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

<br />

- Exercise25Stream
    -  Write a program to print employee details working in each department
       - INPUT:
         - Employee e1 = new Employee(1, "Emp1", 100, 50000.60, "active");
         - Employee e2 = new Employee(2, "Emp2", 100, 30500.75, "inactive");
         - Employee e3 = new Employee(3, "Emp3", 300, 45500.85, "inactive");
         - Employee e4 = new Employee(4, "Emp4", 300, 75500.30, "active");
         - Employee e5 = new Employee(5, "Emp5", 500, 88500.45, "active");
         - Employee e6 = new Employee(6, "Emp6", 100, 22690.33, "active");
       - OUTPUT:
         - 500-[Employee:
           Id: 5
           Name: Emp5
           Department Id: 500
           Salary: 88500.45
           Status: active
           ]
           100-[Employee:
           Id: 1
           Name: Emp1
           Department Id: 100
           Salary: 50000.6
           Status: active
           , Employee:
           Id: 2
           Name: Emp2
           Department Id: 100
           Salary: 30500.75
           Status: inactive
           , Employee:
           Id: 6
           Name: Emp6
           Department Id: 100
           Salary: 22690.33
           Status: active
           ]
           300-[Employee:
           Id: 3
           Name: Emp3
           Department Id: 300
           Salary: 45500.85
           Status: inactive
           , Employee:
           Id: 4
           Name: Emp4
           Department Id: 300
           Salary: 75500.3
           Status: active
           ]

## License

All work is under Apache 2.0 license