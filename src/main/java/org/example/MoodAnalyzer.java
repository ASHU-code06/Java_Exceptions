package org.example;

public class MoodAnalyzer {
        public static void main(String[] args) throws MoodAnalysisException {
            System.out.println("How are you feeling?");
            MoodAnalyzer moodAnalyzer=new MoodAnalyzer();
            String hi = moodAnalyzer.moodanalyse(null) ;
        }

        public String moodanalyse(String message) throws MoodAnalysisException{
            String mymood="";
            try{
                if (message==null){
                    throw new MoodAnalysisException("Exception occurs , mood cannot be null");
                }else if (message.toLowerCase().contains("sad")){
                    mymood="sad";
                }else {
                    mymood="happy";
                }
                System.out.println(mymood);
            }
            catch (MoodAnalysisException e){
                System.out.println(e.getMessage());
            }
            return mymood;
        }

    }
