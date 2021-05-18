package com.fa.sort;

//归并排序
public class MergeSort {
    public static void main(String[] args) {
        int[] array = {2,3,6,1,9,7,4};
        mergeSort(array,0,array.length-1);
        print(array);
    }

    private static void mergeSort(int[] array, int l, int r) {
        if(l>=r){
            return ;
        }
        int mid = (l+r)>>1;
        mergeSort(array,l,mid);
        mergeSort(array,mid+1,r);
        int[] temp = new int[r-l+1];
        int k = 0,lp = l,rp = mid+1;
        while(lp <= mid || rp <= r){
            if((rp > r)||(lp <= mid && array[lp] <= array[rp])){
                temp[k++] = array[lp++];
            }else{
                temp[k++] = array[rp++];
            }
        }
        for(int i = l;i <= r;i++){
            array[i] = temp[i-l];
        }
        return;
    }

    public static void print(int[] array){
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
    }

}
