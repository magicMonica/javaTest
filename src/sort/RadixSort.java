package sort;

/**
 * 基数排序 是按照低位先排序，然后收集；在按照高位排序，然后再收集；
 * 依次类推，直到最高位。有时候有些属性是有优先级顺序的，先按低优先级排序，
 * 再按高优先级排序，最后的次序就是高优先级高的在前，高优先级相同的低优先级高的在前。
 * 基数排序基于分别排序，分别收集，所以是稳定的。
 *
 * Created by monica on 2016/10/8.
 */
public class RadixSort implements BaseSort {
    /**
     *
     * <1>取得数组中的最大数，并取得位数；</1>
     * <2>arr为原始数组，从最低位开始取每个位组成radix数组</2>
     * <3>对radix进行计数排序（利用计数排序适用于小范围数的特点）</3>
     *
     * @param toSortList
     * @return
     */
    @Override
    public int[] sort(int[] toSortList) {
        return new int[0];
    }
}
