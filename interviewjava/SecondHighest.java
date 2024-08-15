package interviewjava;

public class SecondHighest {
    static int secondHighest(int [] arr)
    {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++)
        {
          if(arr[i] > first)
          {
              second = first;
              first = arr[i];
          }
          else if( arr[i] > second) {
              second = arr[i];

          }
        }
        return second;
    }
    public static void main(String[] args)
    {
        int[] array = {1,5,6,3,7,4,9};
        int ans = secondHighest(array);
        System.out.println(ans);
    }
}
