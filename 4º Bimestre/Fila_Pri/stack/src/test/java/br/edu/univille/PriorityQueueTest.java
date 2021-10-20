package br.edu.univille;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PriorityQueueTest {
        /*
        * We will setup the environment for the next tests.
        */
    @Test
    public void settingUp(){
        /*
        * We will setup the environment for the next tests.
        */
        PriorityQueue queue = new PriorityQueue();
        Customer customer1 = new Customer(5, "Dor de cabeça");
        Customer customer2 = new Customer(3, "Dor de cabeça");
        Customer customer3 = new Customer(2, "Dor de cabeça");
        Customer customer4 = new Customer(1, "Dor de cabeça");
        Customer customer5 = new Customer(4, "Dor de cabeça");
        // Execute
        queue.insert(5, "Dor de cabeça");
        queue.insert(4, "Dor de Barriga");
        queue.insert(3, "Dor Muscular");
        queue.insert(2, "Dor no Braço");
        queue.insert(1, "Dor de cabeça extrema");
        Integer teste = 5;
        assertEquals(5, queue.size());


    }
    
}
