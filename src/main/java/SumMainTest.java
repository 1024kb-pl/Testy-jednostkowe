import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class SumMainTest {
    public double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        SumMainTest main = new SumMainTest();

        double a = 2;
        double b = 3;

        double result = main.sum(a, b);

        if (result == 5d) {
            System.out.println("Test zaliczony!");
        } else {
            System.out.println("Test niezaliczony!");
        }
    }
}
