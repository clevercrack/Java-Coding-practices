public class StringParse {
    public static void main(String args[]) {
        String str = "123";
        // Parsing Method
        int number = Integer.parseInt(str);// Converts string to primitive integer
        long number2 = Long.parseLong(str);// Converts string to primitive long
        System.out.println(number);
        System.out.println(number2);
    }
}