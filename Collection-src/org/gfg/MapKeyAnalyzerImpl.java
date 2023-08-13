package org.gfg;

import java.util.*;

public class MapKeyAnalyzerImpl implements KeyAnalyzer{
    private Map<String, Integer> hmap;
    private Queue<Keyword> queue;

    public MapKeyAnalyzerImpl(){
//        hmap = new HashMap<>();
//        hmap = new LinkedHashMap<>();
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
        Keyword keyword = new Keyword();
        keyword.setKey(key);
        if(hmap.containsKey(key)){
            int count  = hmap.get(key);
            keyword.setCount(count+1);
            hmap.put(key, hmap.get(key)+1);
        }else {
            keyword.setCount(1);
            hmap.put(key,1);
        }
    }

    @Override
    public List<String> getAllKeywords() {
        List<String> list = new ArrayList<>();
       for(Map.Entry<String, Integer> record  : hmap.entrySet()){
           list.add(record.getKey());
       }
       return list;
    }
    @Override
    public Map<String, Integer> getFrequencies(){
        return hmap;
    }
}
// implement the same code by ur own
// next implementation in the next class
