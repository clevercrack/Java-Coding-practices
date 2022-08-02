class BitManipulation {
    public static void main(String[] args) {
        int n = 5; // 0101 Binary of % in this we can see that Posion of 2 is one bit.
        int pos = 2;
        int bitMask = 1 << pos;
        // Bit Manipulation To { GET } bit
        // 1.) First perform Bit mask 1<<i
        // 2.) Second perform operation AND

        if ((bitMask & n) == 0) {
            System.out.println("Bit Was Zero");
        } else {
            System.out.println("Bit was One");
        }
    }
}