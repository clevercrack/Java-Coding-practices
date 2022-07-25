import java.net.SocketTimeoutException;

public class StringCompare {
    public static void main(String args[]) {
        String Name1 = "Zehra";
        String Name2 = "Zehra";

        // compareTO function check 3 things in Comparasion
        // in Comparasion it will compare alphabatic value of each string
        // 1. s1 > s2 : +ve value
        // 2. s1 == s2 : Strings are equal
        // 3. s1 < s2 : -ve value

        if (Name1.compareTo(Name2) == 0) {
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings are Not Equal");
        }
    }
}