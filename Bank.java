import java.util.Scanner;

class bankAcc {
    private final int accNum;
    private int balance;

    public bankAcc(int acNum, int startBalance){
        accNum = acNum;
        balance = startBalance;
    }
    public void dep(int amt){
        int curBal = balance + amt;
        balance = curBal;
    }
    public void wdraw(int amt){
        int curBal = balance - amt;
        balance = curBal;
    }
    public int bal(){
        return balance;
    }
    public String display(){
        return "Account number:"+accNum+" Current balance: "+balance;
    }
    public void transferAcc1Acc2(bankAcc destination, int amt){
        destination.balance = destination.balance+amt;
        this.balance = this.balance-amt;
    }
    public void transferAcc2Acc1(bankAcc destination, int amt){
        destination.dep(amt);
        this.wdraw(amt);
    }


}
public class Bank {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter account 1 number: ");
            int acc1num = input.nextInt();
            System.out.println("Enter account 1 balance: ");
            int acc1bal = input.nextInt();
            bankAcc acc1 = new bankAcc(acc1num,acc1bal);

            System.out.println("Enter account 2 number: ");
            int acc2num = input.nextInt();
            System.out.println("Enter account 2 balance: ");
            int acc2bal = input.nextInt();
            bankAcc acc2 = new bankAcc(acc2num,acc2bal);

            System.out.println("\t\t\t\"DEPOSITING\"\ntype \"1\" to deposit to account 1 or \"2\" to account 2 or 0 to see details");
            int depositChoice = input.nextInt();

            if(depositChoice==1){
                System.out.println("\t\t\t\"WITHDRAWING FROM ACCOUNT 2 TO ACCOUNT 1\"");
                System.out.println("Enter amount you want to Withdraw and send to Account 1");
                int enteredAmount = input.nextInt();
                if(enteredAmount > acc2.bal()){
                    System.out.println("\t\t\t\"INSUFFICIENT FUNDS\" \nAccount 2 has only: " +acc2.bal());
                }else {
                    acc2.transferAcc1Acc2(acc1, enteredAmount);
                    System.out.println("\t\t\t\"SUCCESSFUL TRANSFER\"\nNew Amount on Account 1: "+acc1.display());
                    System.out.println("New Amount on Account 2: "+acc2.display());
                }

            } else if (depositChoice==2) {
                System.out.println("\t\t\t\"WITHDRAWING FROM ACCOUNT 1 TO ACCOUNT 2\"");
                System.out.println("Enter amount you want to Withdraw and send to Account 2");
                int enteredAmount = input.nextInt();
                if(enteredAmount > acc1.bal()){
                    System.out.println("\t\t\t\"INSUFFICIENT FUNDS\" \nAccount 1 has only: " +acc1.bal());
                }else {
                    acc1.transferAcc1Acc2(acc2, enteredAmount);
                    System.out.println("\t\t\t\"SUCCESSFUL TRANSFER\"\nNew Amount on Account 2: "+acc2.display());
                    System.out.println("New Amount on Account 1: "+acc1.display());
                }

            }else {
                System.out.println("\t\t\tACCOUNTS DETAILS");
                System.out.println("Account 1:"+acc1.display());
                System.out.println("Account 2:"+acc2.display());
            }
    }
}
