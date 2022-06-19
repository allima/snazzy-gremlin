package org.example;

import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

//        // gets the value of the specified environment variable "PATH"
//        System.out.println("System.getenv('PATH') = ");
//        System.out.println(System.getenv("PATH"));
//
//        // gets the value of the specified environment variable "TEMP"
//        System.out.print("System.getenv('TEMP') = ");
//        System.out.println(System.getenv("TEMP"));
//
//        // gets the value of the specified environment variable "USERNAME"
//        System.out.print("System.getenv('USERNAME') = ");
//        System.out.println(System.getenv("USERNAME"));
//
        // gets the value of the specified environment variable "USERNAME"
        System.out.print("System.getenv('API_KEY_IMDB') = ");
        System.out.println(System.getenv("API_KEY_IMDB"));


        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n",
                              envName,
                              env.get(envName));
        }

    }
}
