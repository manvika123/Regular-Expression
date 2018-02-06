
public class Question4 {

    public static void main(String[] args)
    {
        String str1 = "Ravindra/./";
        String str2 = "/../";
        String str3 = "/./";
        System.out.println("Original String: " + str1);
        System.out.println(str1.contains(str2)|| str1.contains(str3));
    }
}