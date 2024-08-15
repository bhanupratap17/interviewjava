package interviewjava;

import java.util.*;

public class CheckOddList {
    public static void checkListOdd(List<Integer> list){
       boolean newlist =  list.parallelStream().anyMatch(n -> n % 2 == 0);
        System.out.println(newlist);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        checkListOdd(list);
    }
}
