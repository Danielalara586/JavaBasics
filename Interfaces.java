import java.util.function.Supplier;

public class Interfaces {
    public static void main(String[] args) {
        /*
         * Interfaces
         * Collection of abtract methods
         * Collection of constants
         * Specifies what to do
         * Simulates multi inheritance
         */

        class GermanShepherd implements Canine, Pet {
            public GermanShepherd() {

            }

            @Override
            public void howl() {
                System.out.println("German Shepherd howls (Auuu!)");
            }

            @Override
            public void sit() {

            }
        }

    }

    public interface Canine {
        public void howl();
    }

    interface Wolf extends Canine {
        public void attack();
        /*
         * Default method
         * Goes inside an interface
         * Isn't abstract
         * Has a body and a behavior
         */
        
        public default void run(){
            System.out.println("The wolf is running!");
        }
    }

    public interface Pet {
        public void sit();
    }

}
