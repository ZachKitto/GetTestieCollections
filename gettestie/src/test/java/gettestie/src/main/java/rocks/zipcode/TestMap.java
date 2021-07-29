package gettestie.src.main.java.rocks.zipcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestMap {

    Map<Integer, String> hashMap = new HashMap<>();
    Map<Integer, String> treeMap = new TreeMap<>();

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestHashMap() {
        // Given
        String expectedValue1 = "Hello world";
        Integer expectedKey1 = 1;
        String expectedValue2 = "Hello earth";
        Integer expectedKey2 = 2;
        String expectedValue3 = "Hello universe";
        Integer expectedKey3 = 3;
        Integer expectedNumberOfElementsAfterThreeAdds = 3;
        Integer expectedNumberOfElementsAfterThreeAddsAndOneRemove = 2;

        // When
        hashMap.put(expectedKey1, expectedValue1);
        hashMap.put(expectedKey2, expectedValue2);
        hashMap.put(expectedKey3, expectedValue3);
        String actualValue2 = hashMap.get(expectedKey2);
        Integer actualNumberOfElementsAfterThreeAdds = hashMap.size();
        hashMap.remove(expectedKey2);
        Integer actualNumberOfElementsAfterThreeAddsAndOneRemove = hashMap.size();
        hashMap.clear();

        // Then
        assertEquals(expectedNumberOfElementsAfterThreeAdds, actualNumberOfElementsAfterThreeAdds);
        assertEquals(expectedNumberOfElementsAfterThreeAddsAndOneRemove, actualNumberOfElementsAfterThreeAddsAndOneRemove);
        assertEquals(expectedValue2, actualValue2);
        assertTrue(hashMap.isEmpty());
    }

    @org.junit.Test
    public void TestTreeMap() {
        // Given
        String expectedValue1 = "Hello world";
        Integer expectedKey1 = 1;
        String expectedValue2 = "Hello earth";
        Integer expectedKey2 = 2;
        String expectedValue3 = "Hello universe";
        Integer expectedKey3 = 3;
        Integer expectedNumberOfElementsAfterThreeAdds = 3;
        Integer expectedNumberOfElementsAfterThreeAddsAndOneRemove = 2;

        // When
        treeMap.put(expectedKey1, expectedValue1);
        treeMap.put(expectedKey2, expectedValue2);
        treeMap.put(expectedKey3, expectedValue3);
        String actualValue2 = treeMap.get(expectedKey2);
        Integer actualNumberOfElementsAfterThreeAdds = treeMap.size();
        treeMap.remove(expectedKey2);
        Integer actualNumberOfElementsAfterThreeAddsAndOneRemove = treeMap.size();
        treeMap.clear();

        // Then
        assertEquals(expectedNumberOfElementsAfterThreeAdds, actualNumberOfElementsAfterThreeAdds);
        assertEquals(expectedNumberOfElementsAfterThreeAddsAndOneRemove, actualNumberOfElementsAfterThreeAddsAndOneRemove);
        assertEquals(expectedValue2, actualValue2);
        assertTrue(treeMap.isEmpty());
    }
}
