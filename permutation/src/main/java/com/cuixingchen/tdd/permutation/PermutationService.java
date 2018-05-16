package com.cuixingchen.tdd.permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by cuipengfei1 on 2018/5/16.
 */
public class PermutationService {
    public static List<String> deal(String input) {
        if (input == null) {
            return null;
        } else if (input.length() == 1) {
            return Arrays.asList(input);
        } else if (input.length() == 2) {
            return Arrays.asList(input, input.substring(1) + input.substring(0, 1));
        } else if (input.length() == 3) {
            ArrayList<String> resultList = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                List<String> funList = deal(input.substring(0, i) + input.substring(i + 1));
                if (funList != null) {
                    for (String funStr : funList) {
                        resultList.add(input.substring(i, i + 1) + funStr);
                    }
                }
            }
            return resultList;
        }
        return null;
    }
}
