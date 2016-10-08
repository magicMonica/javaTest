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
        mergeSort(toSortList,0,len - 1);
        return toSortList;
    }

    public void mergeSort(int[] data ,int left ,int right){
        if(left >= right){
            return;
        }
        // 找出中间索引
        int center = (left + right) / 2;
        // 对左边数组进行递归
        mergeSort(data, left, center);
        // 对右边数组进行递归
        mergeSort(data, center + 1, right);
        // 合并
        merge(data, left, center, right);
    }

    /**
     * 将两个数组进行归并，归并前面2个数组已有序，归并后依然有序
     *
     * @param data
     *            数组对象
     * @param left
     *            左数组的第一个元素的索引
     * @param center
     *            左数组的最后一个元素的索引，center+1是右数组第一个元素的索引
     * @param right
     *            右数组最后一个元素的索引
     */
    public void merge(int[] data, int left, int center, int right){
        // 临时数组
        int[] tmpArr = new int[data.length];
        // 右数组第一个元素索引
        int mid = center + 1;
        // third 记录临时数组的索引
        int third = left;
        // 缓存左数组第一个元素的索引
        int tmp = left;
        while (left <= center && mid <= right) {
            // 从两个数组中取出最小的放入临时数组
            if (data[left] <= data[mid]) {
                tmpArr[third++] = data[left++];
            } else {
                tmpArr[third++] = data[mid++];
            }
        }
        // 剩余部分依次放入临时数组（实际上两个while只会执行其中一个）
        while (mid <= right) {
            tmpArr[third++] = data[mid++];
        }
        while (left <= center) {
            tmpArr[third++] = data[left++];
        }
        // 将临时数组中的内容拷贝回原数组中
        // （原left-right范围的内容被复制回原数组）
        while (tmp <= right) {
            data[tmp] = tmpArr[tmp++];
        }
    }

}
