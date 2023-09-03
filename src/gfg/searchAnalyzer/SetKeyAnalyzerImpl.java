package gfg.searchAnalyzer;

import java.util.*;

public class SetKeyAnalyzerImpl implements KeyAnalyzer{

    private Set<String> keySet;

    public SetKeyAnalyzerImpl(){
//        keySet= new HashSet<>();
//        keySet= new LinkedHashSet<>();
        keySet= new TreeSet<>(Comparator.reverseOrder());
    }
    @Override
    public void storeKeyword(String key) {
        keySet.add(key);
    }

    @Override
    public List<String> getAllKeywords() {
        List<String> list = new ArrayList<>();
        list.addAll(keySet);
        return list;
    }
}
