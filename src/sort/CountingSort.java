package sort;

/**
 * 计数排序
 * Created by monica on 2016/10/8.
 */
public class CountingSort implements BaseSort {
    /**
     * <1>找出待排序的数组中最大和最小的元素；</1>
     * <2>统计数组中每个值为i的元素出现的次数，存入数组C的第i想；</2>
     * <3>对所有的计数累加（从C中的第一个元素开始，每一项和前一项相加）；</3>
     * <4>反向填充目标数组：将每个元素i放在新数组的第C（i）项，
     * 每放一个元素就将C（i）减去1</4>
     *
     * @param toSortList
     * @return
     */
    @Override
    public int[] sort(int[] toSortList) {
        return new int[0];
    }
}
