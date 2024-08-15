package interviewjava;

import java.util.Scanner;

// Write a Java program to check if a vowel is present in a string.
public class StringVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string : ");
        String input =  sc.nextLine();
        boolean ans =  input.toLowerCase().matches(".*[aeiou].*");
       if (ans){
           System.out.println("vowel present");
       }
       else{
           System.out.println("vowel not present");
       }
    }
}
