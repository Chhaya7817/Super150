import java.util.Random;

import java.util.*;
//average complexity nlog(n)
public class Randomise_Quick_Sort {
    public static void main(String[] args) {
        int low=10;
        int high=100;
        Random r=new Random();
        for (int i = 0; i < 40; i++) {
            int rn=r.nextInt(high-low+1)+low;
            System.out.println(rn+" ");
        }
    }
    public static void sort(int [] arr,int si,int ei) {
        if(si>ei)
        {
            return;
        }
        int pi=partition(arr, si, ei);
        sort(arr, si,pi-1);
        sort(arr, pi+1, ei);
        
    }
    public static int partition(int[] arr,int si,int ei) {
        int item=arr[ei];
        int pi=si;
        for (int i = si; i < ei; i++) {
            if(arr[i]<item)
            {
                int temp=arr[i];
                arr[i]=arr[pi];
                arr[pi]=temp;
                pi++;
            }
        }
        int temp=arr[ei];
        arr[ei]=arr[pi];
        arr[pi]=temp;
        return pi;
    }
    public static void swap(int[] arr,int si,int ei) {
        Random r=new Random();
        int ind=r.nextInt(ei-si+1)+si;
        int temp=arr[idx];
        arr[idx]=arr[ei];
        arr[ei]=temp;
        
    }
}
