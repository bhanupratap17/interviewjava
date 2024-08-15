package interviewjava;

public class Factorial {

    static long findFacto(int N){
        // code here
        long result = 1;

        for (int i = 2; i <= N; i++) {
            result *= i;
        }

        return result;
    }
//    static int findFacto(int num)
//    {
//        if(num == 1)
//     A
    public static void main(String[] args) {
        long ans = findFacto(5);
        System.out.println(ans);
    }
}
