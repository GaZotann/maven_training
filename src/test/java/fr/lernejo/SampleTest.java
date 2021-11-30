package fr.lernejo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        int number = -1;
        org.assertj.core.api.Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> new Sample().fact(number)).withMessage("N should be positive");
    }

    @Test
    void Simple_fact_deux(){
        assertEquals(6,new Sample().fact(3));
    }
}
