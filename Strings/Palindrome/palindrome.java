package Strings.Palindrome;

public class palindrome {
    public static boolean ispalindrome(String str) {
        for (int i=0; i<str.length(); i++) {
            for (int j=str.length()-1; j>=0; j--) {
                if (str.charAt(i)==str.charAt(j)) {
                    System.out.println("is palindrome");
                    return true;

                }
            }
        }
        return false;
    }
    public static void main (String args[]) {
        String str = "racecar";
        System.out.print(ispalindrome(str));
    }
}
