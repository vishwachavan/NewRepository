package com.practice;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



public class Reflection {
	 
	 // Inner class defined for testing reflection
    public static class Person {
        private String name = "John";

        public void sayHello() {
            System.out.println("Hello!" +name);
        }
    }

    public static void main(String[] args) throws Exception {
        // Use Class.forName with full class name (including outer class if nested)
      //  Class<?> personClass = Class.forName("Person");
    	
    	Class<?> personClass = Person.class;

        // Create instance
        Object person = personClass.getDeclaredConstructor().newInstance();

        // Access private field
        Field nameField = personClass.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(person, "Welcom");
     //   String name = (String) nameField.get(person);
   //     System.out.println("Name: " + name);

        // Invoke public method
        Method sayHello = personClass.getMethod("sayHello");
        sayHello.invoke(person);
    }

}
