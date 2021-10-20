package br.edu.univille;

import java.util.Comparator;

public class Customer implements Entry<Integer, String>, Comparator<Customer>{

    private Integer key;
    private String value;


    public Customer(Integer key, String value) {
        this.key = key;
        this.value = value;
    }


    public Integer getKey() {
        return key;
    }


    public void setKey(Integer key) {
        this.key = key;
    }


    @Override
    public String toString() {
        return "Customer [key=" + key + ", value=" + value + "]";
    }


    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public int compare(Customer o1, Customer o2) {
        if(o2.getKey() > o1.getKey()) return 1;
        if(o2.getKey() < o1.getKey()) return -1;
        return 0;
    }
}
