import java.util.ArrayList;

import java.util.List;

public class Main {

    public static void addNumbers(List<? super Number> numbers) {

        numbers.add(6);

        numbers.add(24.5);

        numbers.add(40);

        System.out.println("Numbers:");

        for (Object n : numbers) {

            System.out.println(n);

        }

    }

    public static void main(String[] args) {

        List<Number> list = new ArrayList<>();
 addNumbers(list);

    }

}
