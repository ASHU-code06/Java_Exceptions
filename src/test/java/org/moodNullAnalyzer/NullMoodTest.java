package org.moodNullAnalyzer;

import org.example.MoodAnalysisException;
import org.example.MoodAnalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NullMoodTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalysisException {
        String s ="I am in sad mood";
        MoodAnalyzer main =new MoodAnalyzer();
        String print;
        print = main.moodanalyse(s);

        //Assertions = null;
        Assertions.assertEquals("sad",print);
    }
    @Test//select @test is compulsory for running test

    public void given_Any_Other_Message_ShouldReturnHappy() throws MoodAnalysisException {
        String s ="I am in any mood";
        MoodAnalyzer moodAnalyzer =new MoodAnalyzer();
        String print;
        print = moodAnalyzer.moodanalyse(s);
        //Assertions=null;
        Assertions.assertEquals("happy",print);
    }
}
