package sort;

/**
 * Created by monica on 2016/10/8.
 */
public class QuickSort implements BaseSort {
    /**
     * 快速排序（Quicksort）是对冒泡排序的一种改进。
     * 快速排序的基本思想:通过一趟排序将待排记录分隔成独立的两部分，
     * 其中一部分记录的关键字均比另一部分的关键字小，则可分别对两部分记录继续进行排序，以达到整个序列有序。
     *<1>从数列中跳出一个元素，成为“基准”（pivot）</1>
     * <2>重新排序数列，所有元素比基准值小的摆放在基准前面，
     * 所有元素不比基准值小的摆在基准的后面。
     * 在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区(partition)操作</2>
     * <3>递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序</3>
     *
     * @param toSortList
     * @return
     */
    @Override
    public int[] sort(int[] toSortList) {
        int len = toSortList.length;
        quicksort(toSortList , 0 , len -1);
        return toSortList;
    }

    static void quicksort(int n[], int left, int right) {
        int dp;
        if (left < right) {
                dp = partition(n, left, right);
            quicksort(n, left, dp - 1);
            quicksort(n, dp + 1, right);
        }
    }

    static int partition(int n[], int left, int right) {
        int pivot = n[left];
        while (left < right) {
            while (left < right && n[right] >= pivot)
                right--;
            if (left < right)
                n[left++] = n[right];
            while (left < right && n[left] <= pivot)
                left++;
            if (left < right)
                n[right--] = n[left];
        }
        n[left] = pivot;
        return left;
    }
}
