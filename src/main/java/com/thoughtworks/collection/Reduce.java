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
            count += integer;
        }
        return count * 1.0D / arrayList.size();
    }

    public double getOrderedMedian() {
        List<Integer> list = new ArrayList<>(arrayList);

        Collections.sort(list);

        int size = list.size();
        if (size % 2 == 0) {
            return (list.get(size / 2 - 1) + list.get(size / 2)) * 1.0D / 2;

        } else {
            return list.get((size + 1) / 2 - 1);
        }
    }

    public int getFirstEven() {
        for (Integer integer : arrayList) {
            if(integer % 2 == 0) return integer;
        }

        return 0;
    }

    public int getIndexOfFirstEven() {
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) % 2 == 0) return i;
        }

        return -1;
    }

    public boolean isEqual(List<Integer> arrayList) {
        if(this.arrayList.size() != arrayList.size()) return false;

        for (int i = 0; i < arrayList.size(); i++) {
            if(this.arrayList.get(i) != arrayList.get(i)) return false;
        }

        return true;



    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {

        for (Integer integer : arrayList) {
            singleLink.addTailPointer(integer);
        }

        List<Integer> list = new ArrayList<>(arrayList);

        singleLink.getNode(6);
        singleLink.getNode(7);
//        singleLink.addTailPointer(10);
//        Collections.sort(list);

        int size = list.size();
        if (size % 2 == 0) {
            return (list.get(size / 2 - 1) + list.get(size / 2)) * 1.0D / 2;

        } else {
            return list.get((size + 1) / 2 - 1) * 1.0D;
        }
    }

    public int getLastOdd() {
        for (int i = arrayList.size() - 1; i >=0; i--) {
            if(arrayList.get(i) %2 != 0) return arrayList.get(i);
        }

        return -1;
    }

    public int getIndexOfLastOdd() {
        for (int i = arrayList.size() - 1; i >=0; i--) {
            if(arrayList.get(i) %2 != 0) return i;
        }

        return -1;
    }
}
