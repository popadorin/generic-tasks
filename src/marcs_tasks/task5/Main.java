package com.company.generics.task5;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SetHelper setHelper = new SetHelper();
        Set<Integer> set = setHelper.getSet(1, 2, 3, 2);

        for (int element : set) {
            System.out.println(element);
        }
    }
}
