package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> result = new ArrayList<>();
        for (Integer integer : array) {
            if(integer % 2 == 0){
                result.add(integer);
            }
        }
        return result;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> result = new ArrayList<>();
        for (Integer integer : array) {
            if(integer % 3 == 0){
                result.add(integer);
            }
        }
        return result;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        throw new NotImplementedException();
    }

    public List<Integer> getDifferentElements() {
        return new ArrayList<>(new HashSet<>(array));
    }
}