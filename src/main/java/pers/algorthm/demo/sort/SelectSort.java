package pers.algorthm.demo.sort;

import java.util.Arrays;

/**
 * 选择排序
 * @description:
 * @author: haochencheng
 * @create: 2019-07-24 08:33
 **/
public class SelectSort {

    public static void main(String[] args) {
        int[] array=new int[]{2,6,21,75,32,8,65,8,20,62};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectSort(int[] array){
        int tmp,index;
        for (int i = 0; i < array.length; i++) {
            index=i;
            tmp=array[i];
            for (int j = i+1; j < array.length; j++) {
                if (array[j]<tmp){
                    index=j;
                    tmp=array[j];
                }
            }
            if (i!=index){
                System.out.printf("{%d}={%d},{%d}={%d}交换\ne",i,array[i],index,array[index]);
                tmp = array[i];
                array[i]=array[index];
                array[index]=tmp;
            }
        }
    }

}
