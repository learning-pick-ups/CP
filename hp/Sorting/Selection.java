import java.util.Scanner;

public class Selection{
    public static void SelectionSort(int[] arr){


        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[min_index] ){
                    min_index = j;
                }
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }
        }
        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number of elements in th5e array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        SelectionSort(arr);
    }
}
