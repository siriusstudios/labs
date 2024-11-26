import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numberGenerator(numbers);

        numbers.stream()
                .filter(n -> (n % 3 == 0))
                .forEach(n -> {
                    if (n < 0)
                        System.out.println(n * (-1));
                    else
                        System.out.println(n);
                });
    }

    public static void numberGenerator(List<Integer> ints) {
        int number_of_nums = (int) Math.floor(Math.random() * 100);

        while (number_of_nums != 0) {
            /* either 0 or 1 */
            int rand = (int) Math.floor(Math.random() * 2);
            System.out.println(rand);
            if (rand == 0) {
                ints.add((int) Math.floor(Math.random() * 100) * (-1));
            } else {
                ints.add((int) Math.floor(Math.random() * 100));
            }
            number_of_nums--;
        }
    }
}
