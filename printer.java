
package pkgclass.main;

public class printer<T> {
    private T item;

    public printer(T item) {
        this.item = item;
    }

    public void printer() {
        System.out.println("Printer Value: " + item);
    }
}
