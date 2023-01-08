package JSeminar_6;

import java.util.*;

public class Task0 {

    public static void main(String[] args) {
        LinkedHashSet<Integer> tfg = new LinkedHashSet<>();
        int[] d = { 1, 2, 3, 2, 4, 5, 6, 3 };
        for (int i : d) {
            tfg.add(i);
        }
        System.out.println(tfg);
    }
}
