package gettestie.src.main.java.rocks.zipcode;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.Assert.assertEquals;

public class TestDeque {

    Deque<String> arrayDeque = new ArrayDeque<>();

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestDeque() {
        // Given
        String expectedElement1 = "Hello world";
        String expectedElement2 = "Hello earth";
        String expectedElement3 = "Hello universe";
        Integer expectedNumberOfElements = 1;

        // When
        arrayDeque.add(expectedElement1);
        arrayDeque.addLast(expectedElement2);
        arrayDeque.addFirst(expectedElement3);
        String actualElement3 = arrayDeque.removeFirst();
        String actualElement2 = arrayDeque.removeLast();
        Integer actualNumberOfElements = arrayDeque.size();

        // Then
        assertEquals(expectedElement3, actualElement3);
        assertEquals(expectedElement2, actualElement2);
        assertEquals(expectedNumberOfElements, actualNumberOfElements);
    }
}
