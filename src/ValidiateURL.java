import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidiateURL {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        while (!url.equals("quit")) {
            System.out.println(isURLValid(url));
            url = scanner.nextLine();
        }
    }

    public static boolean isURLValid(String url) {
        Pattern p = Pattern.compile("http(s?)://(www/.)?.*");
        Matcher match = p.matcher(url);
        return match.matches();
    }
}
