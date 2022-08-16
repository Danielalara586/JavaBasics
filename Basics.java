class Basics {
    public static void main(String[] args) {
        // Printing method
        System.out.println("Hello World!");

        /**
         * Variables
         * Has a data type
         * Has a name (lower cammel case)
         * Has a value (equals to the data type)
         * Example: int varName = 2;
         */
        int version; // non initialized variable
        version = 10; // initialized variable

        boolean isTrue = true; // Initialized variable

        /**
         * Data Types
         * Integer (byte, short, int, long)
         * Decimal (float, double)
         * Char
         * Boolean
         */

        int javaVersion = 9;
        float specificVersion = 9.8f;
        char letter = 'a';
        String name = "Daniela";
        boolean isFalse = false;

        int var1, var2, var3; // Non initialized multi variable declaration
        char letter1 = 'a', letter2 = 'b', letter3 = 'c'; // Initialized multi variable declaration

        final float pi = 3.1416f; // Constant declaration

        /**
         * Operators
         * Arithmetics (+, -, *, /, %)
         * Logicals (and, or, not)
         * Relationals (<, >, <=, >=, ==, !=)
         */

        // Arithmetic operators
        int varX = 50, varY = 10, result = 0; 
        float varZ = 5.5f;

        result = varX + varY;
        System.out.println(result); // 60
        
        result = varX - varY;
        System.out.println(result); // 40

        result = varX * varY;
        System.out.println(result); // 500

        result = varX / varY;
        System.out.println(result); // 5

        result = varX % varY;
        System.out.println(result); // 0

        // Self increment (+1)
        varX++; 

        // Self increment (+5)
        varX += 5;

        // Self decrement (-1)
        varX--;

        // Self decrement (-5)
        varX -= 5;

        // Casting
        /* result = varX + varZ;  Error */
        result = varX + (int)varZ; // Cast from float to integer

        // Relational operators
        boolean boolResutl;
        int varA = 300, varB = 200;
        
        boolResutl = varA > varB;
        System.out.println(boolResutl); // True

        boolResutl = varA < varB;
        System.out.println(boolResutl); // False

        boolResutl = varA >= varB;
        System.out.println(boolResutl); // True

        boolResutl = varA <= varB;
        System.out.println(boolResutl); // False

        boolResutl = varA == varB;
        System.out.println(boolResutl); // False

        boolResutl = varA != varB;
        System.out.println(boolResutl); // True

        // Logical operators
        boolResutl = 5 >= 5 && true;
        System.out.println(boolResutl); // True

        boolResutl = 5 > 5 && true;
        System.out.println(boolResutl); // False

        boolResutl = false || false || true;
        System.out.println(boolResutl); // True

        boolResutl = !true;
        System.out.println(boolResutl); // False

        /** Ternary operator (IFTTT) 
         * expression1 ? expression2 : expression3
         * If expression1 = true then expression2
         * If expression1 = false then expression3
        */

        String message = 10 > 9 ? "Is greater" : "Is lower";
        System.out.println(message); // "Is greater"
    }
}