import java.awt.*;

public class Main {
    public static void main(String[] args){

        // DECIMAL
        double price = 28.5;

        // INTEGER
        int year = 2026;

        // CHARACTERS
        char currency = '$';
        char symbol = '!';

       // STRING

       String name = "John Doe";
       String food = "feijoada";
       String email = "johndoe67@mail.com";
       String group = "twice";


        // BOOLEAN
        boolean isValid = true;
        boolean isFalse = false;

        //OUTPUT TERMINAL
        System.out.println("My name is " + name);
        System.out.println("I like " + food);
        System.out.println("my e-mail is " + email);
        System.out.println("my favorite group is " + group);

        if(isValid){
            System.out.println("this combo is available for " + currency + price);
        }else{
            System.out.println("this combo is unavailable");
        }

    }

}
