import java.util.*;

public class ArrayCC {
    public static void printPairs(int numbers[]) {
        int tpp = 0;
        for(int i=0; i<numbers.length; i++){
            int curr=numbers[i];
            for(int j=i+1; j<numbers.length; j++) {
                System.out.print("(" + curr + " "+ j +")");
                tpp++;
            }
            System.out.println();
        }
        System.out.print("total pairs:="+tpp);

    }
    public static void main(String args[]) {
        int numbers[]={2, 4, 6, 8, 10};
        printPairs(numbers);
    }
}
