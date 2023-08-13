package org.gfg;

public class Keyword implements Comparable {
    private String key;

    private int count;
    public Keyword(){}
    public Keyword(String key, int count) {
        this.key = key;
        this.count = count;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int compareTo(Object o) {
        // comparing 2 objects
        // object o and this
        Keyword keyword = (Keyword) o;
        if(keyword.getCount() - this.getCount() > 0){
            return 1;
        }else if (keyword.getCount() - this.getCount() <0){
            return -1;
        }else{
            return 0;
        }
    }
}
