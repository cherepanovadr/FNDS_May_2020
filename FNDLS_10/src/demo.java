import java.util.Arrays;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        final List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);

        System.out.println(Partition.ofSize(numbers, 3));
        System.out.println(Partition.ofSize(numbers, 2));
    }

}
