package com.bridgelabz;
import java.util.Scanner;

public class MoodAnalyzer {
    public static void main(String[] args) throws InvalidUserInput {
       System.out.println("How are you feeling?");
       MoodAnalyzer moodAnalyzer=new MoodAnalyzer();
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
       s1 = s1.toLowerCase();
       try {
           boolean check1 = s1.contains("null");
           if (!check1) {
              moodAnalyzer.moodanalyse(s1);
           } else {
               throw new InvalidUserInput("Exception occurs");
           }
       } catch (InvalidUserInput e) {
           System.out.println("Exception handled :- do not enter null ");
           System.out.println("How are you feeling now?");
           String s2 = input.nextLine();
           s2 = s2.toLowerCase();
           moodAnalyzer.moodanalyse(s2);
       }
   }


    public void moodanalyse(String message){
       message=message.toLowerCase();
        boolean check =message.contains("sad");
        String mymood;
        if (check){
            mymood="sad";
        }else {
               mymood="happy";
        }
        System.out.println(mymood);
    }


    }

