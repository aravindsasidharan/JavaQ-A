public class ArrayFirstOccurance
{


    


    public static void main(String args[])
    {
        Integer num[] = {1,2,3,4,3};

        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
               if(num[i]==num[j])
               {
                System.out.println("The first occurance no"+num[i]);
                return;
                
               }
            }
        }
    }
}