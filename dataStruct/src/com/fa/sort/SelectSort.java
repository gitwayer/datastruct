package com.fa.sort;

//选择排序
public class SelectSort {

    public static void main(String[] args) {
        int[] array = {2,3,6,1,9,7,4};
        selectSort(array);
        print(array);
    }

    /**
     * 每一趟找出最值  eg 最大值 然后交换 最大值与未排序的最后一个元素的位置
     * @param array
     */
    public static void selectSort(int[] array){
        for(int i = 0;i<array.length-1;i++){
            int index = 0;
            for(int j = 0;j<array.length-i;j++){
                if(array[index] < array[j]){
                    index = j;
                }
            }
            swap(array,index,array.length-1-i);
        }
    }

    public static void swap(int[] array,int i,int j){
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void print(int[] array){
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
    }


}
