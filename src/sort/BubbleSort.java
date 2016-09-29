package sort;

/**
 * Created by monica on 2016/9/28.
 */
public class BubbleSort {
    /**
     * 冒泡排序 --未优化版
     * <1>比较相邻的元素。如果第一个比第二个大，就交换它们两个</1>
     * <2>对每一对相邻元素做同样的工作，从开始第一对到结尾最后一对，这样在最后的元素应该是最大的数</2>
     * <3>针对所有的元素重复以上的步骤，除了最后一个</3>
     * <4>重复步骤1~3，直到排序完成</4>
     *
     * @param toSortList
     * @return
     */
    public static int[] bubbleSort1(int[] toSortList){
        int len = toSortList.length;
        if(len <= 1){
            return toSortList;
        }else{
            for(int i = 0 ; i < len ;i ++ ){
                for(int j = 0 ; j < len - i - 1 ;j++){
                    if (toSortList[j] > toSortList[j + 1]) {
                        int temp = toSortList[j];
                        toSortList[j] = toSortList[j + 1];
                        toSortList[j + 1] = temp;
                    }
                }
            }
        }
        return toSortList;
    }

    /**
     * 冒泡排序--优化版1
     *
     * 设置一标志性变量pos，用于记录每趟排序中最后一次进行交换的位置。
     * 由于pos位置之后的记录均已交换到位，故在进行下一趟排序时只要扫描到pos位置即可
     *
     * @param toSortList
     * @return
     */
    public static int[] bubbleSort2(int[] toSortList){
        int len = toSortList.length;
        if(len <= 1){
            return toSortList;
        }else{
            int i = len - 1; //初始时，最后位置保持不变
            while (i > 0){
                int pos = 0; //每趟开始时，无记录交换
                for(int j = 0 ; j < i ; j++){
                    if(toSortList[j] > toSortList[j+1]){
                        int temp = toSortList[j];
                        toSortList[j] = toSortList[j+1];
                        toSortList[j+1] = temp;
                        pos = j;//记录交换的位置
                    }
                }
                i=pos;//为下一趟排序做准备
            }
        }
        return toSortList;
    }

    /**
     * 冒泡排序--优化版二
     *
     * 利用在每趟排序中进行正向和反向两边冒泡的方法一次可以得到两个最终值（最大值和最小值）
     * 从而使排序趟数几乎减少了一般
     *
     * @param toSortList
     * @return
     */
    public static int[] bubbleSort3(int[] toSortList){
        int len = toSortList.length;
        if(len <= 1){
            return toSortList;
        }else{
            int low = 0;
            int high = len - 1;
            int tmp ,j;
            while (low < high){
                for(j =low ; j < high ; j++){ //正向冒泡，找到最大值
                    if(toSortList[j] > toSortList[j+1]){
                        tmp = toSortList[j];
                        toSortList[j] = toSortList[j+1];
                        toSortList[j+1] = tmp;
                    }
                }
                high--;
                for(j = high ; j > low ; j--){
                    if(toSortList[j] < toSortList[j-1]){
                        tmp = toSortList[j];
                        toSortList[j] = toSortList[j-1];
                        toSortList[j-1] = tmp;
                    }
                }
                low++;
            }
        }
        return toSortList;
    }

}
