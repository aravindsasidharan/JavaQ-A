import java.util.ArrayList;
import java.util.List;

public class RemoveCharacter {


    public static void main(String args[])
    {

    //     String up = "This is the Boost";
    //     Character cha = 'i';

    //   List<String> newComp = charRemove(up,cha);

      
    //     System.out.println(newComp);

    String str = "CloudIndia";

    char ch = 'C';
    removeChar(str,ch);
      


    }

    public static void removeChar(String str, char c)
    {

       int n = str.length();

       String finalStr = "";

       for(int i = 0; i<n; i++)
       {

            if(str.charAt(i) != c)
            {

                
                    finalStr = finalStr + str.charAt(i);
                
            }
 
           
       }
       System.out.println("The final character : "+finalStr);




    }

    // private static List<String> charRemove(String up, Character cha) {
       
    //     int num = up.length();

    //     List<String> newStrings = new ArrayList<>();

    //     for(int i = 0; i < num; i++)
    //     {
    //         if(up.charAt(i)!=cha)
    //         {
    //             newStrings.add(String.valueOf(up.charAt(i)));
    //         }
    //     }

    //     return newStrings;
    // }
    
}
