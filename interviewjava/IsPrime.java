package interviewjava;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num: ");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
    }
    static int isPrime(int N) {
        // Handle special cases
        if (N <= 1) {
            return 0; // 0 and 1 are not prime numbers
        }
        if (N == 2) {
            return 1; // 2 is the smallest prime number
        }
        // Check for divisibility from 2 to sqrt(N)
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return 0; // If N is divisible by i, it's not prime
            }
        }
        return 1; // If no divisors were found, N is prime
    }
}
