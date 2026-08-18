class BankAccount{
    private String name;
    private int accountNumber;
    private double balance;

    public BankAccount(String name,int accountNumber,double balance){
        this.name=name;
        this.accountNumber=accountNumber;
        if(balance>0){
            this.balance=balance;
        }
        else{
            this.balance=0;
        }
    }

    public String getName(){
        return name;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setName(String name){
        this.name=name;
        System.out.println("Name Updated : "+name);
    }

    public void DisplayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }

    void Deposit(int amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited "+amount);
            System.out.println("Now the Balance is: "+balance);
        }
        else{
            System.out.println("Invalid Deposited");
        }
    }

    void Withdraw(int amount){
        if(amount>0 && amount<=balance){
            this.balance-=amount;
            System.out.println("Withdrawing "+amount);
            System.out.println("Now the Balance is: "+balance);
        }
    }
}

public class Main{
    public static void main(String [] args){
        BankAccount ba=new BankAccount("gowtham",12345,15000.00);
        System.out.println("--Display the initial account details--");
        ba.DisplayDetails();
        System.out.println("--Deposit some money--");
        ba.Deposit(5000);
        System.out.println("--Withdraw some money--");
        ba.Withdraw(2000);
        System.out.println("--Update Name--");
        ba.setName("Stark");
        System.out.println("--Display the final account details--");
        ba.DisplayDetails();

    }
}