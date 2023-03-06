package sort;

import java.util.Arrays;

public class Advanced {
    public static void quickSort(int[] nums) {
        quickSortImpl(nums, 0, nums.length - 1);
    }

    private static void quickSortImpl(int[] nums, int left, int right) {
        if (right <= left) return;
        int pivot = nums[right], sortedIdx = left;
        for (int i = left; i < right; i++)
            if (nums[i] <= pivot) {
                swapWithIdx(nums, sortedIdx, i);
                sortedIdx++;
            }
        swapWithIdx(nums, sortedIdx, right);
        quickSortImpl(nums, left, sortedIdx - 1);
        quickSortImpl(nums, sortedIdx + 1, right);
    }

    private static void swapWithIdx(int[] nums, int left, int right) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }

    public static void mergeSort(int[] nums) {
        mergeSortImpl(nums, 0, nums.length - 1);
    }

    private static void mergeSortImpl(int[] nums, int left, int right) {
        if (right <= left) return;
        int mid = (left + right) / 2;
        mergeSortImpl(nums, left, mid);
        mergeSortImpl(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    private static void merge(int[] nums, int left, int mid, int right) {
        int[] arrL = Arrays.copyOfRange(nums, left, mid + 1);
        int[] arrR = Arrays.copyOfRange(nums, mid + 1, right + 1);
        int i = 0, j = 0, k = left;
        while (i < arrL.length && j < arrR.length)
            nums[k++] = arrL[i] < arrR[j] ? arrL[i++] : arrR[j++];
        while (i < arrL.length) nums[k++] = arrL[i++];
        while (j < arrR.length) nums[k++] = arrR[j++];
    }

    public static void heapSort(int[] nums) {
        for (int i = nums.length / 2 - 1; 0 <= i; i--) {
            heapify(nums, nums.length, i);
        }
        for (int i = nums.length - 1; 0 < i; i--) {
            swapWithIdx(nums, 0, i);
            heapify(nums, i, 0);
        }
    }

    private static void heapify(int[] nums, int len, int idx) {
        int p = idx, l = p * 2 + 1, r = p * 2 + 2; // p = parent, l = left, r = right
        if (l < len && nums[p] < nums[l]) p = l;
        if (r < len && nums[p] < nums[r]) p = r;
        if (p != idx) {
            swapWithIdx(nums, p, idx);
            heapify(nums, len, p);
        }
    }
}
