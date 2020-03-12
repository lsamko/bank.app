package bankAccountApp;

public abstract class Account implements IBaseRate {
    //List common properties for saving and checking accounts
    private String name;
    private String secNumber;
    private double balance;
    private static int index = 10000;
    protected String accountNumber;
    protected double rate;

    //Constructor to set base properties and initialize an account
    public Account(String name, String secNumber, double initDeposit) {
        this.name = name;
        this.secNumber = secNumber;
        balance = initDeposit;

        //Set account number
        index++;
        this.accountNumber = setAccountNumber();
        setRate();
    }

    public  abstract  void setRate();

    private String setAccountNumber() {
        String lastTwoOfSSN = secNumber.substring(secNumber.length() - 2, secNumber.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance = balance+accruedInterest;
        System.out.println("Accrued Interest: %" + accruedInterest);
        printBalance();
    }

    // List common methods -transactions
    public  void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }
    public  void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawing $" + amount);
        printBalance();
    }
    public  void transfer(String toWhere, double amount){
        balance = balance + amount;
        System.out.println("Tranfering $" + amount + " to " + toWhere);
        printBalance();
    }

public void printBalance(){
    System.out.println("Your balance is: $" + balance);
}
    public void showInfo(){
        System.out.println(
                "Name: " + name +
                        "\nAccount number: " + accountNumber +
                        "\nBalance: " + balance +
                        "\nRate: " +rate + "%"
        );
    }
}
