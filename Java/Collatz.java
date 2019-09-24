/*
 *   Copyright (c) 2019 Bárbara Anger
 *   All rights reserved.
 *   This algorithm consists in the Collatz calculation, which is
 *   if a number is even you divide it by two,
 *   if a number is odd you multiply it by three and adds 1.
 *   Feel free too check this code and to refactor it in your own computer.
 *   I don't accept alterations in this repo whatsoever without my permission.
 */

import java.util.ArrayList;
import java.util.List;

class Collatz {
    public static void main(String[] args) {
        int n = 1000000;
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while(n > 1) {
            if (n % 2 == 0) {
                n /= 2;
                list.add(n);
            }
            else {
                n = (3 * n) + 1;
                list.add(n);
            }
        }
       list.forEach(System.out::println);
    }
}
