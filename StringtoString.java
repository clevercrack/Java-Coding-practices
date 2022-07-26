public class StringtoString {
    public static void main(String args[]) {
        int number = 123;
        float number2 = 0.25f;
        double number3 = 12.44;
        // That Will converts our number to string but we cant see as in o/p.
        // It converts... and we can see this by using of find
        // .length of a given string function()

        String str = Integer.toString(number);
        String gur = Float.toString(number2);
        String mus = Double.toString(number3);
        System.out.println(str.length()); // Converts integer to String
        System.out.println(gur.length()); // Converts Float to String
        System.out.println(mus.length()); // Converts Double to String
    }
}