public class Panagram {
    
    public static void main(String[] args) {
        
          
        String pana = "The quick brown fox jumps over the lazy dog";
  

        System.out.println("the word is" +panaGram(pana.toLowerCase()));



    }
    private static boolean panaGram(String str) {
        // TODO Auto-generated method stub
       if(str.length()<26)
       {
        return false;
       }
       else{
       
        for(char ch = 'a';ch <= 'z';ch++)
        {
            if(str.indexOf(ch)< 0)
            {
               return false;
            }
        }

       }

       
        return true;
    }
    
}
