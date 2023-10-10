import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = scanner.nextInt();
        Account customer1 = new Account("3410122643379","Haseeb",30);
        System.out.println(customer1.createAccount());

    }
}
