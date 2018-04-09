package cn.school.thoughtworks.section2;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> result = new LinkedHashMap<>();
        for (String item : collection1) {

            String key = item;
            int length = 1;
            if(key.contains("[")){
                key = item.substring(0,item.indexOf("["));
                length = Integer.parseInt(item.substring(item.indexOf("[")+1,item.lastIndexOf("]")));
            }else if(key.contains(":")){
                key = item.split(":")[0];
                length = Integer.parseInt(item.split(":")[1]);
            }else if(key.contains("-")){
                key = item.split("-")[0];
                length = Integer.parseInt(item.split("-")[1]);
            }
            Integer count = result.get(key);
            if(count == null) count = 0;
            result.put(key,count + length);
        }
        return result;
    }
}
