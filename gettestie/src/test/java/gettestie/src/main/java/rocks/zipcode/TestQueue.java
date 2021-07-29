package gettestie.src.main.java.rocks.zipcode;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestQueue {

    Queue<String> linkedList = new LinkedList<>();
    Queue<String> priorityQueue = new PriorityQueue<>();

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestLinkedList() {
        // Given
        String expectedElement1 = "Hello world";
        String expectedElement2 = "Hello earth";
        String expectedElement3 = "Hello universe";
        Integer expectedNumberOfElementsAfterThreeAdds = 3;
        Integer expectedNumberOfElementsAfterThreeAddsAndOneRemove = 2;

        // When
        linkedList.add(expectedElement1);
        linkedList.add(expectedElement2);
        linkedList.add(expectedElement3);
        String actualElement1 = linkedList.element();
        Integer actualNumberOfElementsAfterThreeAdds = linkedList.size();
        linkedList.remove(expectedElement3);
        Integer actualNumberOfElementsAfterThreeAddsAndOneRemove = linkedList.size();
        linkedList.clear();

        // Then
        assertEquals(expectedNumberOfElementsAfterThreeAdds, actualNumberOfElementsAfterThreeAdds);
        assertEquals(expectedNumberOfElementsAfterThreeAddsAndOneRemove, actualNumberOfElementsAfterThreeAddsAndOneRemove);
        assertEquals(expectedElement1, actualElement1);
        assertTrue(linkedList.isEmpty());
    }

    @org.junit.Test
    public void TestPriorityQueue() {
        // Given
        String expectedElement1 = "Hello world";
        String expectedElement2 = "Hello earth";
        String expectedElement3 = "Hello universe";
        Integer expectedNumberOfElementsAfterThreeAdds = 3;
        Integer expectedNumberOfElementsAfterThreeAddsAndOneRemove = 2;

        // When
        priorityQueue.add(expectedElement1);
        priorityQueue.add(expectedElement2);
        priorityQueue.add(expectedElement3);
        String actualElement2 = priorityQueue.element();
        Integer actualNumberOfElementsAfterThreeAdds = priorityQueue.size();
        priorityQueue.remove(expectedElement3);
        Integer actualNumberOfElementsAfterThreeAddsAndOneRemove = priorityQueue.size();
        priorityQueue.clear();

        // Then
        assertEquals(expectedNumberOfElementsAfterThreeAdds, actualNumberOfElementsAfterThreeAdds);
        assertEquals(expectedNumberOfElementsAfterThreeAddsAndOneRemove, actualNumberOfElementsAfterThreeAddsAndOneRemove);
        assertEquals(expectedElement2, actualElement2);
        assertTrue(priorityQueue.isEmpty());
    }
}
