package oo1.ej16;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class EvenNumberSetTest {
    private Set<Integer> set1;
    private Set<Integer> set2;
    private Set<Integer> set3;

    @BeforeEach
    public void setUp() {
        set1 = new EvenNumberSet();
        set2 = new EvenNumberSet2();
        set3 = new EvenNumberSet3();
    }

    @Test
    public void testSet1(){
        assertFalse(set1.add(1));
        assertTrue(set1.add(2));
        assertTrue(set1.add(4));
        assertTrue(set1.add(6));
        assertFalse(set1.add(5));
        assertEquals(3, set1.size());
    }

    @Test
    public void testSet2(){
        assertFalse(set2.add(1));
        assertTrue(set2.add(2));
        assertTrue(set2.add(4));
        assertTrue(set2.add(6));
        assertFalse(set2.add(5));
        assertEquals(3, set2.size());
    }

    @Test
    public void testSet3(){
        assertFalse(set3.add(1));
        assertTrue(set3.add(2));
        assertTrue(set3.add(4));
        assertTrue(set3.add(6));
        assertFalse(set3.add(5));
        assertEquals(3, set3.size());
    }

}