public class EmailApp {
    public static void main(String[] args) {
        Email emi =new Email("Abhinav","Deodhar");
        emi.setMailboxCapacity(50.00);
        System.out.println(emi.showInfo());
        
        Email.closeScanner();
    }
}
