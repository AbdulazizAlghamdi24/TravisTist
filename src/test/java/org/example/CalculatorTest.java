package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class CalculatorTest
{
    private final Calculator calc = new Calculator();
    @Test
    void shouldAddTwoNumbers(){
        // TODO
        assertEquals(2,calc.add(2,2));
    }
    @Test
    void shouldReturnGradeLetters(){
        // TODO
        assertEquals("F",calc.getGradeLetter(50));
        assertEquals("D",calc.getGradeLetter(61));
        assertEquals("D+",calc.getGradeLetter(66));
        assertEquals("C",calc.getGradeLetter(72));
        assertEquals("C+",calc.getGradeLetter(79));
        assertEquals("B",calc.getGradeLetter(80));
        assertEquals("B+",calc.getGradeLetter(85));
        assertEquals("A",calc.getGradeLetter(94));
        assertEquals("A+",calc.getGradeLetter(99));
    }

    @Test
    void shouldTestNegativeGrade(){
        assertThrows(IllegalArgumentException.class, () -> {
            calc.getGradeLetter(-10);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            calc.getGradeLetter(101);
        });
    }
}
