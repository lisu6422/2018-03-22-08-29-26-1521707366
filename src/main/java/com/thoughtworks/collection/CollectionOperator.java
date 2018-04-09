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
        List<Integer> result = new ArrayList<>();
        for (int i : array) {
            if(i % 2 == 0){
                result.add(i);
            }
        }
        return result;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> result = new ArrayList<>();
        List<Integer> firstList = new ArrayList<>();

        for (int i : firstArray) {
            firstList.add(i);
        }
        for (int i : secondArray) {
            if(firstList.contains(i)){
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> result = new ArrayList<>();

        for (int i : firstArray) {
            result.add(i);
        }
        for (int i : secondArray) {
            if(!result.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}
