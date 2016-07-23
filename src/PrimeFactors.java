import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.List;
public class PrimeFactors {
    public static void main(String[] args) {
        int N=30;
        generator(N);

        for (Integer integer : generator(N)) {
            System.out.println(integer);
        }
    }

    public static List<Integer> generator(int numbers) {
        int N = numbers;
        List<Integer> facts = new ArrayList<Integer>();
        for (int i = 2; i <= N / i; i++) {
            while (N % i == 0) {
                facts.add(i);
                N =N/i;
            }
        }
        if (N > 1) {
            facts.add(N);
        }
        return facts;
    }
}
