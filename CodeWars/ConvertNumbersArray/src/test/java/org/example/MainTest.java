package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void digitize() {
        assertArrayEquals(new int[] {1, 3, 2, 5, 3}, Main.digitize(35231));
        assertArrayEquals(new int[] {0}, Main.digitize(0));
    }
}

