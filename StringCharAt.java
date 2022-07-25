public class StringCharAt {
    public static void main(String args[]) {
        String firstName = "Drako";
        String lastName = "Malfoe";
        String fullName = firstName + "@@@" + lastName;

        // charAt is a fuction that is used for print each character of a string.

        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
}