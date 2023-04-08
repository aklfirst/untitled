import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[30];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 30);
            if (arr[i] % 2 == 0) {
                arr[i] += 1;
            }
            System.out.print(arr[i] + " ");
            }
        System.out.println();

        List<Integer> result = new ArrayList<>();
        for (int i = 2; i < 7; i++) {
            result.add(arr[i]);
        }
        System.out.println(result);

    }

}