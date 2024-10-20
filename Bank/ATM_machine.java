package Bank;

import java.util.Scanner;

//class Bank_account which stores or contents details of Account holder
class Bank_account{

    double account_balance = 0;

    //deposit method returns Account balance after deposit
    double deposit(double deposit){
        account_balance =  account_balance + deposit;
        return account_balance;
    }

    //withdraw method returns Account balance after withdrawal
    double withdraw(double ammount_to_be_withdrawn){
        account_balance = account_balance - ammount_to_be_withdrawn;
        return account_balance;
    }

    //this method returns account_balance
    double check_balance(){
        return account_balance;
    }
}

//class ATM_machine,this is actul ATM machine
public class ATM_machine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Scanner object is created

        Bank_account user = new Bank_account(); //created object of Bank_account class

        System.out.println("\nATM Machine:-\nOur Services\n");

        System.out.println("Press 1 to check balance\nPress 2 to deposit balance\nPress 3 to withdraw balance");
        int opted_service = sc.nextInt();

        double withdraw_ammount = 0;
        double deposit_ammount = 0;
        double account_balance = 0;

        while (opted_service != 4){

            //block for checking balance
            if (opted_service == 1){
                account_balance = user.check_balance();
                System.out.println("Balance = " + account_balance);
                System.out.println();
            }
            //deposit block
            else if (opted_service == 2) {
                System.out.print("Enter Ammount to be deposited : ");
                deposit_ammount = sc.nextDouble();
                if (deposit_ammount <= 0){                  //this checks if ammount is valid or not
                    System.out.println("Invalid Ammount.");
                }
                else {
                    account_balance = user.deposit(deposit_ammount);
                    System.out.println("Ammount is deposited.total balance is " + account_balance);
                    System.out.println();
                }
            }
            //withdrawal Block
            else{
                System.out.print("Enter Ammount to be withdrawn : ");
                withdraw_ammount = sc.nextDouble();
                if (withdraw_ammount <= 0){                  //this checks if ammount is valid or not
                    System.out.println("Invalid Ammount.\n");
                    System.out.println();
                }
                else{                                       //this block actually handles withdrawal
                    account_balance = user.check_balance(); //method called
                    if (account_balance < withdraw_ammount){
                        System.out.println("Insufficient Balance.Transaction Failed");
                        System.out.println();
                    }
                    else {
                        account_balance = user.withdraw(withdraw_ammount);       //withdraw method is called
                        System.out.println("Ammount is withdrawn.total balance is " + account_balance);
                        System.out.println();
                    }
                }
            }
            System.out.println("Press 1 to check balance\nPress 2 to deposit balance\nPress 3 to withdraw balance\nPress 4 to Exit\n");
            opted_service = sc.nextInt();     //this is for repeated services interface
        }
        System.out.println("Thank You for using our services.Good Day.");//this will be executed when loop gets terminated(when user presses 4)

        sc.close(); //closed the Scanner object
    }
}