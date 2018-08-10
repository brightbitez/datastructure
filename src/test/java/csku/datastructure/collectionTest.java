package csku.datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class collectionTest {
    @Test
    public void testSizeZero(){
        ArrayCollection arrayC = new ArrayCollection();
        assertEquals(0,arrayC.size());
    }
}