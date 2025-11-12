package com.example;

/**
 * A simple Hello World application.
 * This application demonstrates a basic Java command-line program
 * with stylish output formatting.
 */
public class HelloWorld {
    
    private static final String BORDER = "═══════════════════════════════════════";
    private static final String MESSAGE = "Hello, world.";
    
    /**
     * Main entry point for the application.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        printFancyMessage();
    }
    
    /**
     * Prints the hello message with fancy formatting.
     */
    public static void printFancyMessage() {
        System.out.println();
        System.out.println("╔" + BORDER + "╗");
        System.out.println("║                                       ║");
        System.out.println("║       ✨  " + MESSAGE + "  ✨       ║");
        System.out.println("║                                       ║");
        System.out.println("╚" + BORDER + "╝");
        System.out.println();
    }
    
    /**
     * Gets the hello message.
     * 
     * @return the hello world message
     */
    public static String getMessage() {
        return MESSAGE;
    }
}
