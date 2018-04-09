package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.Utils;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。

        return Utils.subKey(collectionA,object.get("value"),3);
    }
}
