import java.util.*;
public class Permutations {
    public static void generate(int[] arr, int index) {
        if (index == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            generate(arr, index + 1);
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        generate(arr, 0);
    }
}