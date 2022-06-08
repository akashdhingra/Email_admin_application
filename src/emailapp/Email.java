package emailapp;

import java.util.Locale;
import java.util.Scanner;

public class Email {

    // variable are kept private so that people cannot access it directly.
    private String firstName;
    private String lastName;
    private String password;
    private String Department;
    private int mailboxCapacity = 500;
    private String email;

    // Constructor to receive first name and last name
    public Email(String firstname, String lastname)
    {
        this.firstName = firstname;
        this.lastName = lastname;

        this.Department = setDepartment();
        System.out.println("Name: " + this.firstName + " " + this.lastName);
        System.out.println("Password: " + getPassword(10));

        email = this.firstName.toLowerCase() + this.lastName.toLowerCase() + "@" + this.Department.toLowerCase() + "company.com";
    }

    // Generate a random password

    private String getPassword(int passlength)
    {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
        char ch[] = new char[passlength];
        for (int i=0;i<passlength;i++)
        {
            int num = (int) (Math.random() * characters.length());
            ch[i] = characters.charAt(num);
        }
        return new String(ch);
    }

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
    public void setMailBoxCapacity(int capacity)
    {
        this.mailboxCapacity = capacity;
    }

    // Set the alternative email
    public void ChangeEmailID(String alternateID)
    {
        this.email= alternateID;
    }

    // Change the password
    public void changePassword(String pass)
    {
        this.password = pass;
    }

    public void showInfo()
    {
        System.out.println("Email ID : " + email);
        System.out.println("Department: " + this.Department);
        System.out.println("Mail Box capacity: " + this.mailboxCapacity + " MB");
    }

}
