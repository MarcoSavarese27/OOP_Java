package Esercizi;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int dim = (int) (Math.random() * 10);
        int[] c = new int[dim];
        for(int i = 0; i < c.length; ++i){
            c[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(c));
        Funz(c);
        System.out.println(Arrays.toString(c));
    }

    static void Funz(int[] c) {
        int tmp;
        int dim = c.length - 1;
        for (int i = 0; i < (c.length-1); ++i) {
            for(int j = 0; j < dim; ++j){
                if (c[j] > c[j + 1]){
                    tmp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = tmp;
                }
            }
            --dim;
        }
    }

}

