package interviewjava;

public class PalindromeString {
    public static boolean checkPalindromeString(String s) {
        String cleanedStr = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        if (checkPalindromeString(input)) {
            System.out.println("string is palindrom");
        } else {
            System.out.println("string is not palindrom");
        }
    }
}

