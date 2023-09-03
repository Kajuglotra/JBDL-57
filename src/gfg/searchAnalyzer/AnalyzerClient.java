package gfg.searchAnalyzer;

public class AnalyzerClient {
    public static void main(String[] args) {
        KeyAnalyzer keyAnalyzer = new MapKeyAnalyzerImpl();
        keyAnalyzer.storeKeyword("pen");
        keyAnalyzer.storeKeyword("pencil");
        keyAnalyzer.storeKeyword("pen");
        keyAnalyzer.storeKeyword("pencil");
        keyAnalyzer.storeKeyword("shirt");
        keyAnalyzer.storeKeyword("button");
        keyAnalyzer.storeKeyword("chain");
        keyAnalyzer.storeKeyword("bottle");
        keyAnalyzer.storeKeyword("chain");
        keyAnalyzer.storeKeyword("chain");
        keyAnalyzer.storeKeyword("pen");

        System.out.println(keyAnalyzer.getFrequencies()); // key, value
        System.out.println(keyAnalyzer.getTopFiveRecords());

    }
}
// comparator
// comparable

// list, map , set , priority queue (sorting on an cutom object ) min heap, max heap
