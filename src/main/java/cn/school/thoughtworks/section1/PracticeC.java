package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> result = new ArrayList<>();
        collection2.forEach((key,list)->{
            for (String item : collection1) {
                if(list.contains(item)){
                    result.add(item);
                }
            }
        });
        return result;
    }
}
