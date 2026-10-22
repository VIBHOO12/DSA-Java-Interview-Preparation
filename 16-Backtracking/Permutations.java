

import java.util.*;

public class Permutations {

    static void generate(
            int[] arr,
            boolean[] used,
            List<Integer> current) {

        // Saare elements select ho gaye
        if (current.size() == arr.length) {
            System.out.println(current);
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if (used[i]) {
                continue;
            }

            // Choice
            used[i] = true;
            current.add(arr[i]);

            // Explore
            generate(arr, used, current);

            // Backtrack
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        generate(
            arr,
            new boolean[arr.length],
            new ArrayList<>()
        );
    }
}
