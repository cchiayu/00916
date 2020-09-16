package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
            int row=0;
        for (int i = 1; i <= 100; i++) {
            boolean b = true;

            if (i != 1) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        b = false;
                        break;
                    }
                }
                if (b) {
                    System.out.printf("%d ",i);
                    row=row+1;
                }
                if (row==5){
                    System.out.println();
                    row=0;

                }
            }

        }
    }
}
