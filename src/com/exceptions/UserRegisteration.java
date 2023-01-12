package com.exceptions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class UserRegisteration  {
    public static void main(String[] args) throws InvalidUserInput {
        System.out.println("Enter your first name with first letter in capital");
        UserRegisteration userRegisteration=new UserRegisteration();
        userRegisteration.firstname();
        userRegisteration.lastname();
        userRegisteration.isvalidemail();
        userRegisteration.isvalidphoneneumber();

    }
    public  void firstname()throws InvalidUserInput {
        Scanner myinput = new Scanner(System.in);
        String fname = myinput.nextLine();
        try {
            Pattern p = Pattern.compile(("[A-Z]{1}[a-z]{3,}$"));
            Matcher m = p.matcher(fname);
            boolean b = m.matches();
            if(b) {
                System.out.println(b);
            }else {
                throw new InvalidUserInput("Here an exception has come");
            }
        } catch (InvalidUserInput e) {
         /*throw new InvalidUserName("Enter correct input please");
          already throwed exception one time so it is no need to throw exception again*/
            System.out.println("Please write proper first name ");
            firstname();
        }

    }
    public  void lastname()throws InvalidUserInput {
        System.out.println("Enter your last name");
        Scanner input = new Scanner(System.in);
        String lname = input.nextLine();
        try{
        Pattern pat = Pattern.compile(("^[A-Z]{1}[a-z]{2,}$"));
        Matcher mat = pat.matcher(lname);
        boolean c = mat.matches();
        if (c){
            System.out.println(c);
        }else {
            throw new InvalidUserInput("exception occur");
        }
        }
        catch(InvalidUserInput O){
            System.out.println("Please write proper Last name ");
            lastname();
        }
    }
    public void isvalidemail(){
        System.out.println("Enter your email id");
        Scanner inputemail = new Scanner(System.in);
        String email = inputemail.nextLine();
        Pattern patemail = Pattern.compile(("^[A-Za-z0-9+-._]{0,}@[A-Za-z0-9+-._]{0,}[.][com|in]{2,3}$"));
        Matcher matemail = patemail.matcher(email);
        boolean d = matemail.matches();
        try {
            if (d) {
                System.out.println(d);
                System.out.println("email id is valid");
            } else {
                throw new InvalidUserInput("Exception occurs");
            }
        }catch (InvalidUserInput a){
            System.out.println("Enter an valid email id ");
            isvalidemail();
        }

    }
    public void isvalidphoneneumber () throws InvalidUserInput {
        System.out.println("Enter your phone number");
        Scanner phone = new Scanner(System.in);
        String phonenum = phone.nextLine();
        boolean pattern = phonenum.matches("^[91]{2}[0-9]{10}$");
        try{
         if (pattern == true) {
             System.out.println("valid phone number");
         } else {
             throw new InvalidUserInput("Exception occurs");
         }
        }catch (InvalidUserInput a){
            System.out.println("Please enter a valid phone-number");
            isvalidphoneneumber();
        }
    }
    public static void isvalidpassword() throws InvalidUserInput {
        System.out.println("Enter password");
        System.out.println(" Rule 1 : password must have atleast 8 characters");
        System.out.println("Rule 2:  password must have atleast 1 uppercase character ");
        System.out.println("Rule 3:  password must have atleast 1 numeric number");
        System.out.println("Rule4 : password must have exactly 1 Special Character");
        Scanner myinput = new Scanner(System.in);
        String pass = myinput.nextLine();
        Pattern password = Pattern.compile(("^(?=.*[a-z]){1,}(?=.*[A-Z]){1,}(?=.*[0-9]){1,}(?=.*[$@$!%*?&])[A-Za-z0-9$@$!%*?&]{5,}$"));
        Matcher m = password.matcher(pass);
        boolean b = m.matches();
        try {
            if (b) {
                System.out.println(b);
            } else {
                throw new InvalidUserInput("Exception occurs");
            }
        }catch (InvalidUserInput z){

            System.out.println("Please enter a valid password");
            isvalidpassword();
        }

    }
}


