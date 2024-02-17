import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringCompression {


    public static void main(String args[])
    {
        String word = "AllenSolly";

        Map<Character,Integer> map = new LinkedHashMap();

        for(int i = 0;i< word.length(); i++)
        {

            if(map.get(word.charAt(i))!=null)
            {
                map.put(word.charAt(i),map.get(word.charAt(i))+1);
            }
            else
            {
                map.put(word.charAt(i),1);
            }

        }

        StringBuilder bd = new StringBuilder();
        for(Entry<Character,Integer> entry: map.entrySet())
        {
                 bd.append(entry.getKey());
                 bd.append(entry.getValue());

            
        }

        System.out.println(bd.toString());
       


    }
    
}
