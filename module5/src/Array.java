import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        int[] array = new int[5];

        System.out.println("Введите массив целых числе из 5 элементов:");

        for (int i = 0; i <= 4; i++){
            array[i] = scanner.nextInt();
        }

        System.out.println("Максимальное число: " + max(array));
        System.out.println("Минимальное число: " + min(array));
        System.out.println("Отсортированый массив: " + Arrays.toString(sorting(array)));
    }

    public static int max(int[] array){
        int max = array[0];
        for(int i = 0; i <= array.length - 1; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array){
        int min = array[0];
        for(int i = 0; i <= array.length - 1; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static int[] sorting(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
}
