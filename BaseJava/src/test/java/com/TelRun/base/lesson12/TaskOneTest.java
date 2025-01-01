package com.TelRun.base.lesson12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskOneTest {

    @Test
    public void testGetMaxWhenArrayIsCorrect() {
        TaskOne taskOne = new TaskOne();
        int[] array = {1, 2, 3, 65, 7};
        assertEquals(65, taskOne.getMax(array));
    }

    @Test
    public void testGetMaxWhenArrayIsNullOr() {
        TaskOne taskOne = new TaskOne();
        int[] array = null;
        assertEquals(-1, taskOne.getMax(array));
    }

    @Test
    public void testGetMaxWhenArrayIsEmpty() {
        TaskOne taskOne = new TaskOne();
        int[] array = {};
        assertEquals(-1, taskOne.getMax(array));
    }
}