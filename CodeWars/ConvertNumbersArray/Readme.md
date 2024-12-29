# Welcome to my CodeWars [ConvertNumbersArray](https://www.codewars.com/kata/5583090cbe83f4fd8c000051) Example 🎉

## Description
Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

## Example:
35231 => [1,3,2,5,3]
0 => [0]

## My Solution
- **Language**: Java, JUnit
- Long.toString(n) converts the number into a string
- Character.getNumericValue() extracts the numeric value of a character from the string.
- The loop fills the result array in reverse order.

## Learnings
- A long is a primitive data type that has no method to directly split it into digits. 
- You must either convert the long to a string or use mathematics to extract the digits.

**Happy Coding!**  
