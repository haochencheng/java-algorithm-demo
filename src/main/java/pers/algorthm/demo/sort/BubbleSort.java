package pers.algorthm.demo.sort;

import java.util.Arrays;

/**
 * 冒泡排序 时间复杂度 O（log（n））
 * @description:
 * @author: haochencheng
 * @create: 2019-07-24 08:23
 **/
public class BubbleSort {

    public static void main(String[] args) {
        int[] array=new int[]{2,6,21,75,32,8,65,8,20,62};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length-1; j++) {
                if (array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
    }

}
