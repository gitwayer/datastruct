package com.fa.sort;

//冒泡排序
public class PopSort {

    public static void main(String[] args) {
        int[] array = {4,3,2};
        popSort(array);
        print(array);
    }

    /**
     *  相邻元素比较  一趟下来最大值到尾部  第一次 需要比较array.length-1次， 第二次需要比较array.length-2 次   一直到最后2个数比较 这样剩下最后一个就是最小值
     *  因此 （外层循环次数是array.length-1  )   内层循环次数是 array.length-1-i次
     */
    public static int[] popSort(int[] array){
        for(int i = 0;i<array.length-1;i++){
            for(int j = 0;j<array.length-1-i;j++){ //关键点是理解循环次数（外层每循环一次 说明一个最大值就被找出来了，内层循环就减一）
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
        return array;
    }

    public static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void print(int[] array){
        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]+",");
        }
    }
}
