package interviewjava;

public class Fibonacci {
    static long[] fiboCache = new long[20];
    public static void main(String[] args) {
        //printFibonacci();
        for (int i = 0; i < 20; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

//    public static void printFibonacci(){
//        int firstNum = 0;
//        int secondNum = 1;
//        int limit = 10;
//        System.out.print(firstNum+" "+secondNum+" ");
//        for(int i = 0;i<limit;i++)
//        {
//            int nextNum = firstNum+secondNum;
//            System.out.print(nextNum+" ");
//            firstNum = secondNum;
//            secondNum = nextNum;
//        }
//    }

    public static long fibo(int n){
        if(n<=1)
        {
            return n;
        }
        if (fiboCache[n] != 0) {
            return fiboCache[n];
        }
        fiboCache[n] = fibo(n - 1) + fibo(n - 2);
        return fiboCache[n];
    }
}
