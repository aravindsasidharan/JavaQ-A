public class ExtractFirstCharacter {

    

    public static void splitFirst(String input2)
    {

        String[] words = input2.split(" ");
        
        for(int i = 0;i < words.length;i++ )
        {
            
            String s = words[i];
            
            System.out.println(s.charAt(0));
        }
        
    }
    public static void main(String args[])
    {
        String input = "This was a wonderful day";
        splitFirst(input);
      



    }
}

