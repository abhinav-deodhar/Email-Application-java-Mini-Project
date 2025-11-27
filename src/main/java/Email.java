import java.util.Random;
import java.util.Scanner;



public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private double mailboxCapacity;
    private int randomPasswordLength = 10;
    private String alternateEmail;
    private String companyName="indianarmy.in";
    private static final Scanner SCANNER = new Scanner(System.in);

    // Constructor to receive the first name and last name.

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created:");

        // Here we call department method that sets the department
        // value
        this.department = setDepartment();
        //System.out.println("Department: " + this.department);
        this.email=setEmail();
        //System.out.println("\nYour email Id is: "+this.email);
        this.password = randomPassword(randomPasswordLength); // Calling the function by giving
        // the length as argument
       // System.out.println("\nYour temporary password is:" + this.password);
        // Printing the temporary password.
    }



    /***********************PASSWORD GENERATION******************************************/
    // Generate the random password
    // Call a method that will return a random password
    // define a length for the random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghiklmn"
                + "opqrstuvxyz01234567890!@#$%^&*()";

        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length;
             i++) { // Here it is the length of the password
            int index = random.nextInt(
                    passwordSet.length()); // here we are taking the
            // random character
            // from the string and saving its index
            password.append(passwordSet.charAt(
                    index)); // Here we are appending the character
            // at that index to the password
            // variable.
        }
        return password.toString(); // returning the password string
        // converted from string builder.
    }

    /***********************END HERE PASSWORD GENERATION******************************************/





//**********************************Department Name**********************************************
    // Ask for the department code and then sets the department value.
    private String setDepartment() {
        System.out.println(firstName+", Enter the department code"
                + "\n1 For Sales"
                + "\n2 For Development"
                + "\n3 For Accounting"
                + "\n0 For None"
                + "\nHere -> ");

        int deptChoice =SCANNER.nextInt();

        if (deptChoice == 1) {
            return "Sal";
        } else if (deptChoice == 2) {
            return "Dev";
        } else if (deptChoice == 3) {
            return "Acc";
        } else {
            return null;
        }

    }
    //**********************************Department Name**********************************************




    /***********************************Email Generation******************************************/

    private String setEmail(){
        if(department==null || department.equals("NULL")){
            return firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+companyName.toLowerCase();
        }else{
            return firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department.toLowerCase()+"."+
                    companyName.toLowerCase();

        }
    }
    /********************************END HERE Email Generation*************************************/


    /********************************MailBox Capacity*************************************/
    // set the mailbox capacity
    public void setMailboxCapacity(double capacity){
        this.mailboxCapacity=capacity;
    }

    // Change the password
    public void setPassword(String password){
        this.password=password;
    }

    public double getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String showInfo(){
        return "\n \nDisplay Name: "+ firstName+" "+lastName+"\n"+
                "Department: "+department+'\n'+
                "Company Email: "+email+"\n"+
                "Temporary Password: "+password+"\n"+
                "MailBox Capacity:"+mailboxCapacity+" GB";
    }

    public static void closeScanner(){
        SCANNER.close();
}

}
