package com.employee.java8;

class Parent {
    static void staticMethod() {
        System.out.println("This is a static method in Parent.");
    }

    final static void finalStaticMethod() {
        System.out.println("This is a final static method in Parent.");
    }
}

class Child extends Parent {
    static void staticMethod() {
        System.out.println("This is a static method in Child.");
    }

//     This will result in a compilation error, as final static method cannot be overridden.
    /* final static void finalStaticMethod() {
         System.out.println("Trying to override final static method in Child.");
     }*/
}

public class JavaPractice {
    public static void main(String[] args) {
        Parent.staticMethod();        // Output: This is a static method in Parent.
        Child.staticMethod();         // Output: This is a static method in Child.

        Parent.finalStaticMethod();   // Output: This is a final static method in Parent.
        Child.finalStaticMethod();    // Output: This is a final static method in Parent.

    }
}
