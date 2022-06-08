package emailapp;

import java.util.Scanner;

public class EmailApp{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter for first name: ");
        String firstname = sc.next();

        System.out.println("Please enter for last name: ");
        String lastname = sc.next();

        Email em1 = new Email(firstname,lastname);
        em1.showInfo();
        em1.getEmailID("check@gmail.com");


    }

}
