// Реализовать алгаритм сортировки слиянием
public class Task_1 {

    public static void main(String[] args) throws Exception {
        int[] array = { 2, 5, 96, 4, 3, 1, 8, 6, 0, 7, 4, 2, 9, 77, 56 };
        int[] answer = mergeSort(array);
        System.out.println("Sorted array: ");
        for (int element : answer) {
            System.out.printf("%d ", element);
        }
    }

    public static int[] mergeSort(int[] a) throws Exception {

        if (a.length < 2) {
            return a;
        }
        int[] tempB = new int[a.length / 2];
        System.arraycopy(a, 0, tempB, 0, a.length / 2);
        tempB = mergeSort(tempB);
        int[] tempC = new int[a.length - (a.length / 2)];
        System.arraycopy(a, a.length / 2, tempC, 0, a.length - (a.length / 2));
        tempC = mergeSort(tempC);
        return merge(tempB, tempC);
    }

    public static int[] merge(int[] arrayA, int[] arrayB) throws Exception {
        int[] newArray = new int[arrayA.length + arrayB.length];
        int ta = 0, tb = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (i >= ta + arrayA.length) {
                if (newArray[i - 1] > arrayB[i - tb]) {
                    newArray[i] = newArray[i - 1];
                    newArray[i - 1] = arrayB[i - tb];
                } else {
                    newArray[i] = arrayB[i - tb];
                }
                ta++;
            } else if (i >= tb + arrayB.length) {
                if (newArray[i - 1] > arrayA[i - ta]) {
                    newArray[i] = newArray[i - 1];
                    newArray[i - 1] = arrayA[i - ta];
                } else {
                    newArray[i] = arrayA[i - ta];
                    tb++;
                }
            } else if (ta == arrayA.length) {
                newArray[i] = arrayA[i - ta];
                tb++;
            } else if (tb == arrayB.length) {
                newArray[i] = arrayB[i - tb];
                ta++;
            } else if (arrayA[i - ta] < arrayB[i - tb]) {
                newArray[i] = arrayA[i - ta];
                tb++;
            } else {
                newArray[i] = arrayB[i - tb];
                ta++;
            }
        }
        return newArray;
    }
}