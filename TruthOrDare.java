package com.Medium;

import java.util.*;

public class TruthOrDare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        ArrayList<String> truths = new ArrayList<>();
        ArrayList<String> dares = new ArrayList<>();

        // Truth Questions
        truths.add("What is your biggest fear?");
        truths.add("Have you ever lied to your best friend?");
        truths.add("What is your secret talent?");
        truths.add("Who is your crush?");
        truths.add("What is your most embarrassing moment?");

        // Dare Tasks
        dares.add("Sing a song loudly!");
        dares.add("Do 10 pushups!");
        dares.add("Dance for 30 seconds!");
        dares.add("Act like a monkey for 15 seconds!");
        dares.add("Speak in English for next 2 minutes!");

        System.out.println("🎭 Truth or Dare Game");

        String play = "yes";

        while (play.equalsIgnoreCase("yes")) {

            System.out.print("\nChoose (truth/dare): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("truth")) {
                int index = random.nextInt(truths.size());
                System.out.println("👉 Truth: " + truths.get(index));

            } else if (choice.equalsIgnoreCase("dare")) {
                int index = random.nextInt(dares.size());
                System.out.println("👉 Dare: " + dares.get(index));

            } else {
                System.out.println("Invalid choice!");
                continue;
            }

            System.out.print("Play again? (yes/no): ");
            play = sc.next();
        }

        System.out.println("Game Over 🎮");
        sc.close();
    }
}