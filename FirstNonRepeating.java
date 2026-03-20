import java.util.*;
public class FirstNonRepeating {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 0, 4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            if (map.get(num) == 1) {
                System.out.println("First non-repeating: " + num);
                return;
            }
        }
    }
}