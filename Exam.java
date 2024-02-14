import java.util.Arrays;

public class Exam {
    public static void main(String[] args) {
        String str = "This Is A Title Case String";
        System.out.println(isTitleCase(str));
    }

    public static boolean isTitleCase(String str) {
        // Split the string into words
        String[] words = str.split(" ");
        System.out.println("word array" +Arrays.toString(words));

        // Check if each word starts with an uppercase letter
        for (String word : words) {
            if (word.length() > 0 && !Character.isUpperCase(word.charAt(0))) {
                return false;
            }
        }

        return true;
    }
}
