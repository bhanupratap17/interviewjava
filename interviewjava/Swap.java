package interviewjava;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(" after swapping value of a: "+a+" and b is :"+b);

//        b = a+b;
//        a = b-a;
//        b = b-a;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(" after swapping value of a: "+a+" and b is :"+b);
    }
}
