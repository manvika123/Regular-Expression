import java.util.Scanner;

public class Question5 {
    public static void main(String[] args)
        {
            Scanner sc= new Scanner(System.in);
            String str = sc.nextLine();

            // The String to check the above two Strings to see
            // if they end with this value (se).
            String end_str1 = ".html";
            String end_str2 = ".htm";
            // Check first two Strings end with end_str
            boolean ends1 = (str.endsWith(end_str1)||str.endsWith(end_str2));

            // Display the results of the endsWith calls.
            System.out.println(ends1);
        }
    }

