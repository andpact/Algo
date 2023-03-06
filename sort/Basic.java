package sort;

public class Basic {

    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < nums.length; j++)
                minIdx = nums[j] < nums[minIdx] ? j : minIdx;
            int tmp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = tmp;
        }
    }

    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++)
            for (int j = 1; j < nums.length - i; j++)
                if (nums[j] < nums[j - 1]) {
                    int tmp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = tmp;
                }
    }
    
    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int tmp = nums[i];
            int idx = i - 1;
            while (0 <= idx && tmp < nums[idx]) {
                nums[idx + 1] = nums[idx];
                idx--;
            }
            nums[idx + 1] = tmp;
        }
    }
}
