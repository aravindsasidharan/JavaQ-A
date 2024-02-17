public class RotatedString {

    public static void main(String args[])
    {
       boolean rotated = isRotated("abcd","abcd");
          System.out.println(rotated);
        }

        public static boolean isRotated(String str,String rotatedString)
        {
           if(str == null && rotatedString==null)
           {
            return false;
           }
           else
           {
            String concatedString = str + str;
            boolean cons = concatedString.contains(rotatedString);
            return cons;
            }
        }
            
    }
    

