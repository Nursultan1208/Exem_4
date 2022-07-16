import java.util.Scanner;

public class Exem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("второй по величине элемент: " + getSecondHighest(arr));
    }

    public static int getSecondHighest(int arr[]) {
        int firstHighest = arr[0];
        int secondHighest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = arr[i];
            } else if (arr[i] > secondHighest) {
                secondHighest = arr[i];
            }
        }
        return secondHighest;
    }
}
