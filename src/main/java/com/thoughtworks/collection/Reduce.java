package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        List<Integer> list = new ArrayList<>(arrayList);
        Collections.sort(list);
        Collections.reverse(list);
        return list.get(0);
    }

    public double getMinimum() {
        List<Integer> list = new ArrayList<>(arrayList);
        Collections.sort(list);
        return list.get(0);
    }

    public double getAverage() {
        int count = 0;
        for (Integer integer : arrayList) {
            count+=integer;
        }
        return count * 1.0D / arrayList.size();
    }

    public double getOrderedMedian() {
        throw new NotImplementedException();
    }

    public int getFirstEven() {
        throw new NotImplementedException();
    }

    public int getIndexOfFirstEven() {
        throw new NotImplementedException();
    }

    public boolean isEqual(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        throw new NotImplementedException();
    }

    public int getLastOdd() {
        throw new NotImplementedException();
    }

    public int getIndexOfLastOdd() {
        throw new NotImplementedException();
    }
}
