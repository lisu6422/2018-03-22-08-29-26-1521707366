package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {

        List<Integer> result = new ArrayList<>();

        int min = Math.min(left, right);
        int max = Math.max(left, right);

        for(int i = min; i <= max; i++){
            result.add(i);
        }

        if(left > right){
            Collections.reverse(result);
        }

        return result;

    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> result = new ArrayList<>();

        int min = Math.min(left, right);
        int max = Math.max(left, right);

        for(int i = min; i <= max; i++){
            if(i % 2 == 0) {
                result.add(i);
                i++;
            }
        }

        if(left > right){
            Collections.reverse(result);
        }

        return result;
    }

    public List<Integer> popEvenElments(int[] array) {
        throw new NotImplementedException();
    }

    public int popLastElment(int[] array) {
        throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
