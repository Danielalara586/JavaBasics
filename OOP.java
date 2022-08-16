public class OOP {
    public static void main(String[] args) {
        // Classes and objects
        class Dog {
            // Atributes: Characterisitics of our object
            String name, breed;
            int age;

            // Parameters: Input values for our methods
            void setAttributes(String name, String breed, int age) {
                this.name = name;
                this.breed = breed;
                this.age = age;
            }

            // Methods: Actions made by our object
            void eat() {
                System.out.println(this.name + " is eating");
            }

            void sleep() {
                System.out.println(this.name + " is sleeping");
            }

            void bark() {
                System.out.println(this.name + " is barking");
            }

        }

        // Instantiate an object = create a new object
        Dog kiara = new Dog(); // New instance

        /*
         * Adding values manually to the attributes
         * kiara.name = "Kiara";
         * kiara.breed = "Maltese";
         * kiara.age = 6;
         */

        // Adding values with a method
        kiara.setAttributes("Kiara", "Matlese", 6); // Arguments: values taken by our parameters

        // calling our methods
        kiara.eat();
        kiara.sleep();
        kiara.bark();

        // Printing attributes
        System.out.printf("Name: %s \nBreed: %s \nAge: %d\n", kiara.name, kiara.breed, kiara.age);

        // Returnable values in classes
        class Triangle {
            float base, height;

            float area() {
                return (this.base * this.height) / 2f;
            }
        }

        Triangle triangle = new Triangle();
        triangle.base = 10f;
        triangle.height = 20f;
        float result = triangle.area();

        System.out.println("Triangle's area: " + result);

        /*
         * Encapsulation: Controls the way to access an object's data, creating a
         * security layer.
         * Access modifiers: Adds a greater security level by restricting access to an
         * object's data.
         * There are 4 access modifiers: default, public private and protected.
         * Default: every class and object (within the same package) can make use of the
         * object's data.
         * Public: every class and object (within the same package or a different one)
         * can make use of the object's data.
         * Private: can only be access by the class that contains it.
         * Protected: can only be used within the same package.
         */
        class User {
            public String username;
            private String password;

            // Constructor: Method that inits an instance, it has the same name as the
            // class.
            public User(String username, String password) {
                this.username = username;
                this.setPassword(password);
            }

            void greets() {
                System.out.printf("Hello, my username is %s\n", this.username);
            }

            /*
             * Getters and setters
             * Getters: returns an attribute value.
             * Setters: set a value to an attribute.
             */

            // Getters
            public String getPassword() {
                return this.password;
            }

            // Setters
            public void setPassword(String password) {
                this.password = password;
            }
        }

        User daniela = new User("daniela_lara123", "12345");
        String userPassword = daniela.getPassword();
        daniela.greets();

        System.out.printf("password: %s\n", userPassword);

        /*
         * Method overloading: Capablity of a programming language to define 2 or
         * more methods with the same name in the same class.
         */

        class Calculator {
            // Integer sum
            public int sum(int a, int b) {
                return a + b;
            }

            // Float sum
            public float sum(float a, float b) {
                return a + b;
            }

            // Double sum
            public double sum(double a, double b) {
                return a + b;
            }

            // Multiple parameters
            public int sum(int... numbers) { // n -> int Array
                int sum = 0;
                for (int number : numbers) {
                    sum += number;
                }
                return sum;
            }
        }

        Calculator operations = new Calculator();
        result = operations.sum(1, 5, 6, 10);
        System.out.println("Sum result: " + result);

        /*
         * Static method: is used when we want to make use of attributes or methods
         * without instantiating an object.
         * All elements that are not static are known as instance elements.
         * Static elements are known as class elements.
         * Within static methods, we can't make use of instance elements.
         */

        class Circle {
            public static final float pi = 3.1416f;
            public float radius = 0f;

            public Circle(float radius) {
                this.radius = radius;
            }

            public float area() {
                return Circle.pi * (radius * radius);
            }
        }

        System.out.println(Circle.pi);

        /*
         * Nested classes: a class within another class.
         * Nested classes can make use of the elements of the main class.
         */
        class Users {
            public String username;

            public Users(String username) {
                this.username = username;
            }

            public void setRol() {
                Admin admin = new Admin();
                admin.work();
            }

            class Admin {
                public void work() {
                    System.out.println("The admin is working...");
                }
            }
        }

        Users user1 = new Users("Cody");
        user1.setRol();

    

        /*
         * Inheritance: acquires the properties from one class to other classes. Reduces
         * duplicate code.
         */
        class Pet {
            public String name, breed;
            public int age;

            public Pet(String name, String breed, int age) {
                this.setName(name);
                this.setBreed(breed);
                this.setAge(age);
            }

            public void eat() {
                System.out.printf("%s is eating...\n", this.name);
            }

            public void sleep() {
                System.out.printf("%s is sleeping...\n", this.name);
            }

            public String getName() {
                return this.name;
            }

            public String getBreed() {
                return this.breed;
            }

            public int getAge() {
                return this.age;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setBreed(String breed) {
                this.breed = breed;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }

        class Cat extends Pet {
            // Polymorphism: Override a method.
            public Cat(String name, String breed, int age) {
                super(name, breed, age);
            }

            @Override
            public void sleep() {
                System.out.println("The cat is sleeping...");
            }
        }

        Cat whiskers = new Cat("Whiskers", "Siberian", 1);

        /*
         * Abstract classes
         * Is mainly use when the super class has a generic format
         * and the subclasses define the details.
         * Abstract methods: doesn't have a body, defines what to do but not how.
         */

        abstract class Shape {
            private int numSides;

            public Shape() {
                this.numSides = 0;
            }

            public abstract float area();

        }

        class Rectangle extends Shape{
            private float base, height;

            @Override
            public float area(){
                return base * height;
            }
        }

        /*
         * Sustitution Principle
         * The act of treating a subclass as a superclass
         */
        
         
    }
}
