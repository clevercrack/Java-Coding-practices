public class BitManipulationSet {
    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 1;
        int bitMask = 1 << pos;

        // Bit Manipulation To { SET } bit
        // 1.) First perform => Bit mask 1<<i
        // 2.) Second perform => operation OR

        int newNumber = bitMask | n; // here we perform OR operation
        System.out.println(newNumber);
    }
}
