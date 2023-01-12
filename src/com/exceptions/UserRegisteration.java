package com.exceptions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class UserRegisteration  {
    public static void main(String[] args) throws InvalidUserName {
        System.out.println("Enter your first name with first letter in capital");
        UserRegisteration userRegisteration=new UserRegisteration();
        userRegisteration.firstname();

    }
    public  void firstname()throws InvalidUserName  {
        Scanner myinput = new Scanner(System.in);
        String fname = myinput.nextLine();
        try {
            Pattern p = Pattern.compile(("[A-Z]{1}[a-z]{3,}$"));
            Matcher m = p.matcher(fname);
            boolean b = m.matches();
            if(b) {
                System.out.println(b);
            }else {
                throw new InvalidUserName("Here an exception has come");
            }
        } catch (InvalidUserName e) {
         /*throw new InvalidUserName("Enter correct input please");
          already throwed exception one time so it is no need to throw exception again*/
            System.out.println("Please write proper first name ");
            firstname();
        }

    }
}


