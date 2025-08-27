/*
   Java Data Types & Literals
   In Java, data types are mainly of 2 kinds:
   1. Predefined (Primitive types)
   2. User-defined (like classes, interfaces, String, etc.)
*/

public class Main {
    public static void main(String[] args) {

        /*
           🔹 Integer Types (Why 4 types?)
           Java provides 4 integer types for flexibility in memory usage.
           - byte   (1 byte, range: -128 to 127)
           - short  (2 bytes, range: -32,768 to 32,767)
           - int    (4 bytes, range: -2,147,483,648 to 2,147,483,647) → DEFAULT integer type
           - long   (8 bytes, suffix l or L)
        */
        byte b = 100;
        short s = 1000;
        int i = 100000;           // by default, integer literal = int
        long l = 10000000000L;    // suffix L needed

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);

        /*
           🔹 Number System Prefixes in Java
           - Decimal (normal numbers, no prefix)
           - Octal (prefix 0) → e.g. 07 = 7
           - Binary (prefix 0b or 0B) → e.g. 0b101 = 5
           - Hexadecimal (prefix 0x or 0X) → e.g. 0xA = 10
        */
        int decimal = 25;
        int octal = 025;       // Octal → value = 21 in decimal
        int binary = 0b1101;   // Binary → value = 13 in decimal
        int hex = 0x1A;        // Hexadecimal → value = 26 in decimal

        System.out.println("Decimal: " + decimal);
        System.out.println("Octal (025): " + octal);
        System.out.println("Binary (0b1101): " + binary);
        System.out.println("Hexadecimal (0x1A): " + hex);

        /*
           🔹 Floating Point Types
           - float  (4 bytes, suffix f or F required)
           - double (8 bytes, suffix d or D optional, DEFAULT floating type)
        */
        float f = 10.5f;        // must add f or F
        double d1 = 20.55;      // by default double
        double d2 = 30.99D;     // suffix D optional

        System.out.println("float: " + f);
        System.out.println("double d1: " + d1);
        System.out.println("double d2: " + d2);

        /*
           🔹 Boolean Type
           - Allowed values: true / false
        */
        boolean isJavaFun = true;
        boolean isFishFlying = false;
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is Fish flying? " + isFishFlying);

        /*
           🔹 char Type
           - 2 bytes (0 to 65,535)
           - Follows UNICODE (ASCII is subset)
           - Can hold a character OR an equivalent int value
        */
        char c1 = 'A';    // character literal
        char c2 = 66;     // int value → corresponds to 'B' in ASCII/Unicode
        System.out.println("char c1: " + c1);
        System.out.println("char c2 (66): " + c2);

        /*
           🔹 String Literal
           - User-defined data type (actually a class in Java)
           - Represents sequence of characters
        */
        String name = "Shery";
        System.out.println("String literal: " + name);
    }
}