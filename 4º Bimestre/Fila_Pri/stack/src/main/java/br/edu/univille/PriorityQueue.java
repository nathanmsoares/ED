package br.edu.univille;

import java.util.LinkedList;

public class PriorityQueue<K, V>{

    LinkedList<Customer> list  = new LinkedList<>();

    public int size(){
        // O(1)
        return list.size();
    }

    public boolean isEmpty(){
        // O(1)

        return list.isEmpty();
    }

    public Entry<Integer, String> min(){
        // O(1)
        return list.peek();
    }

    public Entry<Integer, String> insert(Integer key, String value){
        // O(n²)
        // On line 36 we will have to do a loop twice, so in the worst case, we will have O(n²)
        Customer newCustomer = new Customer(key, value);
        for (int i = 0; i < list.size(); i++) {
            if(list.size() == 0) {
                list.addFirst(newCustomer);
                return newCustomer;
            }else if(newCustomer.getKey() >= list.getLast().getKey()){
                list.addLast(newCustomer);
                return newCustomer;
            }else if(list.get(i-1).getKey() < newCustomer.getKey() && list.get(i+1).getKey() > newCustomer.getKey()) {
                list.add(i, newCustomer);
                return newCustomer;
            }
        }
        // Entry<Integer, String> temp = newCustomer;
        return newCustomer;
        // return new Entry<K, V>;
    }

    public Entry<Integer, String> removeMin(){
        // O(1)
        return list.poll();
    }

    
}
