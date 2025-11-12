package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for HelloWorld application.
 */
class HelloWorldTest {
    
    @Test
    @DisplayName("getMessage should return correct hello message")
    void testGetMessage() {
        String message = HelloWorld.getMessage();
        assertEquals("Hello, world.", message);
    }
    
    @Test
    @DisplayName("printFancyMessage should print formatted output")
    void testPrintFancyMessage() {
        // Capture System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        
        try {
            HelloWorld.printFancyMessage();
            String output = outputStream.toString();
            
            // Verify the output contains the hello message
            assertTrue(output.contains("Hello, world."), 
                      "Output should contain 'Hello, world.'");
            
            // Verify the output has some fancy formatting
            assertTrue(output.contains("✨"), 
                      "Output should contain sparkle emoji");
            
            // Verify the output is not empty
            assertFalse(output.trim().isEmpty(), 
                       "Output should not be empty");
        } finally {
            // Restore System.out
            System.setOut(originalOut);
        }
    }
    
    @Test
    @DisplayName("main method should execute without errors")
    void testMain() {
        // Capture System.out to prevent cluttering test output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        
        try {
            // This should not throw any exception
            assertDoesNotThrow(() -> HelloWorld.main(new String[]{}));
            
            // Verify something was printed
            String output = outputStream.toString();
            assertFalse(output.isEmpty(), 
                       "Main method should produce output");
        } finally {
            // Restore System.out
            System.setOut(originalOut);
        }
    }
}
