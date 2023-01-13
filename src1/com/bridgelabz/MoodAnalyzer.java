package com.bridgelabz;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import static java.util.Locale.ROOT;

public class MoodAnalyzer {
    public static void main(String[] args){
        System.out.println("How are you feeling");
        MoodAnalyzer moodAnalyzer= new MoodAnalyzer();
        Scanner input = new Scanner(System.in);
        String s1= input.nextLine();
        moodAnalyzer.moodanalyse(s1);
    }
    public void moodanalyse(String message){
        message=message.toLowerCase();
        boolean check =message.contains("sad");
        String mymood;
        if (check){
            mymood="sad";
            System.out.println(mymood);
        }else {
               mymood="happy";
            System.out.println(mymood);
        }
    }


    }

