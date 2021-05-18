package com.fa.sort;

//插入排序
public class InsertSort {
    public static void main(String[] args) {
        int[] array = {2,3,6,1,9,7,4};
        insertSort(array);
        print(array);
    }

    /**
     *  从第二个元素开始，与前一个元素比较 如果小于前一个元素 交换2个元素的位置 同时递减 交替比较
     */
    public static int[] insertSort(int[] array){
        for(int i = 1;i<array.length;i++){
            int j = i;//j为待排序的元素  0 ~ j-1为有序元素
            while(j>0&&array[j]<array[j-1]){
                swap(array,j,j-1);
                j--;
            }

        }
        return array;
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
