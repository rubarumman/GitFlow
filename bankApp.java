import java.util.Scanner;

public class Bank {
  static double balance = 0;

  public static void main(String[] args) {
will be added in hotfix
   // Scanner scanner = new Scanner(System.in);
    int option = 0;
    while (option != 4) {
      System.out.println("Welcome to the Bank of Java");
      System.out.println("1. Check Balance");
      System.out.println("2. Deposit"); // for bob
      System.out.println("3. Withdraw"); // for green
      System.out.println("4. Exit");
      System.out.print("Enter an option: ");
      option = scanner.nextInt();

      switch (option) {
        case 1:
          checkBalance();
          break;
        case 2:
          deposit();
          break;
        case 3:
          withdraw();
          break;
        case 4:
          exit();
          break;
        default:
          System.out.println("Invalid option. Try again.");
          break;
      }
    }
  }

  public static void checkBalance() {
    System.out.println("Your current balance is $" + balance);
  }
//for bob
  public static void deposit() {
  }
//for green
  public static void withdraw() {

  }

  public static void exit() {
    System.out.println("Thank you for banking with us. Have a great day!");
  }
}
