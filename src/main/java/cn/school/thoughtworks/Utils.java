package cn.school.thoughtworks;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author likly
 * @version 1.0
 * @date 2018-04-09 15:50
 * @since 1.0
 */
public class Utils {

    public static Map<String,Integer> countKey(List<String> someKeys){
        Map<String,Integer> result = new LinkedHashMap<>();
        for (String item : someKeys) {
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

    public static Map<String,Integer> subKey(Map<String,Integer> countMap,List<String> key,Integer condition){

        for (String item : key) {
            Integer count = countMap.get(item);
            if(count != null){

                if(condition != 1){
                    countMap.put(item,count - (count/condition));
                }else {
                    countMap.put(item,--count);
                }
            }
        }
        return countMap;
    }


}
