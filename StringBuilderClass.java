class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Drako");
        System.out.println(str);

        // char at index 0
        System.out.println(str.charAt(0));

        // set char at index 0
        str.setCharAt(0, 'v');
        System.out.println(str);
    }
}