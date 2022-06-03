package emailapp;

public class Email {

    // variable are kept private so that people cannot access it directly.
    private String firstName;
    private String lastName;
    private String password;
    private String Department;
    private int mailboxCapacity;
    private String alternateEmail;

    // Constructor to receive first name and last name
    public Email(String firstname, String lastname)
    {
        this.firstName = firstname;
        this.lastName = lastname;
        System.out.println("Name is " + this.firstName + " " + this.lastName);
    }

    // Generate a random password

    // Ask for the department

    // Set the mailbox capacity

    // Set the alternative email

    // Change the password

}
