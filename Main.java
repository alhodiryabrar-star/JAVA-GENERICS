package pkgclass.main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. تجربة LowerBoundDemo
        List<Number> list = new ArrayList<>();
         lowerbound.addNumbers(list);

        System.out.println("-------------------");

        // 2. تجربة NumberDemo
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(5.5);
        doubleList.add(10.2);
       numberdemo.printNumbers(doubleList);

        System.out.println("-------------------");

        // 3. تجربة Printer (Generic Class)
         printer<String> stringPrinter = new  printer<>("Hello Java Generics!");
        stringPrinter. printer();
    }
}
