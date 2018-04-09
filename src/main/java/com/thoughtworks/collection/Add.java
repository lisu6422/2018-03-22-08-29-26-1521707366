package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("all")
public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {

        int left = leftBorder;
        int right = rightBorder;
        if(left > right){
            left = rightBorder;
            right = leftBorder;
        }

        int count = 0;
        for (int i = left; i <= right; i++) {
            if (i % 2 == 0) {
                count = count + i;
                i++;
            }
        }
        return count;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int left = leftBorder;
        int right = rightBorder;
        if(left > right){
            left = rightBorder;
            right = leftBorder;
        }

        int count = 0;
        for (int i = left; i <= right; i++) {
            if (i % 2 != 0) {
                count = count + i;
                i++;
            }
        }
        return count;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int count = 0;
        for (Integer item:arrayList){
            count += (item * 3 + 2);
        }

        return count;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer > result = new ArrayList<>(arrayList.size());
        for (Integer integer : arrayList) {
            if(integer %2 == 0) {
                result.add(integer);
            }else {
                result.add(integer * 3 + 2);
            }
        }

        return result;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int count = 0;
        for (Integer integer : arrayList) {
            if(integer % 2 != 0){
                count += (integer * 3 + 5);
            }
        }
        return count;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {

        List<Integer> even = new ArrayList<>();
        for (Integer integer : arrayList) {
            if(integer % 2 == 0){
                even.add(integer);
            }
        }


        Collections.sort(even);

        int size = even.size();
        if(size % 2 == 0){
            return (even.get(size/2 - 1) + even.get(size/2)) * 1.0D/2;

        }else {
            return even.get((size+1)/2 -1);
        }

    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        List<Integer> even = new ArrayList<>();
        for (Integer integer : arrayList) {
            if(integer % 2 == 0){
                even.add(integer);
            }
        }

        double sum = 0.0D;
        int count = 0;
        for (Integer integer : even) {
            if(integer % 2 == 0){
                sum+=integer;
                count++;
            }
        }

        return sum/count;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>(arrayList.size());
        for (int i = 0; i < arrayList.size() - 1; i++) {
            result.add((arrayList.get(i) + arrayList.get(i+1)) * 3);
        }
        return result;
    }
}
