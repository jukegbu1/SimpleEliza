//Create Eliza,an interactive chat-bot type program that interacts with the user
//Your program will evaluate what the user asks and turn user's input into a question that sounds like the therapist really cares
//Your first task: develop a program with a running loop
//If the user types in "I am feeling great" or enter "Q" The program will stop running
//Your program should print out the last input (as an output) every time before accepting new input
//Make sure you are accommodating for NO case-sensitivity (Q is the same as q)
package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        boolean Q;


//Welcome user
        System.out.println("Hello! I am Eliza and I am here to help!");
        String userinput = " ";

//Create Do while loop
        do {

            System.out.println("Good day.What is your problem? Enter your response here or Q to quit");
            userinput = Keyboard.nextLine();

            System.out.println(userinput);

            Q = quitcheck(userinput);

        }

        while (!Q);
        System.out.println("Thanks have a great day!");
    }

    public static boolean quitcheck(String userinput) {
        boolean Q = false;

        if (userinput.equalsIgnoreCase("Q")) {
            Q = true;
        } else if (userinput.equalsIgnoreCase("I am feeling great")) {
            Q = true;

        }
        return Q;

    }
}
