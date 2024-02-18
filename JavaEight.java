import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;


public class JavaEight {

    public static void main(String args[])
    {
       List<Integer> integer = Arrays.asList(4,5,20,7,10,9);

      // integer.stream().map(n->n *2).forEach(System.out::println);
// List square = integer.stream().map(x->x*x).collect(Collectors.toList());

// System.out.println(square);

// to find no greater than 100 in the filter list

//integer.stream().mapToInt(n -> n * n).filter(n -> n >= 100).forEach(System.out::println);

OptionalDouble opt = integer.stream().mapToInt(n -> n*n).filter(n -> n >= 100).average();

if(opt.isPresent())
{
    System.out.println("Average" +opt.getAsDouble());


}
else{
    System.out.println("No qualifiying element");
}


    }
    
}
