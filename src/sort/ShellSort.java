package sort;

/**
 * Created by monica on 2016/10/8.
 */
public class ShellSort implements BaseSort {

    /**
     * 先将整个待排序的记录序列分割成为若干子序列分别惊醒直接插入排序
     * <1>选择一个增量序列t1,t2,...,tk,其中ti>tj,tk=1</1>
     * <2>按增量序列个数K，对序列进行K趟排序</2>
     * <3>每趟排序，根据对应的增量ti,将待排序列分割成若干长度为M的子序列，
     * 分别对各子表进行直接插入排序。仅增量因子为1时，整个序列作为一个表处理，
     * 表长度即为整个序列的长度</3>
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
        int temp ,gap = 1, j;
        while (gap < len /5) {
            gap = gap * 5 + 1;
        }
        for(;gap > 0; gap = gap/5){
            for(int i = gap ;i < len ; i++){
                temp = toSortList[i];
                for(j = i - gap; j >= 0 && toSortList[j] > temp ; j-=gap ){
                    toSortList[j+gap] = toSortList[j];
                }
                toSortList[j+gap] = temp;
            }
        }
        return toSortList;
    }

}
