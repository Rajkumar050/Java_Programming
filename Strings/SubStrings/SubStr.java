package Strings.SubStrings;

public class SubStr {
    public static String substring(String str, int start, int end) {
        String substr = "";
        for (int i=start; i<end; i++) {
            substr +=str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]) {
        // Substring
        String str = "Helloworld";
        System.out.println(substring(str, 0, 5));
    }
}
