package sort;

/**
 * Created by monica on 2016/9/29.
 */
public class InsertionSort {


    /**
     * 插入排序--未优化版
     * <1>.从第一个元素开始，该元素可以认为已经被排序；</1>
     * <2>.取出下一个元素，在已经排序的元素序列中从后向前扫描</2>
     * <3>.如果该元素（已排序）大于新元素，将该元素移动到下一位置</3>
     * <4>.重复步骤3，直到找到一排序的元素小于或者等于新元素的位置；</4>
     * <5>.将新元素插入到该位置后；</5>
     * <6>.重复步骤2~5</6>
     *
     * @param toSortList
     * @return
     */
    public static int[] insertionSort1(int[] toSortList){
        int len = toSortList.length;
        if(len <= 1){
            return toSortList;
        }
        for (int i = 1; i < len; i++) {
            int key = toSortList[i];   //取出下一个元素
            int j = i - 1;
            while (j >= 0 && toSortList[j] > key) { //在已经排序的元素序列中从后向前扫描
                toSortList[j + 1] = toSortList[j]; //将该元素移动到下一位置
                j--;
            }
            toSortList[j + 1] = key;
        }
        return toSortList;
    }

    /**
     * 插入排序--优化版
     * 查找插入位置时使用二分查找的方式
     *
     * @param toSortList
     * @return
     */
    public static int[] insertionSort2(int[] toSortList) {
        int len = toSortList.length;
        if (len <= 1) {
            return toSortList;
        } else {
            for (int i = 1; i < len; i++) {
                int key = toSortList[i];
                int left = 0;
                int right = i - 1;
                while (left <= right){
                    int middle = (left + right) /2;
                    if(key < toSortList[middle]){
                        right = middle - 1;
                    }else{
                        left = middle + 1;
                    }
                }
                for (int j = i-1; j >= left ; j--) {
                    toSortList[j + 1] = toSortList[j];
                }
                toSortList[left] = key;
            }
        }
        return toSortList;
    }
}
