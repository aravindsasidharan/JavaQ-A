import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {


// Program to find the majority element in a array 

    public static void main(String[] args) {
        
        HashMap<Integer, Integer> map 
        = new HashMap<>(); 
    
     int num[] = {10,20,20,20,20};

     for(int i =0;i < num.length;i++)
     {
             
       map.put(num[i],map.getOrDefault(num[i], 0)+1);

     }

     for(Map.Entry<Integer,Integer> entry:map.entrySet())
     {

        System.out.println("entryvalue");

           if(entry.getValue()>num.length/2)
           {
            int result = entry.getKey();

            System.out.println(result);

           }
     }



    }
    
}
