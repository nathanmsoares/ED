package br.edu.univille;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PriorityQueueTest {

    @Test
    public void TestsOnPriorityQueue(){
        PriorityQueue queue = new PriorityQueue();
        // Execute
        Entry<Integer, String> customer6 = queue.insert(5, "Dor de cabeça");
        Entry<Integer, String> customer5 = queue.insert(5, "Dor de cabeça");
        Entry<Integer, String> customer4 = queue.insert(4, "Dor de Barriga");
        Entry<Integer, String> customer3 = queue.insert(3, "Dor Muscular");
        Entry<Integer, String> customer2 = queue.insert(2, "Dor no Braço");
        Entry<Integer, String> customer0 = queue.insert(1, "Dor de cabeça extrema");
        Entry<Integer, String> customer1 = queue.insert(1, "Dor de cabeça média/extrema");
        int firstSize = 7;
        assertEquals(firstSize, queue.size());
        assertTrue(!queue.isEmpty());

        assertEquals(customer0, queue.min());
        assertEquals(customer0, queue.removeMin());

        assertEquals(customer1, queue.min());
        assertEquals(customer1, queue.removeMin());

        assertEquals(customer2, queue.min());
        assertEquals(customer2, queue.removeMin());

        assertEquals(customer3, queue.min());
        assertEquals(customer3, queue.removeMin());

        assertEquals(customer4, queue.min());
        assertEquals(customer4, queue.removeMin());

        assertEquals(customer6, queue.min());
        assertEquals(customer6, queue.removeMin());

        assertEquals(customer5, queue.min());
        assertEquals(customer5, queue.removeMin());
        int lastSize = 0;
        assertEquals(lastSize, queue.size());

        assertThrows(NullPointerException.class, () -> {
            new PriorityQueue().min();
        });
        
        assertThrows(NullPointerException.class, () -> {
            new PriorityQueue().removeMin();
          });         

    }
    
}
