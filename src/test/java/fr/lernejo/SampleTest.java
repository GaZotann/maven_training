package fr.lernejo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Test.*;

class SampleTest {
    @Test
    void simple_addition(){
        assertEquals(3, new Sample().op(Sample.Operation.ADD, 1,2));
    }

    @Test
    void simple_multiplication(){
        assertEquals(4, new Sample().op(Sample.Operation.MULT,2,2));
    }

    @Test
    void Simple_fact() {
        assertEquals(0, new Sample().fact(0));
    }
}
