package com.moodAnalyzer;
import com.moodAnalyser.UserMoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
       public void givenMessage_WhenProper_ShouldReturnSad(){
           String s ="I am in sad mood";
           UserMoodAnalyser main =new UserMoodAnalyser();
           String print = main.checkGivenMessage(s);
           Assertions.assertEquals("sad",print);
}
    @Test//select @test is compulsory for running test

    public void given_Any_Other_Message_ShouldReturnHappy(){
        String s ="I am in any mood";
        UserMoodAnalyser userMoodAnalyser =new UserMoodAnalyser();
        String print = userMoodAnalyser.checkGivenMessage(s);
        Assertions.assertEquals("happy",print);
    }

}



