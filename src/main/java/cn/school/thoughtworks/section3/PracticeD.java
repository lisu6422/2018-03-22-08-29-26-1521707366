package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.Utils;

import java.util.List;
import java.util.Map;

public class PracticeD {

    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。

        return Utils.subKey(Utils.countKey(collectionA),object.get("value"),3);
    }
}
