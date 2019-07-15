package com.in28minutes.spring.basics.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // to inject this bean over the other as the two beans with the same types
public class BubbleSortAlgorithm implements  SortAlgorithm {
    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
