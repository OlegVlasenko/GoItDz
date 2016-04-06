package module5;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длинну массива: ");


            int length = scanner.nextInt();

 try {
     int[] array = new int[length];


     System.out.println("Введите массив целых числе из " + length + " элементов:");

     for (int i = 0; i <= array.length - 1; i++) {
         array[i] = scanner.nextInt();
     }

     System.out.println("Максимальное число: " + max(array));
     System.out.println("Минимальное число: " + min(array));
     System.out.println("Отсортированый массив: " + Arrays.toString(sorting(array)));
 }catch (NegativeArraySizeException e){
     System.out.print("Массив не может быть отрицательной длинны");
 }
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