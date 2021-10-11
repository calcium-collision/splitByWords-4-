package com.company.calcium_collision;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	splitWords(in.nextLine());

    }
    public static void splitWords(String sentence){

        // Delete forward spaces
        while (sentence.charAt(0) == ' '){
            sentence = sentence.substring(1,sentence.length());
        }

        // Delete last spaces
        while (sentence.charAt(sentence.length() - 1) == ' '){
            sentence = sentence.substring(0,sentence.length()-1);
        }

        // Delete middle spaces
        String[] arraySentence = sentence.split("");
        String cleanSentence = "";
        boolean previousSpace = false;
        for (int l = 0; l < arraySentence.length; l++){

            if (arraySentence[l].equals(" ")) {
                if (!previousSpace) {
                    cleanSentence += arraySentence[l];
                    previousSpace = true;

                }
            } else {
                cleanSentence += arraySentence[l];
                previousSpace = false;


            }
        }
        arraySentence = cleanSentence.split(" ");

        System.out.println(Arrays.toString(arraySentence));
    }
}
