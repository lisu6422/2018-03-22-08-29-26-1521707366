package cn.school.thoughtworks.section1;

import java.util.*;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。

        List<String> result = new ArrayList<>();
        Set<String> set = new HashSet<>(collection2);
        for(String item : collection1){
            if(set.contains(item)){
                result.add(item);
            }
        }

        return result;
    }
}
