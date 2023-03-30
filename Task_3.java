import java.util.ArrayList;
import java.util.List;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

public class Task_3 {
    public static void main(String[] args) throws Exception {
        
        List<Integer> array = new ArrayList<>();
        array.add(getRandomNumber(0, 9));
        array.add(getRandomNumber(0, 9));
        array.add(getRandomNumber(0, 9));
        array.add(getRandomNumber(0, 9));
        array.add(getRandomNumber(0, 9));
        array.add(getRandomNumber(0, 9));
        array.add(getRandomNumber(0, 9));

        System.out.println(array);
        System.out.println("Максимальное значение: " + maxValue(array));
        System.out.println("Минимальное значение: " + minValue(array));

        System.out.printf("Среднее значение: " + "%.2f", everageValue(array));
    }

    private static Integer getRandomNumber(int i, int j) throws Exception {
        return (int) ((Math.random() * (j - i)));
    }

    private static Integer maxValue(List<Integer> arr) throws Exception {
        int maxi = 0;
        for (int element : arr) {
            if (element > maxi) {
                maxi = element;
            }
        }
        return maxi;
    }

    private static Integer minValue(List<Integer> arr) throws Exception {
        int mini = arr.get(0);
        for (int element : arr) {
            if (element < mini) {
                mini = element;
            }
        }
        return mini;
    }

    private static double everageValue(List<Integer> arr) throws Exception {
        double sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        sum = sum / arr.size();
        return sum ;
    }

}