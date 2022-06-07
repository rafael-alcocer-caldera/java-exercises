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
       - Input String: "abcdf"
       - Reversed String: "fdcba"
       - OUTPUT: false
       <br />
       - Input String: "reconocer"
       - Reversed String: "reconocer"
       - OUTPUT: true

<br />

- Exercise02Palindrome
    - Find the longest palindrome within a string..
       - Input String: "abcdfhreconocerhyhduracer"
       - OUTPUT: hreconocerh

## License

All work is under Apache 2.0 license