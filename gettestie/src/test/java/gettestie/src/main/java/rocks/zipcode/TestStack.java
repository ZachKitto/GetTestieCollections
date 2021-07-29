package gettestie.src.main.java.rocks.zipcode;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    Stack<String> stack = new Stack<>();

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack_PushAndPeek() {
        // Given
        String expectedElement = "Hello world";
        Integer expectedNumberOfElements = 2;

        // When
        stack.push("First element inserted");
        stack.push(expectedElement);
        String actualElement = stack.peek();
        Integer actualNumberOfElements = stack.size();

        // Then
        assertEquals(expectedElement, actualElement);
        assertEquals(expectedNumberOfElements, actualNumberOfElements);
    }

    @org.junit.Test
    public void TestStack_Empty() {
        // Given
        String expected = "Hello world";

        // When
        stack.push(expected);
        stack.pop();

        // Then
        assertTrue(stack.empty());
    }

    @org.junit.Test
    public void TestStack_PushAndPop() {
        // Given
        String expectedElement = "Hello world";
        Integer expectedNumberOfElements = 1;

        // When
        stack.push("First element inserted");
        stack.push(expectedElement);
        String actualElement = stack.pop();
        Integer actualNumberOfElements = stack.size();

        // Then
        assertEquals(expectedElement, actualElement);
        assertEquals(expectedNumberOfElements, actualNumberOfElements);
    }

    // Make a bigger test exercising more Stack methods.....
}
