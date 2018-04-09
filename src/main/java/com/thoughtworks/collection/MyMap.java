package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> result = new ArrayList<>();
        for (Integer integer : array) {
            result.add(integer * 3);
        }
        return result;
    }

    public List<String> mapLetter() {
        List<String> result = new ArrayList<>();
        for (Integer integer : array) {
            result.add(letterList.get(integer - 1));
        }
        return result;
    }

    public List<String> mapLetters() {
        List<String> result = new ArrayList<>();
        for (Integer integer : array) {
            int firstIndex = 0;
            int secondIndex = -1;

            if (integer > letterList.size()) {
                firstIndex = (integer-1) / letterList.size() - 1;
                secondIndex = (integer - 1) % letterList.size();
            } else {
                firstIndex = integer - 1;
            }

            if(secondIndex == -1){
                result.add(letterList.get(firstIndex));
            }else {
                result.add(letterList.get(firstIndex) + letterList.get(secondIndex));
            }



        }
        return result;
    }

    public List<Integer> sortFromBig() {
        List<Integer> result = new ArrayList<>(array);
        Collections.reverse(result);
        return result;
    }

    public List<Integer> sortFromSmall() {
        throw new NotImplementedException();
    }
}
