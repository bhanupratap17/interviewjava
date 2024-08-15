package interviewjava;

import java.util.Arrays;
import java.util.Random;

public class RandomSuffle {
    static int[] randomSuffle(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndexToSwap = rand.nextInt(arr.length);
            int temp = arr[randomIndexToSwap];
            arr[randomIndexToSwap] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main (String[]args){
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] ans = randomSuffle(array);
        System.out.println(Arrays.toString(ans));

    }
}
