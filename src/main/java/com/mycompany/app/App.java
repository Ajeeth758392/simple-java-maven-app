package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello! CI CD Pipeline built for the project as per Sprint4 Assignment";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
