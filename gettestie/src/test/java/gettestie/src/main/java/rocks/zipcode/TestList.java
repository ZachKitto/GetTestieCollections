package gettestie.src.main.java.rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestList {

    List<String> arrayList = new ArrayList<>();
    List<String> vector = new Vector<>();

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestArrayList() {
        // Given
        String expectedElement1 = "Hello world";
        String expectedElement2 = "Hello earth";
        String expectedElement3 = "Hello universe";
        Integer expectedNumberOfElementsAfterThreeAdds = 3;
        Integer expectedNumberOfElementsAfterThreeAddsAndOneRemove = 2;

        // When
        arrayList.add(expectedElement1);
        arrayList.add(expectedElement2);
        arrayList.add(expectedElement3);
        String actualElement2 = arrayList.get(1);
        Integer actualNumberOfElementsAfterThreeAdds = arrayList.size();
        arrayList.remove(expectedElement3);
        Integer actualNumberOfElementsAfterThreeAddsAndOneRemove = arrayList.size();
        arrayList.clear();

        // Then
        assertEquals(expectedNumberOfElementsAfterThreeAdds, actualNumberOfElementsAfterThreeAdds);
        assertEquals(expectedNumberOfElementsAfterThreeAddsAndOneRemove, actualNumberOfElementsAfterThreeAddsAndOneRemove);
        assertEquals(expectedElement2, actualElement2);
        assertTrue(arrayList.isEmpty());
    }

    @org.junit.Test
    public void TestVector() {
        // Given
        String expectedElement1 = "Hello world";
        String expectedElement2 = "Hello earth";
        String expectedElement3 = "Hello universe";
        Integer expectedNumberOfElementsAfterThreeAdds = 3;
        Integer expectedNumberOfElementsAfterThreeAddsAndOneRemove = 2;

        // When
        vector.add(expectedElement1);
        vector.add(expectedElement2);
        vector.add(expectedElement3);
        String actualElement2 = vector.get(1);
        Integer actualNumberOfElementsAfterThreeAdds = vector.size();
        vector.remove(expectedElement3);
        Integer actualNumberOfElementsAfterThreeAddsAndOneRemove = vector.size();
        vector.clear();

        // Then
        assertEquals(expectedNumberOfElementsAfterThreeAdds, actualNumberOfElementsAfterThreeAdds);
        assertEquals(expectedNumberOfElementsAfterThreeAddsAndOneRemove, actualNumberOfElementsAfterThreeAddsAndOneRemove);
        assertEquals(expectedElement2, actualElement2);
        assertTrue(vector.isEmpty());
    }

    @org.junit.Test
    public void TestIterator() {
        // Given
        String expectedElement1 = "Hello world";
        String expectedElement2 = "Hello earth";
        String expectedElement3 = "Hello universe";

        // When
        arrayList.add(expectedElement1);
        arrayList.add(expectedElement2);
        arrayList.add(expectedElement3);
        Iterator<String> iterator = arrayList.iterator();
        String actualElement1 = iterator.next();
        String actualElement2 = iterator.next();
        String actualElement3 = iterator.next();

        // Then
        assertEquals(expectedElement1, actualElement1);
        assertEquals(expectedElement2, actualElement2);
        assertEquals(expectedElement3, actualElement3);
    }

    @org.junit.Test
    public void TestComparable() {
        // Given
        Person person1 = new Person("Ben", 1990);
        Person person2 = new Person("Ben", 1998);
        int expectedDoesPerson1HaveSameNameAsPerson2 = 0;

        // When
        int actualDoesPerson1HaveSameNameAsPerson2 = person1.compareTo(person2);

        // Then
        assertEquals(expectedDoesPerson1HaveSameNameAsPerson2, actualDoesPerson1HaveSameNameAsPerson2);
    }
}
