package com.company.calcium_collision;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Constants for convenience
    final static String space = " ";
    final static String doubleSpaces = "  ";

    public static void main(String[] args) {
        // Initialize Scanner
        Scanner in = new Scanner(System.in);

        // What do i want from the user
        System.out.println("Write the sentence: ");

        // Got String from user
        String gotString = in.nextLine();

        // trim() and send String to method deleteMiddleSpacesRecusrsive
	    String sentence = deleteMiddleSpacesRecusrsive(gotString.trim());

        // Split sentence by spaces to array, than use Arrays.toString() to print array in human species
        System.out.println(Arrays.toString(sentence.split(" ")));

    }

    public static String deleteMiddleSpacesRecusrsive(String str){
        if (str.contains(doubleSpaces)){
            str=str.replace(doubleSpaces,space);
            return deleteMiddleSpacesRecusrsive(str);
        }
        else {
            return str;
        }

    }
}
