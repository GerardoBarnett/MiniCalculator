package com.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Calculator class.
 */
public class CalculatorTest {
    
    private Calculator calculator;
    
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    public void testAddPositiveNumbers() {
        assertEquals(5.0, calculator.add(2.0, 3.0), 0.0001);
    }
    
    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-5.0, calculator.add(-2.0, -3.0), 0.0001);
    }
    
    @Test
    public void testAddMixedNumbers() {
        assertEquals(1.0, calculator.add(3.0, -2.0), 0.0001);
    }
    
    @Test
    public void testAddZero() {
        assertEquals(3.0, calculator.add(3.0, 0.0), 0.0001);
    }
    
    @Test
    public void testSubtractPositiveNumbers() {
        assertEquals(2.0, calculator.subtract(5.0, 3.0), 0.0001);
    }
    
    @Test
    public void testSubtractNegativeNumbers() {
        assertEquals(1.0, calculator.subtract(-2.0, -3.0), 0.0001);
    }
    
    @Test
    public void testSubtractMixedNumbers() {
        assertEquals(5.0, calculator.subtract(3.0, -2.0), 0.0001);
    }
    
    @Test
    public void testSubtractZero() {
        assertEquals(3.0, calculator.subtract(3.0, 0.0), 0.0001);
    }
}