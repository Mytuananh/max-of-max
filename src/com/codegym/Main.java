package com.codegym;

public class Main {

    public static void main(String[] args) {
	int[] a = {1,3,4,6};
    int[] b = {2,4,6,8,5};
    MaxMax(a, b);
    }
    public static int MaxMax(int[] a, int[] b) {
        int max1 = a[0];
        int max2 = b[0];


        for (int i = 0; i < a.length ; i++) {
            if (max1 < a[i]) {
                max1 = a[i];
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (max2< b[i]) {
                max2 = b[i];
            }
        }
        if (max1 > max2) {
            return max1;
        } else {
            return max2;
        }

    }
}
