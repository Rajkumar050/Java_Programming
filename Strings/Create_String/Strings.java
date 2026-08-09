import java.util.*;

public class Strings {
    public static void printLetter(String str) {
        for (int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str1 = new String("abc");
        // String str2 = "xyz";

        // // Strings are IMMUTABLE;

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);
        // System.out.println(name.length());

        // Concatenation
        // String firstname = "Raj";
        // String lastname = "Sarraf";
        // String fullname = firstname + " " + lastname;
        // System.out.println(fullname);
        // System.out.print(firstname.charAt(0));
        String str = "My name is raj kumar";
        printLetter(str);

    }
    
}
