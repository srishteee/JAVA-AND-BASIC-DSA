package Classes;

import static java.util.Arrays.stream;

interface Demooo {

        void abstractMethod();

        // Default method
        default void defaultMethod() {
            System.out.println("This is a default method.");


        }
    }

