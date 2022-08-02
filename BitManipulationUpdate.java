import java.util.*;

public class BitManipulationUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper=1 set : oper=0 clear
        int n = 5;
        int pos = 1;

        int bitMask = 1 << pos;

        if (oper == 1) {
            // set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            // clear
            int newBitMask = ~(bitMask);// NOT of BM
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}