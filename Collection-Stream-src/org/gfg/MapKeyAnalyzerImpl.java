package org.gfg;

import java.security.Key;
import java.util.*;

public class MapKeyAnalyzerImpl implements KeyAnalyzer{
    private Map<String, Keyword> hmap;
    private Queue<Keyword> queue;

//Arrays
    public MapKeyAnalyzerImpl(){
//        hmap = new HashMap<>();
        hmap = new LinkedHashMap<>();
        hmap = new TreeMap<>();
//        queue = new PriorityQueue<>(new Comparator<Keyword>() { // specific for one object
//            @Override
//            public int compare(Keyword o1, Keyword o2) {
//                if(o2.getCount()-o1.getCount() >0 ){
//                    return 1;
//                } else if (o2.getCount()-o1.getCount() <0 ) {
//                    return -1;
//                }else {
//                    return 0;
//                }
//            }
//        });
       queue = new PriorityQueue<>();

    }
    @Override
    public void storeKeyword(String key) {
        int count =1;
        if(hmap.containsKey(key)){
            Keyword keyword = hmap.get(key);
            queue.remove(keyword);
            count = keyword.getCount()+1;
            keyword.setCount(count);
            hmap.put(key, keyword);
            queue.add(keyword);
        }else {
           Keyword keyword = new Keyword(key, count);
           hmap.put(key,keyword);
           queue.add(keyword);
        }
    }
    @Override
    public List<String> getAllKeywords() {
        List<String> list = new ArrayList<>();
       for(Map.Entry<String, Keyword> record  : hmap.entrySet()){
           list.add(record.getKey());
       }
       return list;
    }
    @Override
    public Map<String, Keyword> getFrequencies(){
        return hmap;
    }

    @Override
    public List<String> getTopFiveRecords(){
        List<String> list = new ArrayList<>();
        for(int i =0 ;i<=4 ;i++ ){
            list.add(queue.poll().getKey());
        }
        return list;
    }
}
// implement the same code by ur own
// next implementation in the next class
