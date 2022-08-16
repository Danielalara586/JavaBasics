// importing packages
import java.util.Scanner; 
import javax.swing.JOptionPane;

public class API {
    public static void main(String[] args) {
        /*
         * We can define different types of methods
         * Own classes and defined classes
         * Defined classes are inside a library (Java API) and is public and free
         */

        // Math class
        System.out.println(Math.PI);
        System.out.println(Math.max(350, 125));

        /*
         * Packages
         * A package lets us group classes
         * Solves the "same name" problem
         * Stablishes access privileges
         */

        // Scanner class (input)
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();

        // Class integer
        System.out.println("Please enter your age: ");
        int age = Integer.parseInt(sc.nextLine());
        // Another option is: int age = sc.nextInt();

        System.out.println("Now enter your height: ");
        float height = sc.nextFloat();

        sc.nextLine();

        System.out.println("Do you like the course? [yes/no]: ");
        boolean course = sc.nextLine().equals("yes");

        System.out.printf("Hello %s. Your age is %d, your height is %f and you like the course: %b", 
        name, age, height, course);

        sc.close(); // Ends the keyboard input

        // JOptionPane module: input with interface
        String completeName = JOptionPane.showInputDialog(null, "Please enter your name");
        JOptionPane.showMessageDialog(null, name);


    }
}
