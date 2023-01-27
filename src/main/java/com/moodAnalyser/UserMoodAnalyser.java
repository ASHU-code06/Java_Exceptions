package com.moodAnalyser;
public class UserMoodAnalyser {
    String message;
    public UserMoodAnalyser() {
    }
    public UserMoodAnalyser(String _message){
      this.message=_message;
    }

    public String getMessage() {
        return message;
    }
    public String checkGivenMessage(String message){

    boolean check =message.contains("any");
    String mymood;
    if (!check){
        mymood="sad";
    }else {
        mymood="happy";
    }
    return mymood;
    }

}
