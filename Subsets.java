import java.util.*;
public class Subsets {
    public static void generate(int[] arr, int index, List<Integer> current) {
        if (index == arr.length) {
            System.out.println(current);
            return;
        }
        current.add(arr[index]);
        generate(arr, index + 1, current);
        current.remove(current.size() - 1);
        generate(arr, index + 1, current);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2};
        generate(arr, 0, new ArrayList<>());
    }
}