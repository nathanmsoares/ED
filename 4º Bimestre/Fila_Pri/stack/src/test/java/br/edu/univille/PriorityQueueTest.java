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
        // Execute
        Entry<Integer, String> customer1 = queue.insert(5, "Dor de cabeça");
        Entry<Integer, String> customer6 = queue.insert(5, "Dor de cabeça");
        Entry<Integer, String> customer2 = queue.insert(4, "Dor de Barriga");
        Entry<Integer, String> customer3 = queue.insert(3, "Dor Muscular");
        Entry<Integer, String> customer4 = queue.insert(2, "Dor no Braço");
        Entry<Integer, String> customer5 = queue.insert(1, "Dor de cabeça extrema");
        int teste = 6;
        assertEquals(teste, queue.size());
        assertEquals(customer6, queue.insert(5, "Dor de cabeça"));


    }
    
}
