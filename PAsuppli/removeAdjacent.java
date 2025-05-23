// Removing Duplicate Characters from a String.
// Imagine you are developing a text processing tool, and you need to implement a Java program that removes duplicate characters from a given input string. You've written a program that takes user input for a string and uses recursion to remove duplicate characters.

// Input Format
// The user should enter a string that they want to process, and the program will remove duplicate characters from this input string.

// Output Format
// The program will print the resulting string after removing consecutive duplicate characters from the input string.

// Note: Only Consecutive duplicates will be removed.


// Sample input1
// banana
// Sample output1
// banana


// Sample input2
// programming
// Sample output2
// programing


import java.util.Scanner;

public class removeAdjacent{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(str.charAt(0));
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)!=str.charAt(i-1))
            {
                System.out.print(str.charAt(i));
            }
        }
    }
}