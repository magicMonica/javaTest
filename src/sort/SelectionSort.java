package sort;

/**
 * Created by monica on 2016/9/28.
 */
public class SelectionSort {

    /**
     * 选择排序
     *
     * <1>初始状态：无序区为R[1..n],有序区为空</1>
     * <2>第i趟排序（i=1,2,3...n-1)开始时，当前有序区和无序区分别为R[1...i-1]和R（i..n）
     * 该趟排序从当前无序区中-选出关键字最小的记录R[k],将它与无序区的第一个记录R交换，
     * 使R[1..i]和R[i+1..n]分别变为记录个数增加1个新有序区和记录个数减少1个的新无序区；</2>
     * <3>n-1趟结束，数组有序化了</3>
     *
     * @param toSortList
     * @return
     */
    public static int[] selectionSort(int[] toSortList){
        int len = toSortList.length;
        if (len <= 1) {
            return toSortList;
        }
        int minIndex, temp;
        for (int i = 0; i < len - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (toSortList[j] < toSortList[minIndex]) { //寻找最小的数
                    minIndex = j;                       //将最小数的索引保存
                }
            }
            temp = toSortList[i];
            toSortList[i] = toSortList[minIndex];
            toSortList[minIndex] = temp;
        }
        return toSortList;
    }
}
