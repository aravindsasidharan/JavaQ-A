import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStream {

   

    public static void main(String args[])
    {

        String str = "Java is a hello";
        String reverseStr = reverseString(str);
        System.out.println("The reverse of the string is "+reverseStr);


    }

    private static String reverseString(String str) {
        // TODO Auto-generated method stub
       // String strRev = Stream.of(str).map(String -> new StringBuffer(str).reverse()).collect(Collectors.joining(str));
        String strRev = str.chars().mapToObj(c -> String.valueOf((char) c)).reduce((s1,s2) -> s2 + s1).orElse("");
        



       return strRev;
    }
    
}
