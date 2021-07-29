package gettestie.src.main.java.rocks.zipcode;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestSet {

    Set<String> hashSet = new HashSet<>();
    Set<String> treeSet = new TreeSet<>();

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestHashSet() {
        // Given
        String expectedElement1 = "Hello world";
        String expectedElement2 = "Hello earth";
        String expectedElement3 = "Hello universe";
        Integer expectedNumberOfElementsAfterThreeAdds = 3;
        Integer expectedNumberOfElementsAfterThreeAddsAndOneRemove = 2;

        // When
        hashSet.add(expectedElement1);
        hashSet.add(expectedElement2);
        hashSet.add(expectedElement3);
        Integer actualNumberOfElementsAfterThreeAdds = hashSet.size();
        hashSet.remove(expectedElement3);
        Integer actualNumberOfElementsAfterThreeAddsAndOneRemove = hashSet.size();
        hashSet.clear();

        // Then
        assertEquals(expectedNumberOfElementsAfterThreeAdds, actualNumberOfElementsAfterThreeAdds);
        assertEquals(expectedNumberOfElementsAfterThreeAddsAndOneRemove, actualNumberOfElementsAfterThreeAddsAndOneRemove);
        assertTrue(hashSet.isEmpty());
    }

    @org.junit.Test
    public void TestTreeSet() {
        // Given
        String expectedElement1 = "Hello world";
        String expectedElement2 = "Hello earth";
        String expectedElement3 = "Hello universe";
        Integer expectedNumberOfElementsAfterThreeAdds = 3;
        Integer expectedNumberOfElementsAfterThreeAddsAndOneRemove = 2;

        // When
        treeSet.add(expectedElement1);
        treeSet.add(expectedElement2);
        treeSet.add(expectedElement3);
        Integer actualNumberOfElementsAfterThreeAdds = treeSet.size();
        treeSet.remove(expectedElement3);
        Integer actualNumberOfElementsAfterThreeAddsAndOneRemove = treeSet.size();
        treeSet.clear();

        // Then
        assertEquals(expectedNumberOfElementsAfterThreeAdds, actualNumberOfElementsAfterThreeAdds);
        assertEquals(expectedNumberOfElementsAfterThreeAddsAndOneRemove, actualNumberOfElementsAfterThreeAddsAndOneRemove);
        assertTrue(treeSet.isEmpty());
    }
}
