import sort.BaseSort;
import sort.QuickSort;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int len = 10;
        int[]  list = new int[len] ;
        for(int i = 0 ; i < len ; i++){
            list[i] = ( new Random()).nextInt();
        }
        Long begin = System.currentTimeMillis();
//        BubbleSort.bubbleSort1(list);
//        BubbleSort.bubbleSort2(list);
//        BubbleSort.bubbleSort3(list);
//        SelectionSort.sort.selectionSort(list);
//        InsertionSort.insertionSort1(list);
//        InsertionSort.insertionSort2(list);
        BaseSort sort = new QuickSort();
        sort.sort(list);
        Long end = System.currentTimeMillis();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
        System.out.println("运行时间："+(end - begin)+"\n"+"数组长度："+list.length);
    }
}
