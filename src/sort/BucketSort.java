package sort;

/**
 * 桶排序
 * 工作原理：假设输入数据服从均匀分布，将数据分到有限数量的桶里，
 * 每个桶再分别排序（有可能再使用别的排序算法或是以递归方式继续使用桶排序进行排序）
 * Created by monica on 2016/10/8.
 */
public class BucketSort implements BaseSort{
    /**
     * <1>设置一个定量的数组当做空桶</1>
     * <2>遍历输入数据，并且把数据一个一个放在对应的桶里去；</2>
     * <3>对每个不是空的桶进行排序</3>
     * <4>从不是空的桶里把排好序的数据拼接起来</4>
     *
     * @param toSortList
     * @return
     */
    @Override
    public int[] sort(int[] toSortList) {
        return new int[0];
    }
}
