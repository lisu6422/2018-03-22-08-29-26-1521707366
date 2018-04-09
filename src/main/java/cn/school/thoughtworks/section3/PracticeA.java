package cn.school.thoughtworks.section3;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        final List<String> list = object.get("value");
        for (String item : list) {
            Integer count = collectionA.get(item);
            if(count != null){
                collectionA.put(item,--count);
            }
        }
        return collectionA;
    }
}
