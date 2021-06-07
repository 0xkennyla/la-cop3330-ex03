/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kenny La
 */
package org.example;
import java.util.Scanner;

public class Exercise03 {
    public static void main (String []args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the quote?");
        String quote = scan.nextLine();

        System.out.println("Who said it?");
        String author = scan.nextLine();

        System.out.println(author + " says, \"" + quote + "\"");
    }
}
