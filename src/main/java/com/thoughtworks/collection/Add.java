package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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
        throw new NotImplementedException();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
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
        throw new NotImplementedException();
    }
}
