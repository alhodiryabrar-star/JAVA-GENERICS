 
package pkgclass.main;
import java.util.List;
public class lowerbound {
    public static void addNumbers(List<? super Number> numbers) {
        numbers.add(10);
        numbers.add(20.5);
        numbers.add(30);
        
        System.out.println("Lower Bound List:");
        for (Object n : numbers) {
            System.out.println(n);
        }
    }
}
    

