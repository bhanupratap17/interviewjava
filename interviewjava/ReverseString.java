package interviewjava;

public class ReverseString {

    public static void main(String[] args) {
        String str = "bhanupratap bhana";

        System.out.println(reverse(str));
    }

//    public static String reverse(String in) {
//        StringBuilder out = new StringBuilder();
//
//        char[] chars = in.toCharArray();
//
//        for (int i = chars.length - 1; i >= 0; i--)
//            out.append(chars[i]);
//
//        return out.toString();
//    }


         //second method

    public static String reverse(String str) {
        int size = str.length();
        char[] out = new char[size];

        for (int i = size - 1; i >= 0; i--) {
            out[size - 1 - i] = str.charAt(i);
        }

        return new String(out);
    }

//             third method

//    public static String reverse(String str){
//        StringBuilder sb = new StringBuilder();
//        sb.append(str);
//        String x = String.valueOf(sb.reverse());
//       return x;
//    }
}
