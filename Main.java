package com.company.calcium_collision;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	split_words(in.nextLine());

    }
    public static void split_words(String sentence){

        // Delete forward spaces
        while (sentence.split("")[0].equals(" ")){
            sentence = sentence.substring(1,sentence.length());
        }

        // Delete last spaces
        while (sentence.split("")[sentence.length()-1].equals(" ")){
            sentence = sentence.substring(0,sentence.length()-1);
        }

        // Delete middle spaces
        String[] array_sentence = sentence.split("");
        String clean_sentence = "";
        boolean previous_space = false;
        for (int l = 0; l < array_sentence.length; l++){

            if (array_sentence[l].equals(" ")) {
                if (!previous_space) {
                    clean_sentence += array_sentence[l];
                    previous_space = true;

                }
            } else {
                clean_sentence += array_sentence[l];
                previous_space = false;


            }
        }
        array_sentence = clean_sentence.split(" ");

        System.out.println(Arrays.toString(array_sentence));
    }
}
