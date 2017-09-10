package com.company.generics.task5;

import java.util.HashSet;
import java.util.Set;

public class SetHelper {
    public <T> Set<T> getSet(T ...args) {

        Set<T> set = new HashSet<>();
        for (T arg : args) {
            set.add(arg);
        }
        return set;
    }
}
