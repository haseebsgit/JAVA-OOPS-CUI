import java.util.Scanner;
public class Account {
    private String accountId;
    private String cnic;

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    private String name;
    private int age;
    private double balance;

    public Account(String accountId){
        this.accountId=accountId;
    }
    public Account(String cnic, String name, int age){
        this.cnic = cnic;
        this.name = name;
        this.age = age;
    }
    public double createAccount(){

        if(age>35){
            this.balance = 0;
            System.out.println("Account balance is " + balance);
        } else if (age>20 ) {
            balance=50000;
            System.out.println("Account balance is " + balance);
        }
        else if (age<25 ) {
            this.balance=50000;
            System.out.println("Account balance is " + balance);
        }
        else if (age>25 ) {
            this.balance=25000;
            System.out.println("Account balance is " + balance);
        }
        else if (age<30 ) {
            this.balance=25000;
            System.out.println("Account balance is " + balance);
        }
        else if (age>30 ) {
            this.balance=10000;
            System.out.println("Account balance is " + balance);
        }
        else if (age<35 ) {
            this.balance=10000;
            System.out.println("Account balance is " + balance);
        }
        else if (age<20){
            System.out.println("No account created");
        }
        return balance;
    }

}
