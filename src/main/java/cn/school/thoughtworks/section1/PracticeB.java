package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。

        List<String> result = new ArrayList<>();
        for(List<String> list : collection2){
            for (String item : collection1) {
                if(list.contains(item)){
                    result.add(item);
                }
            }
        }
        return result;
    }
}
