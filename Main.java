import sort.Advanced;
import sort.Basic;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int)(Math.random() * 10);
        System.out.println("Before sorting");
        System.out.println("0 1 2 3 4 5 6 7 8 9");
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
        Advanced.heapSort(arr);
        System.out.println("After sorting");
        System.out.println("0 1 2 3 4 5 6 7 8 9");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
