package br.edu.univille;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class PriorityQueue{

    LinkedList<Customer> list  = new LinkedList<>();

    public int size(){
        // O(1)
        System.out.println(list.size());
        return list.size();
    }

    public boolean isEmpty(){
        // O(1)
        return list.isEmpty();
    }

    public Entry<Integer, String> min() throws NullPointerException{
        // O(1)
        Entry<Integer, String> temp =  list.peekFirst();
        if(temp == null){
            throw new NullPointerException("Empty ");

        } else {
            return temp;
        }
    }

    public Entry<Integer, String> insert(Integer key, String value){
        // O(n*log(n))

        Customer newCustomer = new Customer(key, value);
        if(list.size() == 0) {
            list.addFirst(newCustomer);
            return newCustomer;
        } else {
            list.add(newCustomer);
            Collections.sort(list, new Comparator<Customer>() {
                @Override
                public int compare(Customer o1, Customer o2) {
                    if(o2.getKey() > o1.getKey()) return -1;
                    if(o2.getKey() < o1.getKey()) return 1;
                    return 0;
                }
            });
            return newCustomer;
        }
    }

    public Entry<Integer, String> removeMin() throws NullPointerException{
        // O(1)
        if (list.size() == 0){
            throw new NullPointerException();
        } else {
            return list.poll();
        }
    }

    
}
