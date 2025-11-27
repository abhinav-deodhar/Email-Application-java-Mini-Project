import java.util.Random;
import java.util.Scanner;

public class Email {
        private String firstName;
        private String lastName;
        private String password;
        private String department;
        private double mailboxCapacity;
        private String alternateEmail;


        //Constructor to receive the first name and last name.

        public Email(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            System.out.println("Email Created: "+ firstName+" "+lastName);

            //Here we call department method that sets the department value
            this.department=setDepartment();
            System.out.println("Department: "+this.department);
            this.password=randomPassword(10); //Calling the function by giving the length as argument
            System.out.println("Temporary Password:"+password);
            //Printing the temporary password.

        }

        //Call a method that will return a random password
    //define a length for the random password
    private String  randomPassword(int length){
            String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghiklmnopqrstuvxyz01234567890!@#$%^&*()";

        StringBuilder password=new StringBuilder();
        Random random=new Random();

        for(int i=0;i<length;i++){ //Here it is the length of the password
             int index= random.nextInt(passwordSet.length()); //here we are taking the random character
            // from the string and saving its index
             password.append(passwordSet.charAt(index)); //Here we are appending the character at that index to the password variable.
        }
        return password.toString(); //returning the password string converted from string builder.


        }


        //Ask for the department code and then sets the department value.
        private String setDepartment(){
            System.out.println("DEPARTMENT CODES" +
                    "\n1 For Sales" +
                    "\n2 For Development" +
                    "\n3 For Accounting" +
                    "\n0 For None" +
                    "\nEnter the department ");
            Scanner in =new Scanner(System.in);
            int deptChoice=in.nextInt();
            if(deptChoice==1){
                return "Sales";
            }else if (deptChoice==2){
                return "Development";
            }else if (deptChoice==3){
                return "Accounting";
            }else {
                return "Null";
            }
        }




        //Generate the random password





        //set the mailbox capacity




        //Change the password
    }


