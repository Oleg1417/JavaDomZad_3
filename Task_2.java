import java.util.ArrayList;
import java.util.List;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа

public class Task_2 {
    public static void main(String[] args) throws Exception {

        List<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(7);
        array.add(5);
        array.add(6);
        array.add(2);
        array.add(7);
        array.add(9);
        System.out.println(array);
        removeSomeNumbers(array);
        System.out.println(array);
    }

    public static void removeSomeNumbers(List<Integer> array) throws Exception {
        int i = 0;
        while (i < array.size()) {
            if (array.get(i) % 2 == 0)
                array.remove(i);
            else
                i++;
        }
    }
}
