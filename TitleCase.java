public class TitleCase {


    public  boolean MyTitleCase(String input)
    {

        String[] words = input.split(" ");
       
        for(String word:words)
        {
            if(word.length() > 0 && !Character.isUpperCase(word.charAt(0)))
            {
                  return false;
            }
        }

        return true;
    }




    public static void main(String args[])
    {

        String input = "This Is A Title Class";

         TitleCase in = new TitleCase();
         boolean fs = in.MyTitleCase(input);
       System.out.println("The input given is a Title case "+fs);
        

    }
    
}
