public class StringSubString {
    public static void main(String args[]) {
        String sentence = "My Main language is java";
        String alpha = "java is best language";

        // Bydefault ending index is last index of string

        String name = sentence.substring(8, 16);
        String beta = alpha.substring(0, 4);
        System.out.println(name); // Bydefault ending index is last index of string
        System.out.println(beta);
    }
}