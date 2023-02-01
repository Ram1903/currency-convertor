import java.util.Scanner;
public class Atm{
    public static void main(String args[]){
        System.out.println("Welcome");
        int balance = 100000,withdraw,deposit;

        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Automated teller machine");
            System.out.println("choose 1 for withdraw");
            System.out.println("choose 2 for deposit");
            System.out.println("choose 3 for check balance");
            System.out.println("choose 4 for EXIT");
            System.out.println("choose the operation you want to do!");


            int choice = sc.nextInt();
            switch(choice)
            {
              case 1:
              System.out.print("Enter Money to be withrawn: ");

              withdraw = sc.nextInt();

              if(balance>=withdraw)
              {
                balance = balance-withdraw;
                System.out.println("please collect your Money");
              }else{
                System.out.println("Insufficient Balance");
              }
              System.out.println("");
              break;
              
             case 2:
              System.out.println("Enter money to be deposited");
              deposit = sc.nextInt();

              balance = balance+deposit;

              System.out.println("Your money has been successfully Deposited!");
              System.out.println("Available Balance: "+balance);
              System.out.println("");
              break;

              case 3:
              System.out.println("Balance "+balance);
              System.out.println("");
              break;

              case 4:
              System.exit(0);
            }
        }
    }
}