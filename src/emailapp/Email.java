package emailapp;

import java.util.Scanner;

public class Email {

    // variable are kept private so that people cannot access it directly.
    private String firstName;
    private String lastName;
    private String password;
    private String Department;
    private int mailboxCapacity = 500;
    private String alternateEmail;

    // Constructor to receive first name and last name
    public Email(String firstname, String lastname)
    {
        this.firstName = firstname;
        this.lastName = lastname;
        System.out.println("Name is " + this.firstName + " " + this.lastName);

        this.Department = setDepartment();
        System.out.println("Department: " + this.Department);
        System.out.println("Mail Box capacity: " + setMailBoxCapacity() + " MB");
    }

    // Generate a random password

    // Ask for the department
    private String setDepartment()
    {
        System.out.println("Please enter the department code:\n1: Sales\n2: Development\n3: Accounting\n0: None");
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        if(code == 1)
            return "Sales";
        else if(code == 2)
            return "Development";
        else if (code == 3)
            return "Accounting";
        else
            return "None";
    }

    // Set the mailbox capacity
    private int setMailBoxCapacity()
    {
        return this.mailboxCapacity;
    }

    // Set the alternative email

    // Change the password

}
