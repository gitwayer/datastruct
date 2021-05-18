package com.fa.sort;

// 快排  基准值  分区   基准值的选择对于排序算法效率影响很大
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {5,3,6,1,9,7,4,2,-1,10,8};
        quickSort_v1(array,0,array.length-1);
        print(array);

//        System.out.println(getMid(2,2,4));
    }

    private static void quickSort_v1(int[] array, int l, int r) {
        if(l>=r){
            return;
        }
        int base = array[l];
        //左右指针(下标)
        int lp = l , rp = r;
        //while循环退出条件(下标重合) 一次while循环就是一次分区过程
        while(lp < rp){
            while(lp < rp && array[rp] > base){
                rp--;
            }
            if(lp < rp){
                array[lp++] = array[rp];
            }
            while(lp < rp && array[lp] < base){
                lp++;
            }
            if(lp < rp){
                array[rp--] = array[lp];
            }
        }
        array[lp] = base;
        quickSort_v1(array,l,lp-1);
        quickSort_v1(array,lp+1,r);
        return;
    }

    private static void quickSort_v2(int[] array,int l,int r){
        while(l < r){
            int base = array[l];
            int lp = l,rp = r;
            while(lp < rp){
                while(lp < rp && array[rp] >= base) rp--;
                if(lp < rp) array[lp++] = array[rp];
                while(lp < rp && array[lp] <= base) lp++;
                if(lp < rp) array[rp--] = array[lp];
            }
            array[lp] = base;
            quickSort_v2(array,lp+1,r);
            r = lp - 1;
        }
        return;
    }

    private static void quickSort_v3(int[] array,int l,int r){
        while(l<r){
            int midIndex = (l+r)>>1;
            int base = getMid(array[l],array[r],array[midIndex]);
            System.out.println("midIndex:"+midIndex+" , base:"+base);
            int lp = l,rp = r;
            while(lp < rp){
                while(lp < rp && array[rp] >= base) rp--;
                if(lp < rp) array[lp++] = array[rp];
                while(lp < rp && array[lp] <= base) lp++;
                if(lp < rp) array[rp--] = array[lp];
            }
            array[lp] = base;
            quickSort_v3(array,lp+1,r);
            r = lp - 1;
        }

//        while(l < r){
//            int base = array[l];
//            int lp = l,rp = r;
//            while(lp < rp){
//                while(lp < rp && array[rp] >= base) rp--;
//                if(lp < rp) array[lp++] = array[rp];
//                while(lp < rp && array[lp] <= base) lp++;
//                if(lp < rp) array[rp--] = array[lp];
//            }
//            array[lp] = base;
//            quickSort_v2(array,lp+1,r);
//            r = lp - 1;
//        }
//        return;
        return;
    }

    private static int getMid(int a, int b, int c) {
        System.out.println("a:"+a+",b:"+b+",c:"+c);
        int max = Math.max(Math.max(a,b),c);
        int min = Math.min(Math.min(a,b),c);
        if(a!=max && a!=min){
            return a;
        }else if(b != max && b != min){
            return b;
        }
        return c;
    }


    public static void print(int[] array){
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
    }


}
