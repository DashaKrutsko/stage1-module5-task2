package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return arg -> {
            List<Integer> newlist = new ArrayList<>();
            for (Integer number : arg) {
                newlist.add(number / divider);
            }
            return newlist;
        };
    }
}
