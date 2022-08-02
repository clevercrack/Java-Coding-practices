public class BitManipulationClear {
    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 2;
        int bitMask = 1 << pos;

        // Bit Manipulation To { CLEAR } bit
        // 1.) First perform Bit mask 1<<i
        // 2.) Second perform operation AND with NOT(NOT of BM)

        int notBitMask = ~(bitMask); // perfrom NOT of Bit Mask
        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}
