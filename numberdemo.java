
package pkgclass.main;

import java.util.List;

public class numberdemo {
    public static void printNumbers(List<? extends Number> list) {
        System.out.println("Number Demo Values:");
        for (Number n : list) {
            System.out.println(n);
        }
    }
}
