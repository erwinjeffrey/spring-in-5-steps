package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") //not good practice
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    @Autowired  // this is autowing by type(this inject by setter if you specify none constructor or setter)
    @Qualifier("quick") // when you have two bean with the same type,use qualifier
    // in order for the container to know witch bean to choose
    private SortAlgorithm sortAlgorithm; // autowire by type

    //private SortAlgorithm quickSortAlgorithm; // autowire by name(the same name as the class)


    public int binarySearch(int[] numbers, int numberToSearchFor){
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        return 3;
    }
}
