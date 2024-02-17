import java.util.HashMap;
import java.util.HashSet;

public class Intersection {



    public static void main(String args[])
    {
       int arr1[] = {1,2,3,4,5};
       int arr2[] = {6,7,8,3,9};

        StringIntersection(arr1,arr2);
    }

    private static void StringIntersection(int[] arr1, int[] arr2) {
        
        HashSet<Integer> arr3 = new HashSet<>();

        for(int i=0;i<arr1.length;i++)
        {
            arr3.add(arr1[i]);
        }
        for(int j =0;j < arr2.length; j++)
        {
            if(arr3.contains(arr2[j]))
            {
                 System.out.println(arr2[j]);
            }
        }
    }
    
}
