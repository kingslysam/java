import java.util.*;

class bankAccount{
    private final String accname;
    private final String acclname;
    private final long accnum;
    private long bal;
    private String pin;

    public bankAccount (String fname, String lname, long accountnum, long balance, String acpin){
        accname = fname+" "+lname;
        acclname = lname;
        accnum = accountnum;
        bal = balance;
        pin = acpin;
    }
    public void display(){
        System.out.println("\t\t\t\"Account Detail\"\n\t\t\tFull name:"+accname+"\n\t\t\tAccount Number:"+accnum+"\n\t\t\tCurrent Balance:"+bal);
    }
    public long getBal(){
        return bal;
    }
    public String getAccname(){
        return accname;
    }
    public String getAcclname(){
        return acclname;
    }
    public long getAccnum(){
        return accnum;
    }
    public String getPin(){
        return pin;
    }
    public void deposit(long amt){
        this.bal= this.bal+amt;
    }
    public void withdraw(long amt){
        this.bal = this.bal-amt;
    }

}
public class Bank2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t\t\t\"Creating Account 1\"\nEnter your First Name:");
        String fname = input.next();
        System.out.println("Enter your Last Name:");
        String lname = input.next();
        System.out.println("Enter your Bank Account Number:");
        long acnum = input.nextLong();
        System.out.println("Enter your starting balance:");
        long acbal = input.nextLong();
        System.out.println("Enter your pin number:");
        String acpin = input.next();
        bankAccount acc1 = new bankAccount(fname,lname,acnum,acbal,acpin);

        System.out.println("\n\n\t\t\t\"Creating Account 2\"\nEnter your First Name:");
        String fname1 = input.next();
        System.out.println("Enter your Last Name:");
        String lname1 = input.next();
        System.out.println("Enter your Bank Account Number:");
        long acnum1 = input.nextLong();
        System.out.println("Enter your starting balance:");
        long acbal1 = input.nextLong();
        System.out.println("Enter your pin number:");
        String acpin1 = input.next();
        bankAccount acc2 = new bankAccount(fname1,lname1,acnum1,acbal1,acpin1);


        System.out.println("\n\n\n\n\n\n\t\t\tWelcome to the Bank");
        boolean bankcheck = true;
        while (bankcheck){
            System.out.println("Enter your pin number:");
            String pin = input.next();
            if (Objects.equals(acc1.getPin(),pin)){
                System.out.println("\t\t\tWELCOME");
                acc1.display();
                boolean dwcheck = true;
                while (dwcheck) {
                    System.out.println("What do you want to do choose 1 for deposit and 2 for withdraw:");
                    int choice = input.nextInt();
                    if (choice == 1) {
                        System.out.println("\t\t\tDEPOSITING");
                        boolean depositcheck = true;
                        while (depositcheck) {
                            System.out.println("Enter the amount you want to deposit to your Account:");
                            long amount = input.nextLong();
                            if (amount > 0) {
                                acc1.deposit(amount);
                                System.out.println("Successful deposit, Your new balance is " + acc1.getBal()+"For" +
                                        "Account "+acc1.getAccname()+" "+acc1.getAccnum());
                                depositcheck = false;
                                bankcheck = false;
                                dwcheck = false;
                            } else {
                                System.out.println("Invalid amount make sure it's above 0");
                            }
                        }
                    } else if (choice == 2) {
                        System.out.println("\t\t\tWITHDRAWING");
                        boolean withdrawcheck = true;
                        while (withdrawcheck) {
                            System.out.println("Enter amount you want to withdraw from your Account:");
                            long amount = input.nextLong();
                            if (acc1.getBal() >= amount) {
                                acc1.withdraw(amount);
                                System.out.println("Successful withdraw, Your new balance is " + acc1.getBal()+"For" +
                                        "Account "+acc1.getAccname()+" "+acc1.getAccnum());
                                withdrawcheck = false;
                                bankcheck = false;
                                dwcheck = false;
                            } else {
                                System.out.println("Insufficient Funds, account balance is " + acc1.getBal());
                            }
                        }
                    }
                }

            } else if (Objects.equals(pin, acc2.getPin())) {
                System.out.println("\t\t\tWELCOME");
                acc2.display();
                boolean dwcheck = true;
                while (dwcheck) {
                    System.out.println("What do you want to do choose 1 for deposit and 2 for withdraw:");
                    int choice = input.nextInt();
                    if (choice == 1) {
                        System.out.println("\t\t\tDEPOSITING");
                        boolean depositcheck = true;
                        while (depositcheck) {
                            System.out.println("Enter the amount you want to deposit to your Account:");
                            long amount = input.nextLong();
                            if (amount > 0) {
                                acc2.deposit(amount);
                                System.out.println("Successful deposit, Your new balance is " + acc2.getBal()+"For" +
                                        "Account "+acc2.getAccname()+" "+acc2.getAccnum());
                                depositcheck = false;
                                bankcheck = false;
                                dwcheck = false;
                            } else {
                                System.out.println("Invalid amount make sure it's above 0");
                            }
                        }
                    } else if (choice == 2) {
                        System.out.println("\t\t\tWITHDRAWING");
                        boolean withdrawcheck = true;
                        while (withdrawcheck) {
                            System.out.println("Enter amount you want to withdraw from your Account:");
                            long amount = input.nextLong();
                            if (acc2.getBal() >= amount) {
                                acc2.withdraw(amount);
                                System.out.println("Successful withdraw, Your new balance is " + acc2.getBal()+"For" +
                                        "Account "+acc2.getAccname()+" "+acc2.getAccnum());
                                withdrawcheck = false;
                                bankcheck = false;
                                dwcheck = false;
                            } else {
                                System.out.println("Insufficient Funds, account balance has " + acc2.getBal());
                            }
                        }
                    }
                }
            }else {
                System.out.println("Invalid PIN Try again ");
            }
        }
    }
}
