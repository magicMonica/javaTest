package sort;

/**
 *
 * Created by monica on 2016/10/8.
 */
public class MergeSort implements BaseSort{
    /**
     * 归并排序
     *
     * <1>把长度为N的输入序列分成两个长度为n/2的子序列</1>
     * <2>对这两个子序列分别采用归并排序</2>
     * <3>将两个排序号的子序列合并成一个最终的排序序列。</3>
     *
     * @param toSortList
     * @return
     */
    @Override
    public int[] sort(int[] toSortList) {
        int len = toSortList.length;
        if(len < 2){
            return toSortList;
        }
        return new int[0];
    }
}
