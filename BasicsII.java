import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class BasicsII {
    public static void main(String[] args) {
        /**
         * Strings
         * Char sequences
         * Is represented by double quotes ""
         * A string is a Class, not a primary data type
         */

        String message = "Hello, I am a string";
        System.out.println(message);

        String message2 = new String("Hello, I am a string as class");
        System.out.println(message2);

        /**
         * String methods
         * lenght (var.lenght())
         * contains (var.contains(substr))
         * starts with (var.startsWith(str))
         * ends with (var.endsWith(str))
         * concat (var.concat(str))
         */

        int strLenght = message.length();
        System.out.println(strLenght); // 20

        boolean exists = message.contains("Hello");
        System.out.println(exists); // True

        boolean startsWith = message.startsWith("Hello");
        System.out.println(startsWith); // True

        boolean endsWith = message.endsWith("Bye!");
        System.out.println(endsWith); // False

        String newStr = message.concat(" and this is a concat");
        System.out.println(newStr);

        /**
         * Format methods
         * to upper case (var.toUpperCase())
         * to lower case (var.toUpperCase())
         * trim (var.trim())
         * format (String.format(format, arg)) %d = ints, %f = floats, %s = strings, %b
         * = boolean
         */

        String upper = message.toUpperCase();
        System.out.println(upper);

        String lower = upper.toLowerCase();
        System.out.println(lower);

        String message3 = "   Hello   ";
        System.out.println(message3.trim()); // Removes spaces

        String message4 = String.format("Hello %s", "Daniela");
        float value = 3.14157f;
        System.out.println(message4);
        System.out.printf("%.2f", value); // Prints format

        /**
         * Comparing strings
         * equals (var1.equals(var2))
         * equals ignore case (var1.equalsIgnoreCase(var2))
         */

        String str1 = "Hello", str2 = "hello";
        boolean result = str1.equals(str2);
        System.out.println(result); // False

        result = str1.equalsIgnoreCase(str2);
        System.out.println(result); // True

        /**
         * Conditionals
         * If-Else
         * Switch-Case
         */

        // If-Else
        int average = 6;

        if (average >= 7) {
            if (average == 10)
                System.out.println("Congrats!");
            else
                System.out.println("Good Job!");
        } else {
            System.out.println("Keep reviewing");
        }

        // Switch-Case

        String lightColor = "green";

        switch (lightColor.toLowerCase()) {
            case "green":
                System.out.println("Continue");
                break;
            case "yellow":
                System.out.println("Lower your speed");
                break;
            case "red":
                System.out.println("Stop");
                break;
            default:
                System.out.println("Please enter a valid color");
                break;
        }

        /**
         * Loops
         * While
         * Do While
         * For
         */

        // While
        int counter = 0;

        while (counter < 11) {
            System.out.println("Hello World!");
            counter++;
        }

        // Do while
        do {
            System.out.println(counter);
            counter++;
        } while (counter < 10);

        // For
        for (int i = 0; i < 10; i++)
            System.out.println(i);
        
        /**Arrays 
         * Data Structures
         * Inmutable lenght
         * Stores same data types
         * Every item has an index (starts at 0)
        */

        // String array example
        String names[] = new String[3]; 
        names[0] = "Daniela";
        names[1] = "Paola";
        names[2] = "Sandra";
        System.out.println(names[0]);

        // Int array example
        int grades[] = {10, 10, 9, 8, 9};
        int total = 0;
        
        // Iterating arrays with For
        for(int index = 0; index < grades.length; index++){
            total += grades[index];
            System.out.println(total);
        }
        float mean = total / grades.length;
        System.out.println(mean);

        // Iterating arrays with Foreach
        for (int grade : grades) {
            total += grade;
            System.out.println(total);
        }
        mean = total / grades.length;
        System.out.println(mean);

        // Insert values
        int intArray[] = new int[4];
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = i;
            System.out.println(intArray[i]);
        }

        // Matrix (Bidimensional array)
        int matrix[][] = new int [4][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 1;
        matrix[1][1] = 2;
        matrix[1][2] = 3;
        matrix[2][0] = 1;
        matrix[2][1] = 2;
        matrix[2][2] = 3;

        // Iterating matrix with For
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = j + 1;
                System.out.println(matrix[i][j]);
            }
        }

        // Iterating matrix with Foreach
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.println(col);
            }
        }

        // Lists and sets
        /*
         * Sets: A non sorted collection of unique elements
         * Tree sets: A sorted collection of unique elements
         * Linked sets: Similar to a set, faster with certain operations
         */
        Set<Integer> set = new HashSet<Integer>();

        // Sets operations

        // Add elements
        set.add(5);
        set.add(8);
        set.add(3);
        set.add(5);

        // Something exists
        set.contains(5);

        // Remove elements
        set.remove(3);

        // Remove all elements (clear)
        set.clear();

        // Checks if a set is empty
        set.isEmpty();

        // Lenght of a set
        set.size();

        Set <Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(6);
        treeSet.add(4);
        treeSet.add(7);
        treeSet.add(1);
        // Result: (1, 4, 6, 7)

        Set <Integer> linkedSet = new LinkedHashSet<Integer>();

        /*
         * Lists: Similar to an array but with dynamic sizes and slower performance
         */

        ArrayList <Integer> array = new ArrayList<Integer>(); 
       array.add(1);
       array.add(4);
       array.add(5);
       array.add(2);
       array.get(0); // get index
       array.set(1, 5); // Set a value on a specific index (something needs to exist there)
       array.size();

       array.subList(0, 2); // Gets values within a certain range (doesn't include the last index)
       // Result: [1, 4]

       /*
        * Use lists when you don't know how many elements you'll have
        * Use sets when you don't care where an element exists, just if it exists
        * Sets are simplier and faster, being more efficient
        */

        /*
         * Maps
         * There are 3 types, map, hashmap and linked hashmap.
         * A map is a key-value pair (known as dictionary in other languages)
         * Keys are unique and maps doesn't have an order
         * Tree map: Keys need to be the same type to be sorted
         * Linked Hashmap: Mantains the order in which we add elements
         */

        Map map = new HashMap(); 
        map.put("MacBook", 1200);
        map.put("iPhone", 950);

        // Get a value
        map.get("Mackbook");

        // Checks is a value exists in the map
        map.containsValue(1200);

        // Checks if a key exists
        map.containsKey("iPhone");

        // Shows all values in a map
        map.values();

        // Clears a map
        map.clear();

        // Validates if a map is empty
        map.isEmpty();

        // Remove an element by its key
        map.remove("iPhone");

        Map treeMap = new TreeMap();
        map.put("A", "I'm first");
        map.put("B", "I'm second");


        // enum init
        Level level1 = Level.LOW;

        switch(level1){
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
            default:
                System.out.println("Please enter a valid option");
                break;
        }       
          
    }

    // Enums: collection of constants 
    public enum Level {
        HIGH, 
        MEDIUM, 
        LOW;
    }
}
