package com.company.calcium_collision;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    final static String space = " ";
    final static String doubleSpaces = "  ";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    System.out.println("Write the sentence: ");
	 String sentence = deleteMiddleSpacesRecusrsive(in.nextLine().trim());
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
