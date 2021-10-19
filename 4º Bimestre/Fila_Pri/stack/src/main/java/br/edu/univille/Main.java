package br.edu.univille;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // LinkedList<Integer> lista = new LinkedList<>();
        // lista.push(1);
        // lista.push(2);
        // lista.push(3);
        // lista.push(4);
        // lista.push(5);
        // System.out.println("Antes da transformação " + lista.get(2));
        // for (int i = 0; i < lista.size(); i++) {
        //     System.out.println(lista.get(i));
        // }
        // lista.set(2, 32);
        // System.out.println("Depois da transformacao "+ lista.get(2));
        LinkedList<Person> list = new LinkedList<>(Arrays.asList(new Person("Jack", 3), new Person("Mike", 9), new Person("Joao", 10), new Person("Maria", 10)));

        System.out.println("before: " + list);

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o2.score > o1.score) return 1;
                if(o2.score < o1.score) return -1;
                return 0;
            }
        });
        // @Override
        // public int compare(Customer o1, Customer o2) {
        //     if(o1.getKey() > o2.getKey()) return 1;
        //     if(o1.getKey() < o2.getKey()) return -1;
        //     return 0;
        // }

        System.out.println("after: " + list);


        LinkedList<Customer> list1 = new LinkedList<>(Arrays.asList(new Customer(3, "Jack"), new Customer(9, "Mike"), new Customer(10, "Joao"), new Customer(10, "Maria")));

        System.out.println("before: " + list);
        System.out.println("\n\n");
        System.out.println("before: " + list1);

        Collections.sort(list1, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if(o2.getKey() > o1.getKey()) return 1;
                if(o2.getKey() < o1.getKey()) return -1;
                return 0;
            }
        });
        System.out.println("after: " + list1);

        // for (int i = 0; i < args.length; i++) {
        //     if(i == 0) {
        //         list1.addFirst(new Customer(3, "Jack"));
        //     }else if(atual > list1.getLast()){
        //         list1.addLast(new Customer(3, "Jack"));

        //     }else if(list1.get(i-1).getKey() < list1.get(i).getKey() && list1.get(i+1).getKey() > list1.get(i).getKey()) {
        //         list1.add(i, new Customer(3, "Jack"));

        //     }
        // }

    }
}
