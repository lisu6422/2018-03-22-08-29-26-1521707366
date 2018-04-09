package cn.school.thoughtworks.section2;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> result = new LinkedHashMap<>();
        for (String item : collection1) {
            Integer count = result.get(item);
            if(count == null) count = 0;
            result.put(item,++count);
        }
        return result;
    }
}
